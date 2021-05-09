package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;


public class TimerA implements Runnable {

	private int t = 30;
	private int id;
	
    private final ru.OBC.Main.Main plugin;

    public TimerA(ru.OBC.Main.Main plugin2) {
        this.plugin = plugin2;
    }
    public void random(Location loc, int prog, Player p, int sec) {
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
       id = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, (Runnable) this, 0, 20);     	
        }
	@Override
	public void run() {
		
		World w = Bukkit.getWorld("world");
		Location loc = new Location(w, 0.5, 61, 20.5);
    	loc.getBlock().setType(Material.BEDROCK);
    	ArmorStand a = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
    	a.setVisible(false);
    	String str = Integer.toString(t);
    	a.setCustomName(ChatColor.GREEN+str);
    	a.setCustomNameVisible(true);
    	a.setGravity(false);
    	if(t == 0) {
    		Bukkit.getScheduler().cancelTask(id);
    		loc.getBlock().setType(Material.GRASS_BLOCK);
    	}
    	a.remove();
    	t--;
	}
    }
    


