package dev.moonrise.module.movement;

import dev.moonrise.event.events.EventMotion;
import dev.moonrise.event.events.EventMove;
import dev.moonrise.event.events.EventReceivePacket;
import dev.moonrise.module.Module;
import dev.moonrise.module.Category;
import dev.moonrise.util.math.TimeUtil;
import dev.moonrise.util.pathfinding.MainPathFinder;
import dev.moonrise.util.pathfinding.Vec3;
import dev.moonrise.util.player.PacketUtil;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.util.BlockPos;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

public final class ClickTP extends Module {
	
    public ClickTP() {
        super("ClickTP", Keyboard.KEY_H, Category.MOVEMENT);
    }

    private boolean countTicks, startTeleport;
    private double tpX, tpY, tpZ;
    private int ticks;

    private final TimeUtil timer = new TimeUtil();

    public void onPreMotion(final EventMotion event) {
        // Checking if the use item button is down and that the delay has been reached.
        if (mc.gameSettings.keyBindUseItem.isKeyDown() && timer.hasReached(500L)) {
            // Creating a variable that gets the block that the user is looking at and creating another variable with incremented Y position of the position so that the user teleports on top of the block.
            final BlockPos pos = mc.thePlayer.rayTrace(999, 1).getBlockPos();
            final BlockPos tpPos = pos.up();

            // Checking if the block at the position is air and returning and checking if the teleport position isn't air and returning if it isn't.
            if (mc.theWorld.getBlockState(pos).getBlock() instanceof BlockAir || !(mc.theWorld.getBlockState(tpPos).getBlock() instanceof BlockAir))
                return;
            
                    tpX = tpPos.getX();
                    tpY = tpPos.getY();
                    tpZ = tpPos.getZ();
                    startTeleport = true;

            // Resetting the teleport delay timer.
            timer.reset();
        }

        if (startTeleport) {

            event.setX(mc.thePlayer.posX);
            event.setY(mc.thePlayer.posY + 1);
            event.setZ(mc.thePlayer.posZ);

            if (countTicks && ticks == 1) {
                // Getting the path to teleport along.
                final ArrayList<Vec3> path = MainPathFinder.computePath(new Vec3(mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ),
                        new Vec3(tpX, tpY, tpZ));

                // Teleporting along the path to the block.
                for (final Vec3 point : path)
                    PacketUtil.sendPacket(new C03PacketPlayer.C04PacketPlayerPosition(point.getX(), point.getY(), point.getZ(), true));

                PacketUtil.sendPacket(new C03PacketPlayer.C04PacketPlayerPosition(tpX, tpY, tpZ + 0.1, true));
                PacketUtil.sendPacket(new C03PacketPlayer.C04PacketPlayerPosition(tpX, tpY, tpZ - 0.1, true));
            } else if (countTicks && ticks > 1) {
                event.setX(tpX);
                event.setY(tpY + 1);
                event.setZ(tpZ);
            }
        }

        if (countTicks)
            ticks++;
    }


    public void onPacketReceive(EventReceivePacket event) {
        Packet p = event.getPacket();

        if (p instanceof S08PacketPlayerPosLook && mc.thePlayer.ticksExisted > 20) {
            S08PacketPlayerPosLook s08 = ((S08PacketPlayerPosLook) p);
            if (mc.thePlayer.getDistanceSq(s08.getX(), s08.getY(), s08.getZ()) < 2 * 2) {
                event.setCancelled(true);
                countTicks = true;
            } else {
                countTicks = false;
                ticks = 0;
                startTeleport = false;
            }
        }
    }

    public void onEnable() {
        countTicks = false;
        ticks = 0;
        startTeleport = false;

        tpX = mc.thePlayer.posX;
        tpY = mc.thePlayer.posY;
        tpZ = mc.thePlayer.posZ;
    }
}
