package dev.moonrise.module.movement;

import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import dev.moonrise.module.Category;

public class Spider extends Module {

	public Spider() {
		super("Spider", Keyboard.KEY_NONE, Category.MOVEMENT);
	}

	@Override
	public void onUpdate() {
        if(this.isToggled()) {
		if (Minecraft.getMinecraft().thePlayer.isCollidedHorizontally)
            Minecraft.getMinecraft().thePlayer.motionY = 0.2;
	    }
    }
}