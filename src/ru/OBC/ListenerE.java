package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import ru.OBC.Main.Main;

public class ListenerE implements Listener {


    Team breaker;	
	
	private Main plugin;
	
	public ListenerE(Main main) {
	this.plugin = main;
	}
	
	
	@EventHandler
	private void onPlayerJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		Scoreboard s = p.getScoreboard();
		Bukkit.getScoreboardManager().getNewScoreboard(); 
		Objective objective = s.getObjective("blocks");
		if (objective == null) {
			s.registerNewObjective("blocks", "dummy");
		}
		objective.setDisplaySlot(DisplaySlot.PLAYER_LIST);
		objective.setDisplayName("blocks");
		
		for(Player online : Bukkit.getOnlinePlayers()){
			  online.setScoreboard(s); //Адпейт блоков
			}
		
		objective.getScore(p.getDisplayName()).setScore(plugin.getConfig().getInt(p + ".progress"));
		
		Score x = objective.getScore(p.getDisplayName()); 
		
		int score = x.getScore();
		breaker = s.getTeam("breaker");
		if (breaker == null) {
            s.registerNewTeam("0");
            breaker = s.getTeam("0");
            breaker.setSuffix(" §e" + plugin.getConfig().getInt(p + ".progress"));
		}
		if (score == 0) {
			breaker.addEntry(e.getPlayer().getName());
		}
		
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
		

		if(p.getLocation().getBlockX() == 0 && p.getLocation().getBlockZ() == 0 && p.getLocation().getBlockY() == 62) {
			Location tp = new Location(p.getLocation().getWorld(), p.getLocation().getX(), p.getLocation().getY()+ 0.1, p.getLocation().getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
			p.teleport(tp);
		}
		
		if (x == 0 && z == 0 && y == 61)
		{
			int prog = plugin.getConfig().getInt("block1.progress");
			if(prog <= 252) {
				RandomTutorial randomTutorial = new RandomTutorial(plugin);
				randomTutorial.random(x, y, z, loc, p);
			}
			if(prog == 253) {
				TimerB TimerB = new TimerB(plugin);
				TimerB.random(loc, 10, p, 10);
			}
			if(prog >= 254 && prog <= 684) {
				podzem podzem = new podzem(plugin);
				podzem.random(x, y, z, loc, p);		
			}
			if(prog == 685) {
				TimerB TimerB = new TimerB(plugin);
				TimerB.random(loc, 10, p, 10);	
			}
			if(prog >= 686 && prog <= 1387) {
				sneznii sneznii = new sneznii(plugin);
				sneznii.random(x, y, z, loc, p);		
			}
			if(prog == 1388) {
				TimerB TimerB = new TimerB(plugin);
				TimerB.random(loc, 10, p, 10);	
			}
			if(prog >= 686 && prog <= 1387) {
				oshean oshean = new oshean(plugin);
				oshean.random(x, y, z, loc, p);		
			}
			
			
			Scoreboard s = p.getScoreboard();
			Bukkit.getScoreboardManager().getNewScoreboard(); 
			Objective objective = s.getObjective("blocks");
			if (objective == null) {
				s.registerNewObjective("blocks", "dummy");
			}
			Objective objective2 = s.getObjective("blocks2");
			if (objective2 == null) {
				s.registerNewObjective("blocks2", "dummy");
			}
			
			
			// <- сайд бар и значения над головой раньше обновлялись тут
			
			plugin.getConfig().set("block1.progress", plugin.getConfig().getInt("block1.progress")+1);
			plugin.getConfig().set(p + ".progress", plugin.getConfig().getInt(p + ".progress")+1);
			plugin.saveConfig();
			objective.getScore(p.getDisplayName()).setScore(plugin.getConfig().getInt(p + ".progress"));
			objective2.getScore(p.getDisplayName()).setScore(plugin.getConfig().getInt(p + ".progress"));
			
			objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
			objective2.setDisplayName("blocks");
			objective2.setDisplaySlot(DisplaySlot.SIDEBAR);
			objective2.setDisplayName("§6§lСломано блоков: ");   
			
			// <- теперь тут
			
			for(Player online : Bukkit.getOnlinePlayers()){
				  online.setScoreboard(s); //Адпейт блоков
				}

		}
		if (x == 0 && z == 20 && y == 61)
		{
			if(p.getLocation().getBlockX() == 0 && p.getLocation().getBlockZ() == 20 && p.getLocation().getBlockY() == 62) {
				Location tp = new Location(p.getLocation().getWorld(), p.getLocation().getX(), p.getLocation().getY()+ 0.1, p.getLocation().getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
				p.teleport(tp);
			}
			
			int prog = plugin.getConfig().getInt("block2.progress");
			if(prog <= 252) {
				RandomTutorial randomTutorial = new RandomTutorial(plugin);
				randomTutorial.random(x, y, z, loc, p);
			}
			if(prog == 253) {
				TimerA TimerA = new TimerA(plugin);
				TimerA.random(loc, 10, p, 10);
			}
			if(prog >= 254 && prog <= 684) {
				podzem podzem = new podzem(plugin);
				podzem.random(x, y, z, loc, p);		
			}
			if(prog == 685) {
				TimerA TimerA = new TimerA(plugin);
				TimerA.random(loc, 10, p, 10);	
			}
			if(prog >= 254 && prog <= 1387) {
				sneznii sneznii = new sneznii(plugin);
				sneznii.random(x, y, z, loc, p);		
			}
			if(prog == 1388) {
				TimerB TimerB = new TimerB(plugin);
				TimerB.random(loc, 10, p, 10);	
			}
			if(prog >= 686 && prog <= 1387) {
				oshean oshean = new oshean(plugin);
				oshean.random(x, y, z, loc, p);		
			}
			
			
			Scoreboard s = p.getScoreboard();
			Bukkit.getScoreboardManager().getNewScoreboard(); 
			Objective objective3 = s.getObjective("blocks3");
			if (objective3 == null) {
				s.registerNewObjective("blocks3", "dummy");
			}
			Objective objective4 = s.getObjective("blocks4");
			if (objective4 == null) {
				s.registerNewObjective("blocks4", "dummy");
			}

			plugin.getConfig().set("block2.progress", plugin.getConfig().getInt("block2.progress")+1);
			plugin.getConfig().set(p + ".progress", plugin.getConfig().getInt(p + ".progress")+1);
			plugin.saveConfig();
			
			objective3.getScore(p.getDisplayName()).setScore(plugin.getConfig().getInt(p + ".progress"));
			objective4.getScore(p.getDisplayName()).setScore(plugin.getConfig().getInt(p + ".progress"));
			
			objective3.setDisplaySlot(DisplaySlot.BELOW_NAME);
			objective4.setDisplayName("blocks");
			objective4.setDisplaySlot(DisplaySlot.SIDEBAR);
			objective4.setDisplayName("§6§lСломано блоков: ");   

			
			for(Player online : Bukkit.getOnlinePlayers()){
				  online.setScoreboard(s); //Адпейт блоков
				}

		}

	}
}
