package dev.moonrise.module.movement;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;

public class Bhop extends Module{

	public Bhop() {
		super("Bhop", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindJump.pressed = false;
		super.onDisable();
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindJump.pressed = true;
		}
	}

}