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


public class oshean {


    private final ru.OBC.Main.Main plugin;

    public oshean(ru.OBC.Main.Main plugin2) {
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
            	 int d = (int) (Math.random() * 58);
            	 if(d <= 5)loc.getBlock().setType(Material.BLUE_TERRACOTTA);//синяя теракота 5
            	 if(d <= 10 && d > 5)loc.getBlock().setType(Material.TUBE_CORAL_BLOCK);// корралла 5
            	 if(d <= 15 && d > 10)loc.getBlock().setType(Material.CYAN_TERRACOTTA);// теракота бирюзовая 5
            	 if(d <= 20 && d > 15)loc.getBlock().setType(Material.DARK_PRISMARINE);// темный призмарин5
            	 if(d <= 21 && d > 20)loc.getBlock().setType(Material.DIAMOND_ORE);// алмазная руда 1
            	 if(d <= 26 && d > 21)loc.getBlock().setType(Material.DRIED_KELP_BLOCK);// ламинария5
            	 if(d <= 29 && d > 26)loc.getBlock().setType(Material.LAPIS_ORE);// лазурит 3
            	 if(d <= 24 && d > 29)loc.getBlock().setType(Material.PRISMARINE);// призмарин  5
            	 if(d <= 29 && d > 24)loc.getBlock().setType(Material.PRISMARINE_BRICKS);// призмариновые кирпичи 5
            	 if(d <= 34 && d > 29)loc.getBlock().setType(Material.SAND);// песок 5 
            	 if(d <= 39 && d > 34)loc.getBlock().setType(Material.SEA_LANTERN);//морская лампа5
            	 if(d <= 40 && d > 39)loc.getBlock().setType(Material.SPONGE);// губка 1
            	 if(d == 41) chestRandom(loc, p);//сундук
            	 if(d == 42) mobRandom(loc, p);//моб
            	 if(d <= 47 && d > 42){// преведущий биом
     				RandomTutorial randomTutorial = new RandomTutorial(plugin);
    				randomTutorial.random(x, y, z, loc, p);

            	 }
            	 if(d <= 53 && d > 47){// преведущий биом
     				RandomTutorial randomTutorial = new RandomTutorial(plugin);
    				randomTutorial.random(x, y, z, loc, p);

            	 }
            	 if(d <= 57 && d > 53){// преведущий биом
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
    		int m = (int) (Math.random() * 300);
    		if(m == 5)inv.setItem(slot, new ItemStack(Material.BLUE_DYE, slot)); // синий краситель 5
    		if(m <= 10 && m > 5)inv.setItem(slot, new ItemStack(Material.COD_BUCKET, slot)); // ведро 5
    		if(m <= 15 && m > 10)inv.setItem(slot, new ItemStack(Material.TUBE_CORAL, 3));// коралл  5
    		if(m <= 20 && m > 15)inv.setItem(slot, new ItemStack(Material.CYAN_DYE, slot)); // синий краситель 5
    		if(m <= 25 && m > 20)inv.setItem(slot, new ItemStack(Material.DRIED_KELP, 3)); // ламинария  5 
    		if(m <= 22 && m > 20)inv.setItem(slot, new ItemStack(Material.HEART_OF_THE_SEA, 1));// сердце моря 2
    		if(m <= 27 && m > 22)inv.setItem(slot, new ItemStack(Material.INK_SAC, slot)); // чернила 5
    		if(m <= 32 && m > 27)inv.setItem(slot, new ItemStack(Material.KELP, 6));// ламинария  5
    		if(m <= 37 && m > 32)inv.setItem(slot, new ItemStack(Material.LIGHT_BLUE_DYE)); // синий краситель 5
    		if(m <= 42 && m > 37)inv.setItem(slot, new ItemStack(Material.LILY_PAD)); // кувшинка 5
    		if(m <= 43 && m > 42)inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_WAIT));// музыкальный диск 1 
    		if(m <= 44 && m > 43)inv.setItem(slot, new ItemStack(Material.NAUTILUS_SHELL, slot));// ракушка наутилкса 1
    		if(m <= 49 && m > 44)inv.setItem(slot, new ItemStack(Material.PRISMARINE_CRYSTALS, slot));// кристалл призмарина 5
    		if(m <= 54 && m > 49)inv.setItem(slot, new ItemStack(Material.PRISMARINE_SHARD, slot));// ОСКОЛКИ ПРИЗМАРИНА 5
    		if(m <= 60 && m > 54)inv.setItem(slot, new ItemStack(Material.PUFFERFISH_BUCKET, slot));// ФУГА ТВ 5
    		if(m <= 65 && m > 60)inv.setItem(slot, new ItemStack(Material.SALMON_BUCKET, slot));// ЛОСОСЬ5
    		if(m <= 70 && m > 65)inv.setItem(slot, new ItemStack(Material.SCUTE, slot));// ЩИТОК 5
    		if(m <= 75 && m > 70)inv.setItem(slot, new ItemStack(Material.SEA_PICKLE, slot));// ОГУРЕЦ МОР 5
    		if(m <= 80 && m > 75)inv.setItem(slot, new ItemStack(Material.SEAGRASS, slot));// МОРСКАЯ ТРАВА 5
    		if(m == 81)inv.setItem(slot, new ItemStack(Material.TRIDENT, slot));// ТРИЗУБЕЦ 1
    		if(m <= 86 && m > 81)inv.setItem(slot, new ItemStack(Material.TROPICAL_FISH_BUCKET, slot));// ТРОПИЧЕСКАЯ РЫБА 5
    		if(m <= 91 && m > 86)inv.setItem(slot, new ItemStack(Material.TURTLE_EGG, slot));// ЦЕРЕПАЩЬЕ ЯЙЦО 5
    		if(m <= 96 && m > 91)inv.setItem(slot, new ItemStack(Material.WATER_BUCKET, slot));// ВЕДРО С ВОДОЙ 5
    		if(m > 96)inv.setItem(slot, new ItemStack(Material.AIR));
	}
    }
    private void mobRandom(Location loc, Player p) {
		int x = loc.getBlockX();
		int y = loc.getBlockY();
		int z = loc.getBlockZ();
    int d = (int) (Math.random() * 4);
    
    
    p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1, 1);
	for(int partical = 0; partical < 5; partical++) {
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2.5)+ Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) - Math.random(), (y+2.5)- Math.random(), (z+0.5)+ Math.random()), (int) 0.99999);
		 p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), (x+0.5) + Math.random(), (y+2.5)- Math.random(), (z+0.5)- Math.random()), (int) 0.99999);
	 }
    

   	 if(d == 0) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.COD);// треска
		
	 }
 	 if(d == 1) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.DOLPHIN);// дельфин
		
	 }
 	 if(d == 2) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.DROWNED);// УТОПА 
		 
	 }
 	 if(d == 3) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.ELDER_GUARDIAN);// ГВАРД 
	 }
 	 if(d == 4) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.GUARDIAN);// ГВАРД 
	 }
 	 if(d == 5) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.PUFFERFISH);// ФУГА 
	 }
 	 if(d ==6) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.SALMON);// ЛОСОСЬ 
	 }
 	 if(d == 7) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.SQUID);// СКВИД 
	 }
 	 if(d == 8) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.TROPICAL_FISH);// РЫБА 
	 }
 	 if(d == 9) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.TURTLE);// ГВАРД 
 	 }	
    }
    }


