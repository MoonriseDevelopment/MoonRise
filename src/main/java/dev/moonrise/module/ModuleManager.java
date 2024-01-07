package dev.moonrise.module;

import java.util.ArrayList;

import dev.moonrise.MoonRise;
import dev.moonrise.module.movement.*;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class ModuleManager {

    public static ArrayList<Module> mods;

    public ModuleManager() {
        mods = new ArrayList<Module>();
        //COMBAT
 


        //MOVEMENT
        newMod(new Fly());


        //PLAYER


        //RENDER



        //MISC

    }

    public static void newMod(Module m) {
        mods.add(m);
    }

    public static ArrayList<Module> getModules() {
        return mods;
    }

    public static void onUpdate() {
        for(Module m : mods) {
            m.onUpdate();
        }
    }

    public static void onRender() {
        for(Module m : mods) {
            m.onRender();
        }
    }

    public static void onKey(int k) {
        for(Module m : mods) {
            if(m.getKey() == k) {
                m.toggle();
            }
        }
    }

    public ArrayList<Module> modsInCategory(Category c){
        ArrayList<Module> inCategory = new ArrayList<>();
        for(Module m : this.mods){
            if(m.category == c)
                inCategory.add(m);
        }
        return inCategory;
    }

	public void addChatMessage(String message) {
		message = "\2479" + MoonRise.name + "\2477: " + message;
		
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(message));
	}
    
}
