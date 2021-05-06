package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import ru.OBC.Main.Main;

public class ListenerE implements Listener {


	private Main plugin;
	
	public ListenerE(Main main) {
	this.plugin = main;
	}

	@EventHandler
	private void blockevent(BlockBreakEvent e)
	{
		Location loc = e.getBlock().getLocation();
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
		Player p = e.getPlayer();
		World w = p.getWorld();
		
		if (x == 0 && z == 0 && y == 61)
		{
			if(plugin.getConfig().getInt("block1.progress") <= 29) {
				RandomTutorial randomTutorial = new RandomTutorial(plugin);
				randomTutorial.random(x, y, z, loc, p);
				p.sendMessage("дебаг биом 1");
			}
			if(plugin.getConfig().getInt("block1.progress") == 30) {
				TimerB TimerB = new TimerB(plugin);
				TimerB.random(loc, 10, p);
			}
			if(plugin.getConfig().getInt("block1.progress") >= 31 && plugin.getConfig().getInt("block1.progress") <= 265) {
				p.sendMessage("дебаг биом 2");
			}
				

			
			plugin.getConfig().set("block1.progress", plugin.getConfig().getInt("block1.progress")+1);
			plugin.getConfig().set(p + ".progress", plugin.getConfig().getInt(p + ".progress")+1);
			p.sendTitle("", "дебаг прогресс"+plugin.getConfig().getString(p + ".progress"));
			plugin.saveConfig();

			
			
		}

	}
}
