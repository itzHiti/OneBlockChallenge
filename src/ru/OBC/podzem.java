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


public class podzem {


    private final ru.OBC.Main.Main plugin;

    public podzem(ru.OBC.Main.Main plugin2) {
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
            	 int d = (int) (Math.random() * 50);
            	 if(d <= 10)loc.getBlock().setType(Material.STONE);//камень 10%
            	 if(d <= 15 && d > 10)loc.getBlock().setType(Material.ANDESITE);// Андезит 5%
            	 if(d <= 18 && d > 15)loc.getBlock().setType(Material.COAL_ORE);// уголь 3%
            	 if(d <= 23 && d > 18)loc.getBlock().setType(Material.DIORITE);// диорит5%
            	 if(d <= 28 && d > 23)loc.getBlock().setType(Material.GRANITE);//  гранит5%
            	 if(d <= 33 && d > 28)loc.getBlock().setType(Material.GRAVEL);// гравий   5%
            	 if(d <= 35 && d > 33)loc.getBlock().setType(Material.IRON_ORE);// железная руда 2%
            	 if(d <= 40 && d > 35)loc.getBlock().setType(Material.SPRUCE_LOG);//  ель 5%
            	 if(d == 41) chestRandom(loc, p);//сундук
            	 if(d == 42) mobRandom(loc, p);//моб
            	 if(d >= 43){// преведущий биом
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
    		if(m == 5)inv.setItem(slot, new ItemStack(Material.RED_MUSHROOM, slot)); //красный грип 5%
    		if(m <= 8 && m > 5)inv.setItem(slot, new ItemStack(Material.COAL, slot)); // уголь 3%
    		if(m <= 13 && m > 8)inv.setItem(slot, new ItemStack(Material.COBWEB, 3));// паутина 5%
    		if(m <= 18 && m > 13)inv.setItem(slot, new ItemStack(Material.FEATHER, slot)); //перо5%
    		if(m <= 23 && m > 18)inv.setItem(slot, new ItemStack(Material.STONE, 3)); // камень 5%
    		if(m <= 28 && m > 23)inv.setItem(slot, new ItemStack(Material.LIGHT_GRAY_DYE, 1));// светлосерый краситель 5%
    		if(m <= 30 && m > 28)inv.setItem(slot, new ItemStack(Material.MUSHROOM_STEW, slot)); //грибной суп 2%
    		if(m <= 31 && m > 30)inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_BLOCKS, 6));// музыкальный диск блоки 1%
    		if(m <= 36 && m > 31)inv.setItem(slot, new ItemStack(Material.BROWN_MUSHROOM)); // серый грип 5%
    		if(m <= 41 && m > 36)inv.setItem(slot, new ItemStack(Material.SPRUCE_SAPLING)); // еловый саженец5%
    		if(m <= 45 && m > 41)inv.setItem(slot, new ItemStack(Material.STRING, slot));// нить5%
    		if(m <= 200 && m > 45)inv.setItem(slot, new ItemStack(Material.AIR));
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
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.CREEPER);// крипер 2%
		
	 }
 	 if(d == 1) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.MUSHROOM_COW);// корова 2%
		
	 }
 	 if(d == 2) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.SPIDER);// павук блять 2%
		 
	 }
 	 if(d == 3) {
		 loc.getBlock().setType(Material.STONE); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.ZOMBIE);// зомбу 2%
	 }
    	
    }
    }


