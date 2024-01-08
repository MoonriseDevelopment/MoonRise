package dev.moonrise.command.commands;

import dev.moonrise.MoonRise;
import dev.moonrise.command.Command;
import net.minecraft.client.Minecraft;

public class Help extends Command {
    public Help() {
        super("Help", "Shows all commands", "Help", "help");
    }

	@Override
	public void onCommand(String[] args, String command) {
		if (args.length == 0) {
			MoonRise.moduleManager.addChatMessage("---MoonRise Commands---");
			MoonRise.moduleManager.addChatMessage(".help - shows this");
			MoonRise.moduleManager.addChatMessage(".vclip <distance> - vclips you through blocks");
			MoonRise.moduleManager.addChatMessage("----------------------");
			return;
		}
	}

    
    
}