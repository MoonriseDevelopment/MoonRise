package proclient.module.movement;


import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import proclient.Dragon;
import proclient.event.Event;
import proclient.event.events.EventSafewalk;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;

import java.util.ArrayList;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;


public class SafeWalk extends Module {
    private final Setting mode = new Setting("Mode", this, "NoSneak", "Sneak");
    public SafeWalk() {
        super("SafeWalk", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
        addAll(mode);
    }
    
    public void onUpdate() {
        if(this.isToggled()) {
        if(mode.getMode().equals("Sneak")){
        if (Minecraft.getMinecraft().thePlayer != null && mc.theWorld != null) {
            final Minecraft mc2 = mc;
            final double posX = Minecraft.getMinecraft().thePlayer.posX;
            final Minecraft mc3 = mc;
            final double y = Minecraft.getMinecraft().thePlayer.posY - 1.0;
            final Minecraft mc4 = mc;
            final BlockPos BP = new BlockPos(posX, y, Minecraft.getMinecraft().thePlayer.posZ);
            if (mc.theWorld.getBlockState(BP).getBlock() == Blocks.air) {
                mc.gameSettings.keyBindSneak.pressed = true;
            }
            else {
                mc.gameSettings.keyBindSneak.pressed = false;
            }
        }
    }
}
}
    @Override
    public void onEvent(Event e) {
        if(mode.getMode().equals("NoSneak")) {
            mc.gameSettings.keyBindSneak.pressed = false;
            if(e instanceof EventSafewalk && e.isPre())
            e.setCancelled(true);
     }
}
    
    @Override
    public void onEnable() {
        super.onEnable();
    }
    
    @Override
    public void onDisable() {
        if(mode.getMode().equals("Sneak")) {
            mc.gameSettings.keyBindSneak.pressed = false;
        }
    }
}