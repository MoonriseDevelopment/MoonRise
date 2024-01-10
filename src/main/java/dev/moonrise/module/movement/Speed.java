package dev.moonrise.module.movement;

import dev.moonrise.MoonRise;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;

public class Speed extends Module{
    public Speed() {
		super("Speed", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.onGround) {
				mc.thePlayer.motionX *= 3.0;
				mc.thePlayer.motionZ *= 3.0;
			}
		}
	}
}
