package proclient.module.movement;


import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.entity.Entity;

public class Parkour extends Module {
	public Parkour() {
		super("Parkour", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.onGround && !mc.thePlayer.isSneaking() && !this.mc.gameSettings.keyBindSneak.pressed &&
					this.mc.theWorld.getCollidingBoundingBoxes((Entity)mc.thePlayer, mc.thePlayer.getEntityBoundingBox().offset(0.0D, -0.5D, 0.0D).expand(-0.001D, 0.0D, -0.001D)).isEmpty())
				mc.thePlayer.jump();
		}
	}

}