package dev.moonrise.module.misc;

import org.lwjgl.input.Keyboard;
import dev.moonrise.MoonRise;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class PingSpoofer extends Module {	
	public PingSpoofer() {
		super("Ping Spoofer", Keyboard.KEY_NONE, Category.MISC);
	}
	
	public double getPing() {
		return mc.theWorld != null ? 10000 : -1;
	}

}