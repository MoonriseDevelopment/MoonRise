package dev.moonrise.module.movement;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;

public class JetPack extends Module{

	public JetPack() {
		super("Jetpack", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.gameSettings.keyBindJump.pressed) {
				mc.thePlayer.jump();
			}
		}
	}

}