package com.entiv.spawnerratelimit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.text.DecimalFormat;
import java.util.List;

public class Message {

    public static void send(CommandSender sender, String message) {
        if (message == null || message.isEmpty()) return;
        sender.sendMessage(toColor(message));
    }

    public static void sendConsole(String[] message) {

        if (message == null || message.length == 0) return;

        ConsoleCommandSender consoleSender = Bukkit.getConsoleSender();
        consoleSender.sendMessage(toColor(message));
    }

    public static String toColor(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public static String[] toColor(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            strings[i] = (toColor(string));
        }

        return strings;
    }
}
