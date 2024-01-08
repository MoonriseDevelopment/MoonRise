package dev.moonrise.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.moonrise.MoonRise;
import dev.moonrise.command.commands.*;
import dev.moonrise.event.events.EventChat;

public class CommandManager {

    public static List<Command> commands = new ArrayList<Command>();
    public static String prefix = ".";

    public CommandManager() {
        setup();
    }

    public void setup() {
        commands.add(new Help());
    }

    public static List<Command> getCommands() {
        return commands;
    }

    public static void handleChat(EventChat event) {
        String message = event.getMessage();

        if(!message.startsWith(prefix))
            return;

        event.setCancelled(true);

        message = message.substring(prefix.length());

        boolean foundCommand = false;

        if(message.split(" ").length > 0) {
            String commandName = message.split(" ")[0];

            for(Command c : commands) {
                if(c.aliases.contains(commandName) || c.name.equalsIgnoreCase(commandName)) {
                    c.onCommand(Arrays.copyOfRange(message.split(" "), 1, message.split(" ").length), message);
                    foundCommand = true;
                    break;
                }
            }
        }
        if(!foundCommand) {
            MoonRise.moduleManager.addChatMessage("command not found!");
        }
    }
    
}