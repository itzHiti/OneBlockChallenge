package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class RandomTutorial
{
    private final Main plugin;
    
    public RandomTutorial(final Main plugin2) {
        this.plugin = plugin2;
    }
    
    public void random(final int x, final int y, final int z, final Location loc, final Player p) {
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 + Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)this.plugin, (Runnable)new Runnable() {
            @Override
            public void run() {
                final int d = (int)(Math.random() * 27.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.BIRCH_LOG);
                    return;
                }
                if (d <= 8 && d > 5) {
                    loc.getBlock().setType(Material.CLAY);
                    return;
                }
                if (d <= 18 && d > 8) {
                    loc.getBlock().setType(Material.GRASS_BLOCK);
                    return;
                }
                if (d <= 20 && d > 18) {
                    loc.getBlock().setType(Material.MELON);
                    return;
                }
                if (d <= 25 && d > 20) {
                    loc.getBlock().setType(Material.OAK_LOG);
                    return;
                }
                if (d <= 22 && d > 20) {
                    loc.getBlock().setType(Material.PODZOL);
                    return;
                }
                if (d <= 24 && d > 22) {
                    loc.getBlock().setType(Material.PUMPKIN);
                    return;
                }
                if (d == 25) {
                    RandomTutorial.this.chestRandom(loc, p);
                    return;
                }
                if (d == 26) {
                    RandomTutorial.this.mobRandom(loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("§6Сундук фазы: §aРaравнины");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 300.0);
            if (m <= 5) {
                inv.setItem(slot, new ItemStack(Material.APPLE, slot));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.AZURE_BLUET, slot));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.CORNFLOWER, slot));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.BIRCH_SAPLING, 3));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.DANDELION, slot));
            }
            if (m <= 27 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.EGG, 3));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.FLOWER_POT, 1));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.LEATHER, slot));
            }
            if (m <= 42 && m > 37) {
                inv.setItem(slot, new ItemStack(Material.MELON_SEEDS, 6));
            }
            if (m <= 43 && m > 42) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_13));
            }
            if (m <= 48 && m > 43) {
                inv.setItem(slot, new ItemStack(Material.OAK_SAPLING));
            }
            if (m <= 53 && m > 48) {
                inv.setItem(slot, new ItemStack(Material.ORANGE_TULIP, slot));
            }
            if (m <= 58 && m > 53) {
                inv.setItem(slot, new ItemStack(Material.OXEYE_DAISY, slot));
            }
            if (m <= 63 && m > 58) {
                inv.setItem(slot, new ItemStack(Material.PINK_TULIP, slot));
            }
            if (m <= 68 && m > 63) {
                inv.setItem(slot, new ItemStack(Material.POPPY, slot));
            }
            if (m <= 70 && m > 68) {
                inv.setItem(slot, new ItemStack(Material.PUMPKIN_SEEDS, 4));
            }
            if (m <= 75 && m > 70) {
                inv.setItem(slot, new ItemStack(Material.RED_DYE, 10));
            }
            if (m <= 80 && m > 75) {
                inv.setItem(slot, new ItemStack(Material.POPPY, slot));
            }
            if (m <= 85 && m > 80) {
                inv.setItem(slot, new ItemStack(Material.RED_TULIP, slot));
            }
            if (m <= 90 && m > 85) {
                inv.setItem(slot, new ItemStack(Material.STICK, slot));
            }
            if (m <= 95 && m > 90) {
                inv.setItem(slot, new ItemStack(Material.SUNFLOWER, slot));
            }
            if (m <= 100 && m > 95) {
                inv.setItem(slot, new ItemStack(Material.WHEAT_SEEDS, 10));
            }
            if (m <= 105 && m > 100) {
                inv.setItem(slot, new ItemStack(Material.WHITE_TULIP, slot));
            }
            if (m <= 110 && m > 105) {
                inv.setItem(slot, new ItemStack(Material.YELLOW_DYE, slot));
            }
            if (m <= 300 && m > 105) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void mobRandom(final Location loc, final Player p) {
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final int d = (int)(Math.random() * 4.0);
        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
        for (int partical = 0; partical < 5; ++partical) {
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 + Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
        }
        if (d == 0) {
            loc.getBlock().setType(Material.GRASS_BLOCK);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.PIG);
            return;
        }
        if (d == 1) {
            loc.getBlock().setType(Material.GRASS_BLOCK);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.COW);
            return;
        }
        if (d == 2) {
            loc.getBlock().setType(Material.GRASS_BLOCK);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.CHICKEN);
            return;
        }
        if (d == 3) {
            loc.getBlock().setType(Material.GRASS_BLOCK);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SHEEP);
        }
    }
}
