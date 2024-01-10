package proclient.module.misc;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import proclient.Dragon;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;

public class PingSpoofer extends Module {	
	public PingSpoofer() {
		super("Ping Spoofer", KeyboardConstants.KEY_NONE, Category.MISC);
		Dragon.setmgr.rSetting(new Setting("Ping", this, 300, 1, 10000, true));
	}
	
	public double getPing() {
		return mc.theWorld != null ? Dragon.setmgr.getSettingByName("Ping").getValDouble() : -1;
	}

}