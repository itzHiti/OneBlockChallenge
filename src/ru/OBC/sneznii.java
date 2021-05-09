package ru.OBC;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;


public class sneznii {


    private final ru.OBC.Main.Main plugin;

    public sneznii(ru.OBC.Main.Main plugin2) {
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
            	 int d = (int) (Math.random() * 51);
            	 if(d <= 5)loc.getBlock().setType(Material.DARK_OAK_LOG);//темный дуб 5%
            	 if(d <= 7 && d > 5)loc.getBlock().setType(Material.GOLD_ORE);// золотая руда 2%
            	 if(d <= 9 && d > 7)loc.getBlock().setType(Material.GRAY_TERRACOTTA);// серая теракота 2%
            	 if(d <= 14 && d > 9)loc.getBlock().setType(Material.PACKED_ICE);// плотный лед 5%
            	 if(d <= 19 && d > 14)loc.getBlock().setType(Material.REDSTONE_ORE);//  рудстоун руда 5%
            	 if(d <= 24 && d > 19)loc.getBlock().setType(Material.SNOW_BLOCK);// снежный блок 5%
            	 if(d <= 27 && d > 24)loc.getBlock().setType(Material.WHITE_CONCRETE_POWDER);// бетон 3%
 
            	 if(d == 28) chestRandom(loc, p);//сундук
            	 if(d == 29) mobRandom(loc, p);//моб
            	 if(d <= 40 && d >= 30){// преведущий биом
     				RandomTutorial randomTutorial = new RandomTutorial(plugin);
    				randomTutorial.random(x, y, z, loc, p);

            	 }
            	 if(d <= 50 && d > 40){// преведущий биом
      				RandomTutorial randomTutorial = new RandomTutorial(plugin);
     				randomTutorial.random(x, y, z, loc, p);
             	 }
                
            }
        }, 1L);
       
      
    }
    private void chestRandom(Location loc, Player p) {
    	final Block block = loc.getBlock();
    	loc.getBlock().setType(Material.CHEST);
    	final Chest chest = (Chest)block.getState(); // весь код для сундука
    	final Inventory inv = chest.getInventory();
    	for(int slot = 0; slot < 27; slot++) {
    		int m = (int) (Math.random() * 200);
    		if(m == 10)inv.setItem(slot, new ItemStack(Material.BLUE_ICE, 3)); //синий лед 10
    		if(m <= 15 && m > 10)inv.setItem(slot, new ItemStack(Material.BONE, 2)); // кость 5
    		if(m <= 20 && m > 15)inv.setItem(slot, new ItemStack(Material.BONE_MEAL, 10));// костная мука 5
    		if(m <= 25 && m > 20)inv.setItem(slot, new ItemStack(Material.DARK_OAK_LOG, 2)); // темный дуб 5
    		if(m <= 27 && m > 25)inv.setItem(slot, new ItemStack(Material.GOLD_INGOT, 2)); // золотой слиток 2
    		if(m <= 32 && m > 27)inv.setItem(slot, new ItemStack(Material.GRASS_BLOCK, 15));// дерн 5
    		if(m <= 37 && m > 32)inv.setItem(slot, new ItemStack(Material.ICE, 5)); // лед 5
    		if(m <= 40 && m > 37)inv.setItem(slot, new ItemStack(Material.IRON_INGOT, 4));// железо 3
    		if(m <= 45 && m > 40)inv.setItem(slot, new ItemStack(Material.IRON_NUGGET, 14)); // железный самородок 5
    		if(m <= 46 && m > 45)inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_CHIRP, 1)); // пластинка 1 
    		if(m <= 51 && m > 46)inv.setItem(slot, new ItemStack(Material.RABBIT_FOOT, 7));// кроличья лапка5
    		if(m <= 56 && m > 51)inv.setItem(slot, new ItemStack(Material.RABBIT_HIDE, 10));// кроличья шкура блят 5
    		if(m <= 61 && m > 56)inv.setItem(slot, new ItemStack(Material.SNOWBALL, 15));// снежок 5
    		if(m <= 66 && m > 61)inv.setItem(slot, new ItemStack(Material.SWEET_BERRIES, 13));// сладкие ягоды 5
    		if(m <= 71 && m > 66)inv.setItem(slot, new ItemStack(Material.WHITE_DYE, 29));//белый краситель 2
    		if(m <= 201 && m > 66)inv.setItem(slot, new ItemStack(Material.AIR));
    		
	}
    }
    private void mobRandom(Location loc, Player p) {
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
    int d = (int) (Math.random() * 5);
    
    
    p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
	for(int partical = 0; partical < 5; partical++) {
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2.5)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2.5)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
	 }
    

   	 if(d == 0) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.FOX);// лиса
		
	 }
 	 if(d == 1) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.POLAR_BEAR);// медведь
		
	 }
 	 if(d == 2) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.RABBIT);// кролик
		 
	 }
 	 if(d == 3) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.STRAY);// зимогор
	 }
 	 if(d == 4) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.WOLF);// волк
	 }
    	
    	
    }
    }


