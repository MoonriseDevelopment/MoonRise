package dev.moonrise.module.render;

import org.lwjgl.input.Keyboard;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class NoWeather extends Module {
    public NoWeather() {
        super("NoWeather", Keyboard.KEY_NONE, Category.RENDER);
    }

    public void onUpdate() {
        if(this.isToggled()) {
            mc.theWorld.setThunderStrength(0);
            mc.theWorld.setRainStrength(0);
        }
    }
    
}
