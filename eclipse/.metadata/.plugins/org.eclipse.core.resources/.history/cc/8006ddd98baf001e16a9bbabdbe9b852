package proclient.module.render;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import proclient.module.Module;
import proclient.module.Category;

public class Fullbright extends Module{

    public Fullbright(){
        super("Fullbright", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

    public void onEnable() {
        mc.gameSettings.gammaSetting = 100f;
    }

    public void onDisable(){
		mc.gameSettings.gammaSetting = 0f;
	}

}