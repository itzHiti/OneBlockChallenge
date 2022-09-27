package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class sneznii
{
    private final Main plugin;
    
    public sneznii(final Main plugin2) {
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
                final int d = (int)(Math.random() * 51.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.DARK_OAK_LOG);
                    return;
                }
                if (d <= 7 && d > 5) {
                    loc.getBlock().setType(Material.GOLD_ORE);
                    return;
                }
                if (d <= 9 && d > 7) {
                    loc.getBlock().setType(Material.GRAY_TERRACOTTA);
                    return;
                }
                if (d <= 14 && d > 9) {
                    loc.getBlock().setType(Material.PACKED_ICE);
                    return;
                }
                if (d <= 19 && d > 14) {
                    loc.getBlock().setType(Material.REDSTONE_ORE);
                    return;
                }
                if (d <= 24 && d > 19) {
                    loc.getBlock().setType(Material.SNOW_BLOCK);
                    return;
                }
                if (d <= 27 && d > 24) {
                    loc.getBlock().setType(Material.WHITE_CONCRETE_POWDER);
                    return;
                }
                if (d == 28) {
                    sneznii.this.chestRandom(loc, p);
                    return;
                }
                if (d == 29) {
                    sneznii.this.mobRandom(loc, p);
                    return;
                }
                if (d <= 40 && d >= 30) {
                    final RandomTutorial randomTutorial = new RandomTutorial(sneznii.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d <= 50 && d > 40) {
                    final podzem podzem = new podzem(sneznii.this.plugin);
                    podzem.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Снежный биом");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 200.0);
            if (m == 10) {
                inv.setItem(slot, new ItemStack(Material.BLUE_ICE, 3));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.BONE, 2));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.BONE_MEAL, 10));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.DARK_OAK_LOG, 2));
            }
            if (m <= 27 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.GOLD_INGOT, 2));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.GRASS_BLOCK, 15));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.ICE, 5));
            }
            if (m <= 40 && m > 37) {
                inv.setItem(slot, new ItemStack(Material.IRON_INGOT, 4));
            }
            if (m <= 45 && m > 40) {
                inv.setItem(slot, new ItemStack(Material.IRON_NUGGET, 14));
            }
            if (m <= 46 && m > 45) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_CHIRP, 1));
            }
            if (m <= 51 && m > 46) {
                inv.setItem(slot, new ItemStack(Material.RABBIT_FOOT, 7));
            }
            if (m <= 56 && m > 51) {
                inv.setItem(slot, new ItemStack(Material.RABBIT_HIDE, 10));
            }
            if (m <= 61 && m > 56) {
                inv.setItem(slot, new ItemStack(Material.SNOWBALL, 15));
            }
            if (m <= 66 && m > 61) {
                inv.setItem(slot, new ItemStack(Material.SWEET_BERRIES, 13));
            }
            if (m <= 71 && m > 66) {
                inv.setItem(slot, new ItemStack(Material.WHITE_DYE, 29));
            }
            if (m <= 201 && m > 66) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void mobRandom(final Location loc, final Player p) {
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final int d = (int)(Math.random() * 5.0);
        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
        for (int partical = 0; partical < 5; ++partical) {
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 + Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
        }
        if (d == 0) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.FOX);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.POLAR_BEAR);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.RABBIT);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.STRAY);
        }
        if (d == 4) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.WOLF);
        }
    }
}
