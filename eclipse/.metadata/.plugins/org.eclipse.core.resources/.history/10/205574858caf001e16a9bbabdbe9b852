package proclient.module.render;

import java.awt.Color;
import java.util.ArrayList;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.util.EnumParticleTypes;
import proclient.Dragon;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;

public class Trails extends Module {
    private final Setting type = new Setting("Type", this, "Heart", "Lava", "Smoke", "Cloud", "Flame", "Slime", "Water", "Firework");
    public Trails() {
        super("Trails", KeyboardConstants.KEY_NONE, Category.RENDER);
        addAll(type);
    }

    public void onUpdate() {
        String mode = Dragon.setmgr.getSettingByName("Type").getMode();
        if(this.isToggled()) {
        if (mc.thePlayer.isMoving()) {
            if(mode.equalsIgnoreCase("Heart")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.HEART);
            } else if(mode.equalsIgnoreCase("Lava")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.LAVA);
            } else if(mode.equalsIgnoreCase("Smoke")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.REDSTONE);
            } else if(mode.equalsIgnoreCase("Cloud")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.CLOUD);
            } else if(mode.equalsIgnoreCase("Flame")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.FLAME);
            } else if(mode.equalsIgnoreCase("Slime")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.SLIME);
            } else if(mode.equalsIgnoreCase("Water")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.WATER_SPLASH);
            } else if(mode.equalsIgnoreCase("FireWork")) {
                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.FIREWORKS_SPARK);
            }
        }
    }
    }
}