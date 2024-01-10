package dev.moonrise.module.movement;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;

public class Dolphin extends Module{

	public Dolphin() {
		super("Dolphin", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.isInWater()) {
				mc.thePlayer.motionY += 0.04;
			}
		}
	}

}