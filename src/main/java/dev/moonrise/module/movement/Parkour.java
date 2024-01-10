package dev.moonrise.module.movement;


import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;
import net.minecraft.entity.Entity;

public class Parkour extends Module {
	public Parkour() {
		super("Parkour", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.onGround && !mc.thePlayer.isSneaking() && !this.mc.gameSettings.keyBindSneak.pressed &&
					this.mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0D, -0.5D, 0.0D).expand(-0.001D, 0.0D, -0.001D)).isEmpty())
				mc.thePlayer.jump();
		}
	}

}