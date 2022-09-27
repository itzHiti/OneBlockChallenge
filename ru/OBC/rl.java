package ru.OBC;

import ru.OBC.Main.*;
import org.bukkit.command.*;
import org.bukkit.*;

public class rl implements CommandExecutor
{
    private Main plugin;
    
    public rl(final Main main) {
        this.plugin = main;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (args[0].equalsIgnoreCase("rl")) {
            sender.sendMessage("§cПерезагрузка");
            this.plugin.reloadConfig();
            sender.sendMessage(ChatColor.GREEN + "Успешно!");
            sender.sendMessage("§aЗагружен:§6 OneBlockChallenge§f от Lairon и itzHiti§6§o OneBlock§f§o от IJAMinecraft");
            return true;
        }
        return false;
    }
}
