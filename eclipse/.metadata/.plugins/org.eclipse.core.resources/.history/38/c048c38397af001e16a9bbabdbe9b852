package proclient.module.misc;

import java.util.ArrayList;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemFood;
import net.minecraft.network.play.client.C03PacketPlayer;
import proclient.event.events.EventUpdate;
import proclient.module.Category;
import proclient.module.Module;

public class FastEat extends Module {

	public FastEat() {
		super("FastEat", KeyboardConstants.KEY_NONE, Category.MISC);
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