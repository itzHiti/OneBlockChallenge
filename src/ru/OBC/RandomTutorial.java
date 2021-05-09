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
            	 int d = (int) (Math.random() * 27);

            	 if(d <= 5)loc.getBlock().setType(Material.BIRCH_LOG);// березовый дуб 5%
            	 if(d <= 8 && d > 5)loc.getBlock().setType(Material.CLAY);// глина 3%
            	 if(d <= 18 && d > 8)loc.getBlock().setType(Material.GRASS_BLOCK);// дЄрн 10 %
            	 if(d <= 20 && d > 18)loc.getBlock().setType(Material.MELON);// арбуз 2%
            	 if(d <= 25 && d > 20)loc.getBlock().setType(Material.OAK_LOG);//  дуб 5%
            	 if(d <= 22 && d > 20)loc.getBlock().setType(Material.PODZOL);// подзол 2 %
            	 if(d <= 24 && d > 22)loc.getBlock().setType(Material.PUMPKIN);// тыква 2%
            	 if(d == 25) chestRandom(loc, p);//сундук
            	 if(d == 26) mobRandom(loc, p);//моб
                
            }
        }, 1L);
       
      
    }
    private void chestRandom(Location loc, Player p) {
    	final Block block = loc.getBlock();
    	loc.getBlock().setType(Material.CHEST);
    	final Chest chest = (Chest)block.getState(); // весь код дл€ сундука
    	final Inventory inv = chest.getInventory();
    	for(int slot = 0; slot < 27; slot++) {
    		int m = (int) (Math.random() * 300);
    		if(m <= 5)inv.setItem(slot, new ItemStack(Material.APPLE, slot)); //€блоко -5%
    		if(m <= 10 && m > 5)inv.setItem(slot, new ItemStack(Material.AZURE_BLUET, slot)); //хаустони€ сера€ 5%
    		if(m <= 15 && m > 10)inv.setItem(slot, new ItemStack(Material.CORNFLOWER, slot)); // василек 5%
    		if(m <= 20 && m > 15)inv.setItem(slot, new ItemStack(Material.BIRCH_SAPLING, 3));// саженец березы 5%
    		if(m <= 25 && m > 20)inv.setItem(slot, new ItemStack(Material.DANDELION, slot)); //одуванчик 5%
    		if(m <= 27 && m > 25)inv.setItem(slot, new ItemStack(Material.EGG, 3)); // €йцо 2%
    		if(m <= 32 && m > 27)inv.setItem(slot, new ItemStack(Material.FLOWER_POT, 1));//горшок 5%
    		if(m <= 37 && m > 32)inv.setItem(slot, new ItemStack(Material.LEATHER, slot)); //кожа 5%
    		if(m <= 42 && m > 37)inv.setItem(slot, new ItemStack(Material.MELON_SEEDS, 6));// семена арбуза 5%
    		if(m <= 43 && m > 42)inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_13)); // пластинка 1%
    		if(m <= 48 && m > 43)inv.setItem(slot, new ItemStack(Material.OAK_SAPLING)); // саженец дуба 5%
    		if(m <= 53 && m > 48)inv.setItem(slot, new ItemStack(Material.ORANGE_TULIP, slot));// оранжевый “юльпан 5%
    		if(m <= 58 && m > 53)inv.setItem(slot, new ItemStack(Material.OXEYE_DAISY, slot));// ромашка 5%
    		if(m <= 63 && m > 58)inv.setItem(slot, new ItemStack(Material.PINK_TULIP, slot));// розовый “юльпан 5%
    		if(m <= 68 && m > 63)inv.setItem(slot, new ItemStack(Material.POPPY, slot));// мак 5%
    		if(m <= 70 && m > 68)inv.setItem(slot, new ItemStack(Material.PUMPKIN_SEEDS, 4));// семена тыквы 2%
    		if(m <= 75 && m > 70)inv.setItem(slot, new ItemStack(Material.RED_DYE, 10));//красный краситель 5%
    		if(m <= 80 && m > 75)inv.setItem(slot, new ItemStack(Material.POPPY, slot));// мак 5%
    		if(m <= 85 && m > 80)inv.setItem(slot, new ItemStack(Material.RED_TULIP, slot));// красный тюльпан 5%
    		if(m <= 90 && m > 85)inv.setItem(slot, new ItemStack(Material.STICK, slot));//палка 10%
    		if(m <= 95 && m > 90)inv.setItem(slot, new ItemStack(Material.SUNFLOWER, slot));//подсолнух 5%
    		if(m <= 100 && m > 95)inv.setItem(slot, new ItemStack(Material.WHEAT_SEEDS, 10));// семена пшеницы 5%
    		if(m <= 105 && m > 100)inv.setItem(slot, new ItemStack(Material.WHITE_TULIP, slot));// белый тюльпан 5%
    		if(m <= 110 && m > 105)inv.setItem(slot, new ItemStack(Material.YELLOW_DYE, slot));// желтый крсчитель  5%
    		if(m <= 300 && m > 105)inv.setItem(slot, new ItemStack(Material.AIR));

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
		 loc.getBlock().setType(Material.GRASS_BLOCK); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.PIG);// свин 2%
		
	 }
 	 if(d == 1) {
		 loc.getBlock().setType(Material.GRASS_BLOCK); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.COW);// корова 2%
		 
	 }
 	 if(d == 2) {
		 loc.getBlock().setType(Material.GRASS_BLOCK); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.CHICKEN);// курица 2%
		
	 }
 	 if(d == 3) {
		 loc.getBlock().setType(Material.GRASS_BLOCK); 
		 loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX()+0.5, loc.getY()+2, loc.getZ()+0.5), EntityType.SHEEP);// овца 2%
		
	 }
    	
    }
    }


