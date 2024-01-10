package dev.moonrise.module.movement;

import org.lwjgl.input.Keyboard;
import dev.moonrise.module.Module;
import dev.moonrise.module.Category;

public class AutoSprint extends Module{
	
	public AutoSprint(){
		super("AutoSprint", Keyboard.KEY_RCONTROL,Category.MOVEMENT);
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