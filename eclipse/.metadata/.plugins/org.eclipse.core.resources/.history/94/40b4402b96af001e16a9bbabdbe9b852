package proclient.module.movement;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;

public class JetPack extends Module{

	public JetPack() {
		super("Jetpack", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
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