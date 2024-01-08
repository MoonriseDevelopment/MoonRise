package dev.moonrise;

import org.lwjgl.opengl.Display;

import dev.moonrise.command.CommandManager;
import dev.moonrise.module.ModuleManager;

public class MoonRise {
    
    public static String name = "MoonRise", version = "1";
    public static ModuleManager moduleManager;
    public static CommandManager cmdManager;
    public static void init() {
        System.out.println("-----------Starting MoonRise" + " B" + version + "-----------");
        Display.setTitle(name + " B" + version);
        moduleManager = new ModuleManager();
        cmdManager = new CommandManager();
        
    }
}
