package proclient.module.render;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import proclient.module.Category;
import proclient.module.Module;

public class NoWeather extends Module {
    public NoWeather() {
        super("NoWeather", KeyboardConstants.KEY_NONE, Category.RENDER);
    }

    public void onUpdate() {
        if(this.isToggled()) {
            mc.theWorld.setThunderStrength(0);
            mc.theWorld.setRainStrength(0);
        }
    }
    
}
