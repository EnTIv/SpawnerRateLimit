package com.entiv.spawnerratelimit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MainCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            Main plugin = Main.getInstance();

            plugin.reloadConfig();
            Message.send(sender, plugin.getConfig().getString("Message.Reload"));
        }
        return true;
    }
}
