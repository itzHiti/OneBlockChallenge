package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class NETHER
{
    private final Main plugin;
    
    public NETHER(final Main plugin2) {
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
                final int d = (int)(Math.random() * 37.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.GLOWSTONE);
                    return;
                }
                if (d <= 10 && d > 5) {
                    loc.getBlock().setType(Material.MAGMA_BLOCK);
                    return;
                }
                if (d <= 15 && d > 10) {
                    loc.getBlock().setType(Material.NETHER_BRICKS);
                    return;
                }
                if (d <= 20 && d > 15) {
                    loc.getBlock().setType(Material.NETHER_QUARTZ_ORE);
                    return;
                }
                if (d <= 21 && d > 20) {
                    loc.getBlock().setType(Material.NETHER_WART_BLOCK);
                    return;
                }
                if (d <= 26 && d > 21) {
                    loc.getBlock().setType(Material.NETHERRACK);
                    return;
                }
                if (d <= 29 && d > 26) {
                    loc.getBlock().setType(Material.OBSIDIAN);
                    return;
                }
                if (d <= 24 && d > 29) {
                    loc.getBlock().setType(Material.RED_NETHER_BRICKS);
                    return;
                }
                if (d <= 29 && d > 24) {
                    loc.getBlock().setType(Material.SOUL_SAND);
                    return;
                }
                if (d == 30) {
                    NETHER.this.chestRandom(loc, p);
                    return;
                }
                if (d == 31) {
                    NETHER.this.mobRandom(loc, p);
                    return;
                }
                if (d == 32) {
                    final RandomTutorial randomTutorial = new RandomTutorial(NETHER.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 33) {
                    final podzem podzem = new podzem(NETHER.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 34) {
                    final sneznii sneznii = new sneznii(NETHER.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 35) {
                    final oshean oshean = new oshean(NETHER.this.plugin);
                    oshean.random(x, y, z, loc, p);
                    return;
                }
                if (d == 36) {
                    final ghangl ghangl = new ghangl(NETHER.this.plugin);
                    ghangl.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Ад");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 118.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.BLAZE_POWDER, 8));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.BLAZE_ROD, 4));
            }
            if (m <= 12 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.GHAST_TEAR, 3));
            }
            if (m <= 17 && m > 12) {
                inv.setItem(slot, new ItemStack(Material.GOLD_NUGGET, 10));
            }
            if (m <= 20 && m > 17) {
                inv.setItem(slot, new ItemStack(Material.LAVA_BUCKET, 1));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.MAGMA_CREAM, 4));
            }
            if (m <= 26 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_STAL, 1));
            }
            if (m <= 27 && m > 26) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_PIGSTEP, 1));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.NETHER_WART, 4));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.ORANGE_DYE, 10));
            }
            if (m <= 42 && m > 37) {
                inv.setItem(slot, new ItemStack(Material.QUARTZ, 6));
            }
            if (m <= 43 && m > 42) {
                inv.setItem(slot, new ItemStack(Material.WITHER_SKELETON_SKULL, 1));
            }
            if (m > 43) {
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
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.BLAZE);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.GHAST);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.MAGMA_CUBE);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.WITHER_SKELETON);
        }
        if (d == 4) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ZOMBIFIED_PIGLIN);
        }
    }
}
