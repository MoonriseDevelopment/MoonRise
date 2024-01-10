package proclient.module.movement;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;

public class Dolphin extends Module{

	public Dolphin() {
		super("Dolphin", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
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