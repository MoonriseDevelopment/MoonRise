package proclient.module.movement;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;

public class AutoWalk extends Module{

	public AutoWalk() {
		super("AutoWalk", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
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