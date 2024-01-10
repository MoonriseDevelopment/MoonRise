package dev.moonrise.module.movement;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;

public class AutoWalk extends Module{

	public AutoWalk() {
		super("AutoWalk", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			mc.gameSettings.keyBindForward.pressed = true;
		}
	}
	@Override
	public void onDisable() {
		mc.gameSettings.keyBindForward.pressed = false;
		super.onDisable();
	}

}