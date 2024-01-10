package dev.moonrise.module.misc;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemFood;
import net.minecraft.network.play.client.C03PacketPlayer;
import dev.moonrise.event.events.EventUpdate;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

public class FastEat extends Module {

	public FastEat() {
		super("FastEat", Keyboard.KEY_NONE, Category.MISC);
	}
	
	public void onUpdate(EventUpdate event) {
        	if(Minecraft.getMinecraft().thePlayer.isEating()) {
				Minecraft.getMinecraft().timer.timerSpeed = 1.5F;
			}else if (!Minecraft.getMinecraft().thePlayer.isEating()){
				Minecraft.getMinecraft().timer.timerSpeed = 1.0F;
			}
    }
	
	@Override
	public void onEnable() {
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		Minecraft.getMinecraft().thePlayer.stepHeight = 0.6f;
		Minecraft.getMinecraft().timer.timerSpeed = 1.0F;
		super.onDisable();
	}

}