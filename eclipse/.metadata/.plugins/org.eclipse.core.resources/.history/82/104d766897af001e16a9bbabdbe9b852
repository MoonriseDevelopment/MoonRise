package proclient.module.misc;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
public class AutoRespawn extends Module{

	public AutoRespawn() {
		super("AutoRespawn", KeyboardConstants.KEY_NONE, Category.MISC);
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