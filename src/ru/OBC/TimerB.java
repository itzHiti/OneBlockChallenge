package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;


public class TimerB implements Runnable {

	private int t = 10;

    private final ru.OBC.Main.Main plugin;

    public TimerB(ru.OBC.Main.Main plugin2) {
        this.plugin = plugin2;
    }
    public void random(Location loc, int prog, Player p) {
      

		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();

          
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
        p.sendMessage("0");


        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, (Runnable) this, 0, 20);
        	
     	p.sendMessage("1");


        }
	@Override
	public void run() {
		World w = Bukkit.getWorld("world");
		Location loc = new Location(w, 0.5, 61, 0.5);
    	loc.getBlock().setType(Material.BEDROCK);
    	ArmorStand a = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
    	a.setVisible(false);
    	String str = Integer.toString(t);
    	a.setCustomName(ChatColor.GREEN+str);
    	a.setCustomNameVisible(true);
    	a.setGravity(false);
    	if(t == 0) {
    		
    	}
    	t--;
	}


       
      
    }
    


