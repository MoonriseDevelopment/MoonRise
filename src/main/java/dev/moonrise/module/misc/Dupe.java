package dev.moonrise.module.misc;


import org.lwjgl.input.Keyboard;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

import java.util.Random;

public class Dupe extends Module {
    public Dupe() {
        super("Duper", Keyboard.KEY_NONE, Category.MISC);
    }

    private final Random random = new Random();

    public void onEnable() {
        EntityPlayerSP player = mc.thePlayer;
        WorldClient world = mc.theWorld;

        int count = random.nextInt(31) + 1;

        for (int i = 0; i <= count; i++) {
            ItemStack itemStack = mc.thePlayer.getHeldItem();
            EntityItem entityItem = mc.thePlayer.dropItem(itemStack.copy(), false, true);
            if (entityItem != null) mc.theWorld.addEntityToWorld(entityItem.getEntityId(), entityItem);

        }
    }
}