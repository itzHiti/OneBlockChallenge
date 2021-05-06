package ru.OBC;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import ru.OBC.Main.Main;

public class rl implements CommandExecutor {
	
	private Main plugin;
	public rl(Main main) {
		this.plugin = main;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args[0].equalsIgnoreCase("rl")) {
		sender.sendMessage("§cПерезагрузка");
		plugin.reloadConfig();
		sender.sendMessage(ChatColor.GREEN+"Успешно!");
		}
		return false;
		
	}

}
