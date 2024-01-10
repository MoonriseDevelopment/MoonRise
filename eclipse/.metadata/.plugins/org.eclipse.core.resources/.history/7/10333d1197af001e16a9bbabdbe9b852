package proclient.module.movement;

import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;
import proclient.module.Category;

public class Spider extends Module {

	public Spider() {
		super("Spider", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
	}

	@Override
	public void onUpdate() {
        if(this.isToggled()) {
		if (Minecraft.getMinecraft().thePlayer.isCollidedHorizontally)
            Minecraft.getMinecraft().thePlayer.motionY = 0.2;
	    }
    }
}