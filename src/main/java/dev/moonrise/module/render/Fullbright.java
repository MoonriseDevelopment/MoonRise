package dev.moonrise.module.render;

import org.lwjgl.input.Keyboard;
import dev.moonrise.module.Module;
import dev.moonrise.module.Category;

public class Fullbright extends Module{

    public Fullbright(){
        super("Fullbright", Keyboard.KEY_F, Category.RENDER);
    }

    public void onEnable() {
        mc.gameSettings.gammaSetting = 100f;
    }

    public void onDisable(){
		mc.gameSettings.gammaSetting = 0f;
	}

}