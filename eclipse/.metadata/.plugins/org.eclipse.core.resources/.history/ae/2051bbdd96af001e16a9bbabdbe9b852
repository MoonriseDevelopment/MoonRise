package proclient.module.movement;

import proclient.Dragon;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;

public class Speed extends Module{
    public Speed() {
		super("Speed", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
		Dragon.setmgr.rSetting(new Setting("Speed", this, 3.0, 1.0, 3.0, false));
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.onGround) {
				mc.thePlayer.motionX *= Dragon.setmgr.getSettingByName("Speed").getValDouble();
				mc.thePlayer.motionZ *= Dragon.setmgr.getSettingByName("Speed").getValDouble();
			}
		}
	}
}
