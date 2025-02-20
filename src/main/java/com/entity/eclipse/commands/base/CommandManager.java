package com.entity.eclipse.commands.base;

import com.entity.eclipse.commands.*;

import java.util.ArrayList;

public class CommandManager {
    private static final ArrayList<Command> commands = new ArrayList<>();

    static {
        commands.add(new Bind());
        commands.add(new Binds());
        commands.add(new Config());
        commands.add(new Disable());
        commands.add(new Dupe());
        commands.add(new Enable());
        commands.add(new HClip());
        commands.add(new Help());
        commands.add(new Modules());
        commands.add(new Panic());
        commands.add(new Prefix());
        commands.add(new Reload());
        commands.add(new Test());
        commands.add(new Toggle());
        commands.add(new Unbind());
        commands.add(new Update());
        commands.add(new VClip());
    }

    public static ArrayList<Command> getCommands() {
        return commands;
    }

    public static Command getByClass(Class<? extends Command> _class) {
        for(Command command : commands) {
            if(command.getClass() == _class) return command;
        }

        return null;
    }

    public static Command getByName(String name) {
        for(Command command : commands) {
            for(String alias : command.getAliases()) {
                if(alias.equalsIgnoreCase(name)) return command;
            }
        }

        return null;
    }
}
