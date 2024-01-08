package dev.moonrise.module.movement;

import org.lwjgl.input.Keyboard;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class Fly extends Module {
    public Fly() {
        super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
    }
    public boolean isAlreadyEnabled;
    
    public void onUpdate() {
        if(this.isToggled()) {
        	if (!isAlreadyEnabled) {
		        mc.thePlayer.capabilities.isFlying = true;
		        mc.thePlayer.capabilities.allowFlying = true;
		        isAlreadyEnabled = true;
        	} 
        }
    }

    public void onDisable() {
    	isAlreadyEnabled = false;
        mc.thePlayer.capabilities.isFlying = false;
        mc.thePlayer.capabilities.allowFlying = false;
    }
}
