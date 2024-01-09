package dev.moonrise.util.player;

import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;

public final class PacketUtil {

    public static void sendPacket(final Packet<?> packet) {
    	Minecraft.getMinecraft().getNetHandler().addToSendQueue(packet);
    }

    public static void sendPacketWithoutEvent(final Packet<?> packet) {
    	Minecraft.getMinecraft().getNetHandler().addToSendQueueWithoutEvent(packet);
    }

    public static void receivePacket(final Packet<?> packet) {
    	Minecraft.getMinecraft().getNetHandler().addToReceiveQueue(packet);
    }

    public static void receivePacketWithoutEvent(final Packet<?> packet) {
    	Minecraft.getMinecraft().getNetHandler().addToReceiveQueueWithoutEvent(packet);
    }
}
