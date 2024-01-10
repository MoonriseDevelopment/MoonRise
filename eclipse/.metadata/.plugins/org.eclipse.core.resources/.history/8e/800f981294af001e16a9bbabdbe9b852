package proclient.module.movement;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import proclient.module.Module;
import proclient.module.Category;

public class AutoSprint extends Module{
	
	public AutoSprint(){
		super("AutoSprint", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
	}
	
	public void onEnable(){
		if((isToggled()) && (!this.mc.thePlayer.isCollidedHorizontally) && (this.mc.thePlayer.moveForward != 0.0F)){
			this.mc.thePlayer.setSprinting(true);
		}
	}
	
	public void onDisable(){
		mc.thePlayer.setSprinting(false);
	}

}