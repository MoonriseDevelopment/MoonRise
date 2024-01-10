package dev.moonrise.module.render;

import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import net.minecraft.util.EnumParticleTypes;
import dev.moonrise.MoonRise;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class Trails extends Module {
    public Trails() {
        super("Trails", Keyboard.KEY_Y, Category.RENDER);
    }

    public void onUpdate() {
        if(this.isToggled()) {
	        if (mc.thePlayer.isMoving()) {
	                mc.effectRenderer.emitParticleAtEntity(mc.thePlayer, EnumParticleTypes.HEART);
	        }
        }
    }
}