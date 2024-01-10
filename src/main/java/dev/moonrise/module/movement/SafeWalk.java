package dev.moonrise.module.movement;


import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import dev.moonrise.MoonRise;
import dev.moonrise.event.Event;
import dev.moonrise.event.events.EventSafewalk;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.Minecraft;


public class SafeWalk extends Module {
    public SafeWalk() {
        super("SafeWalk", Keyboard.KEY_NONE, Category.MOVEMENT);
    }
    
    public void onUpdate() {
	}
    public void onEvent(Event e) {
            mc.gameSettings.keyBindSneak.pressed = false;
            if(e instanceof EventSafewalk && e.isPre())
            e.setCancelled(true);
}
    
    @Override
    public void onEnable() {
        super.onEnable();
    }
    
    @Override
    public void onDisable() {
    }
}