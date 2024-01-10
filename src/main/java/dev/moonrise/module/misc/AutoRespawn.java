package dev.moonrise.module.misc;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;
public class AutoRespawn extends Module{

	public AutoRespawn() {
		super("AutoRespawn", Keyboard.KEY_NONE, Category.MISC);
	}
	
	@Override
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.isDead) {
				mc.thePlayer.respawnPlayer();
			}
		}
	}

}