package ru.OBC;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class ListenerE implements Listener {

	//private Main plugin;
	
	//public ListenerE() {
		//this.plugin = plugin;
	//}
	 
	@EventHandler
	private void blockevent(BlockBreakEvent e)
	{
		Location loc = e.getBlock().getLocation();
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
		Player p = e.getPlayer();
		if (x == 0 && z == 0 && y == 61)
		{
			RandomTutorial.random(x, y, z, loc);
		}
	}
}
