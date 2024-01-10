package proclient.module.movement;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;

public class Bhop extends Module{

	public Bhop() {
		super("Bhop", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
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