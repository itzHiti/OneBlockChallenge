package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;


public class RandomTutorial {


    private final ru.OBC.Main.Main plugin;

    public RandomTutorial(ru.OBC.Main.Main plugin2) {
        this.plugin = plugin2;
    }
    public void random(int x, int y, int z, Location loc, Player p) {
      

      
       

          
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+0.5)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+0.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);



        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin) plugin, new Runnable() {
            @Override
            public void run() {
            	 int d = (int) (Math.random() * 10);
            	 
                p.sendMessage("§cчисло: " + d);
                if(d==1) loc.getBlock().setType(Material.OAK_LOG);
                if(d==2) loc.getBlock().setType(Material.GRASS_BLOCK);
                if(d==3) loc.getBlock().setType(Material.GRAVEL);
                if(d==4) loc.getBlock().setType(Material.CHEST);
                if(d==5) {
                	loc.getBlock().setType(Material.OAK_LOG);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give "+p.getDisplayName()+" minecraft:apple");
                }
                if(d==6) {
                	loc.getBlock().setType(Material.GRASS_BLOCK);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give "+p.getDisplayName()+" minecraft:egg");
                }
                if(d==7) {
                	loc.getBlock().setType(Material.GRAVEL);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give "+p.getDisplayName()+" minecraft:oak_sapling");
                }
                if(d==8) {
                	loc.getBlock().setType(Material.OAK_LOG);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give "+p.getDisplayName()+" minecraft:wheat_seeds");
                }
                if(d==9) {
                	loc.getBlock().setType(Material.CHEST);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give "+p.getDisplayName()+" minecraft:water_bucket");
                }
                if(d==0) {
                	loc.getBlock().setType(Material.GRASS_BLOCK);

                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
                    p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
                    
                	
                    p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1, 0);
                	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "summon minecraft:pig "+x+ " " +(y+2)+" "+ z);
                }
                
            }
        }, 1L);
       
      
    }
    }


