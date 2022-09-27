package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class podzem
{
    private final Main plugin;
    
    public podzem(final Main plugin2) {
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
                final int d = (int)(Math.random() * 50.0);
                if (d <= 10) {
                    loc.getBlock().setType(Material.STONE);
                    return;
                }
                if (d <= 15 && d > 10) {
                    loc.getBlock().setType(Material.ANDESITE);
                    return;
                }
                if (d <= 18 && d > 15) {
                    loc.getBlock().setType(Material.COAL_ORE);
                    return;
                }
                if (d <= 23 && d > 18) {
                    loc.getBlock().setType(Material.DIORITE);
                    return;
                }
                if (d <= 28 && d > 23) {
                    loc.getBlock().setType(Material.GRANITE);
                    return;
                }
                if (d <= 33 && d > 28) {
                    loc.getBlock().setType(Material.GRAVEL);
                    return;
                }
                if (d <= 35 && d > 33) {
                    loc.getBlock().setType(Material.IRON_ORE);
                    return;
                }
                if (d <= 40 && d > 35) {
                    loc.getBlock().setType(Material.SPRUCE_LOG);
                    return;
                }
                if (d == 41) {
                    podzem.this.chestRandom(loc, p);
                    return;
                }
                if (d == 42) {
                    podzem.this.mobRandom(loc, p);
                    return;
                }
                if (d >= 43) {
                    final RandomTutorial randomTutorial = new RandomTutorial(podzem.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("§6Сундук фазы: §aПодземелье");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 200.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.RED_MUSHROOM, slot));
            }
            if (m <= 8 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.COAL, slot));
            }
            if (m <= 13 && m > 8) {
                inv.setItem(slot, new ItemStack(Material.COBWEB, 3));
            }
            if (m <= 18 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.FEATHER, slot));
            }
            if (m <= 23 && m > 18) {
                inv.setItem(slot, new ItemStack(Material.STONE, 3));
            }
            if (m <= 28 && m > 23) {
                inv.setItem(slot, new ItemStack(Material.LIGHT_GRAY_DYE, 1));
            }
            if (m <= 30 && m > 28) {
                inv.setItem(slot, new ItemStack(Material.MUSHROOM_STEW, slot));
            }
            if (m <= 31 && m > 30) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_BLOCKS, 6));
            }
            if (m <= 36 && m > 31) {
                inv.setItem(slot, new ItemStack(Material.BROWN_MUSHROOM));
            }
            if (m <= 41 && m > 36) {
                inv.setItem(slot, new ItemStack(Material.SPRUCE_SAPLING));
            }
            if (m <= 45 && m > 41) {
                inv.setItem(slot, new ItemStack(Material.STRING, slot));
            }
            if (m <= 200 && m > 45) {
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
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.CREEPER);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.MUSHROOM_COW);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SPIDER);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ZOMBIE);
        }
    }
}
