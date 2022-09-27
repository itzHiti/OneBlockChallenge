package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class ghangl
{
    private final Main plugin;
    
    public ghangl(final Main plugin2) {
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
                p.sendMessage(String.valueOf(d) + " дебаг");
                if (d <= 5) {
                    loc.getBlock().setType(Material.ACACIA_LOG);
                    return;
                }
                if (d <= 10 && d > 5) {
                    loc.getBlock().setType(Material.COBBLESTONE);
                    return;
                }
                if (d <= 15 && d > 10) {
                    loc.getBlock().setType(Material.GREEN_TERRACOTTA);
                    return;
                }
                if (d <= 20 && d > 15) {
                    loc.getBlock().setType(Material.JUNGLE_LOG);
                    return;
                }
                if (d <= 25 && d > 20) {
                    loc.getBlock().setType(Material.LIME_TERRACOTTA);
                    return;
                }
                if (d <= 30 && d > 25) {
                    loc.getBlock().setType(Material.MOSSY_COBBLESTONE);
                    return;
                }
                if (d == 31) {
                    ghangl.this.chestRandom(loc, p);
                    return;
                }
                if (d == 32) {
                    ghangl.this.mobRandom(loc, p);
                    return;
                }
                if (d == 33) {
                    final RandomTutorial randomTutorial = new RandomTutorial(ghangl.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 34) {
                    final podzem podzem = new podzem(ghangl.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 35) {
                    final sneznii sneznii = new sneznii(ghangl.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 36) {
                    final oshean oshean = new oshean(ghangl.this.plugin);
                    oshean.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Поздемелье Джунглей");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 200.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.BAMBOO, 6));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.BLUE_ORCHID, 5));
            }
            if (m <= 13 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.BOOK, 1));
            }
            if (m <= 18 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.COCOA_BEANS, 4));
            }
            if (m <= 19 && m > 18) {
                inv.setItem(slot, new ItemStack(Material.DIAMOND, 1));
            }
            if (m <= 24 && m > 19) {
                inv.setItem(slot, new ItemStack(Material.GREEN_DYE, 1));
            }
            if (m <= 29 && m > 24) {
                inv.setItem(slot, new ItemStack(Material.JUNGLE_SAPLING, 5));
            }
            if (m <= 32 && m > 29) {
                inv.setItem(slot, new ItemStack(Material.LAPIS_LAZULI, 4));
            }
            if (m <= 34 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.LEAD));
            }
            if (m <= 39 && m > 34) {
                inv.setItem(slot, new ItemStack(Material.LILY_OF_THE_VALLEY, 5));
            }
            if (m <= 44 && m > 39) {
                inv.setItem(slot, new ItemStack(Material.LIME_DYE, 5));
            }
            if (m <= 45 && m > 44) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_CAT, 1));
            }
            if (m <= 49 && m > 45) {
                inv.setItem(slot, new ItemStack(Material.PAPER, 4));
            }
            if (m <= 54 && m > 49) {
                inv.setItem(slot, new ItemStack(Material.PEONY, 5));
            }
            if (m <= 59 && m > 54) {
                inv.setItem(slot, new ItemStack(Material.ROSE_BUSH, 5));
            }
            if (m <= 64 && m > 59) {
                inv.setItem(slot, new ItemStack(Material.SUGAR_CANE, 6));
            }
            if (m <= 69 && m > 64) {
                inv.setItem(slot, new ItemStack(Material.VINE, 4));
            }
            if (m > 69) {
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
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.EVOKER);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.HORSE);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.OCELOT);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.PANDA);
        }
        if (d == 4) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.WITCH);
        }
    }
}
