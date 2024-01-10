package proclient.util;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;

public class PacketUtil {

    public static Minecraft mc = Minecraft.getMinecraft();

    public static void sendPacket(Packet packet){
        mc.getNetHandler().addToSendQueue(packet);
    }
}