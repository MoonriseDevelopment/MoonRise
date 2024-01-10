package proclient.module.movement;

import proclient.module.Category;
import proclient.module.Module;
import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.minecraft.network.play.client.C03PacketPlayer;

public class NoFall extends Module{

	public NoFall() {
		super("Nofall", KeyboardConstants.KEY_NONE, Category.MOVEMENT);
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