package proclient.util;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.Minecraft;

public class PlayerUtils1
{
    public static boolean aacdamage;
    public static double aacdamagevalue;
    public static Minecraft mc;
    
    static {
        PlayerUtils1.aacdamage = false;
    }
    
    public static void damagePlayer(final double value) {
        PlayerUtils1.aacdamage = true;
        PlayerUtils1.aacdamagevalue = value + 2.85;
        Minecraft.getMinecraft();
        final EntityPlayerSP thePlayer = Minecraft.getMinecraft().thePlayer;
        ++thePlayer.moveForward;
        Minecraft.getMinecraft();
        final EntityPlayerSP thePlayer2 = Minecraft.getMinecraft().thePlayer;
        --thePlayer2.moveForward;
        Minecraft.getMinecraft();
        final EntityPlayerSP thePlayer3 = Minecraft.getMinecraft().thePlayer;
        --thePlayer3.moveStrafing;
        Minecraft.getMinecraft();
        final EntityPlayerSP thePlayer4 = Minecraft.getMinecraft().thePlayer;
        ++thePlayer4.moveStrafing;
        Minecraft.getMinecraft();
        Minecraft.getMinecraft().thePlayer.jump();
    }
    
    public static boolean playeriswalking() {
        return mc.gameSettings.keyBindForward.pressed || mc.gameSettings.keyBindBack.pressed || mc.gameSettings.keyBindLeft.pressed || mc.gameSettings.keyBindRight.pressed;
    }
    
    public static boolean playeriswalkingforward() {
        return !mc.gameSettings.keyBindBack.pressed && !mc.gameSettings.keyBindLeft.pressed && !mc.gameSettings.keyBindRight.pressed && mc.gameSettings.keyBindForward.pressed;
    }
    
    public static void sendPosition(final double x, final double y, final double z, final boolean onGround) {
        Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(x, y, z, onGround));
    }
    
    public static void sendGround(final boolean onGround) {
        Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(onGround));
    }
}