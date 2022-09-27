package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class IDILIY
{
    private final Main plugin;
    
    public IDILIY(final Main plugin2) {
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
                final int d = (int)(Math.random() * 58.0);
                if (d <= 3) {
                    loc.getBlock().setType(Material.BEE_NEST);
                    return;
                }
                if (d <= 6 && d > 3) {
                    loc.getBlock().setType(Material.BEEHIVE);
                    return;
                }
                if (d <= 11 && d > 6) {
                    loc.getBlock().setType(Material.BROWN_MUSHROOM_BLOCK);
                    return;
                }
                if (d <= 16 && d > 11) {
                    loc.getBlock().setType(Material.CHISELED_QUARTZ_BLOCK);
                    return;
                }
                if (d <= 19 && d > 16) {
                    loc.getBlock().setType(Material.HONEYCOMB_BLOCK);
                    return;
                }
                if (d <= 24 && d > 19) {
                    loc.getBlock().setType(Material.BLUE_TERRACOTTA);
                    return;
                }
                if (d <= 29 && d > 24) {
                    loc.getBlock().setType(Material.MAGENTA_TERRACOTTA);
                    return;
                }
                if (d <= 34 && d > 29) {
                    loc.getBlock().setType(Material.MUSHROOM_STEM);
                    return;
                }
                if (d <= 39 && d > 34) {
                    loc.getBlock().setType(Material.QUARTZ_BLOCK);
                    return;
                }
                if (d <= 44 && d > 39) {
                    loc.getBlock().setType(Material.QUARTZ_PILLAR);
                    return;
                }
                if (d <= 49 && d > 44) {
                    loc.getBlock().setType(Material.RED_MUSHROOM_BLOCK);
                    return;
                }
                if (d <= 54 && d > 49) {
                    loc.getBlock().setType(Material.SMOOTH_QUARTZ);
                    return;
                }
                if (d == 50) {
                    IDILIY.this.chestRandom(loc, p);
                    return;
                }
                if (d == 51) {
                    IDILIY.this.mobRandom(loc, p);
                    return;
                }
                if (d == 52) {
                    final RandomTutorial randomTutorial = new RandomTutorial(IDILIY.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 53) {
                    final podzem podzem = new podzem(IDILIY.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 54) {
                    final sneznii sneznii = new sneznii(IDILIY.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 55) {
                    final oshean oshean = new oshean(IDILIY.this.plugin);
                    oshean.random(x, y, z, loc, p);
                    return;
                }
                if (d == 56) {
                    final ghangl ghangl = new ghangl(IDILIY.this.plugin);
                    ghangl.random(x, y, z, loc, p);
                    return;
                }
                if (d == 57) {
                    final NETHER NETHER = new NETHER(IDILIY.this.plugin);
                    NETHER.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Идиллия");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 154.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.ALLIUM, 5));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.BEETROOT_SEEDS, 4));
            }
            if (m <= 12 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.BEETROOT_SOUP, 1));
            }
            if (m <= 15 && m > 12) {
                inv.setItem(slot, new ItemStack(Material.CAKE, 1));
            }
            if (m <= 17 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.CARROT_ON_A_STICK, 1));
            }
            if (m <= 25 && m > 17) {
                inv.setItem(slot, new ItemStack(Material.FERN, 1));
            }
            if (m <= 29 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.FIRE_CHARGE, slot));
            }
            if (m <= 34 && m > 29) {
                inv.setItem(slot, new ItemStack(Material.GLISTERING_MELON_SLICE, 6));
            }
            if (m <= 39 && m > 34) {
                inv.setItem(slot, new ItemStack(Material.GOLDEN_CARROT));
            }
            if (m <= 42 && m > 39) {
                inv.setItem(slot, new ItemStack(Material.HONEY_BOTTLE));
            }
            if (m <= 45 && m > 42) {
                inv.setItem(slot, new ItemStack(Material.HONEYCOMB));
            }
            if (m <= 46 && m > 45) {
                inv.setItem(slot, new ItemStack(Material.IRON_HORSE_ARMOR));
            }
            if (m <= 47 && m > 46) {
                inv.setItem(slot, new ItemStack(Material.LEATHER_HORSE_ARMOR));
            }
            if (m <= 48 && m > 47) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_WARD));
            }
            if (m <= 51 && m > 48) {
                inv.setItem(slot, new ItemStack(Material.NAME_TAG, 1));
            }
            if (m <= 56 && m > 51) {
                inv.setItem(slot, new ItemStack(Material.PINK_DYE, 5));
            }
            if (m <= 59 && m > 56) {
                inv.setItem(slot, new ItemStack(Material.SADDLE, 1));
            }
            if (m > 59) {
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
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.BEE);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.CAT);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.MULE);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SLIME);
        }
    }
}
