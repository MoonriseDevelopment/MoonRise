package dev.moonrise.module.movement;

import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import org.lwjgl.input.Keyboard;
import net.minecraft.network.play.client.C03PacketPlayer;

public class NoFall extends Module{

	public NoFall() {
		super("Nofall", Keyboard.KEY_NONE, Category.MOVEMENT);
	}
	
	public void onUpdate() {
		if(this.isToggled()) {
			if(mc.thePlayer.fallDistance > 2f) {
				mc.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
			}
			super.onUpdate();
		}
	}
}