package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class DEATH_PYSTINA
{
    private final Main plugin;
    
    public DEATH_PYSTINA(final Main plugin2) {
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
                final int d = (int)(Math.random() * 53.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.BLACK_TERRACOTTA);
                    return;
                }
                if (d <= 8 && d > 5) {
                    loc.getBlock().setType(Material.BONE_BLOCK);
                    return;
                }
                if (d <= 13 && d > 8) {
                    loc.getBlock().setType(Material.CHISELED_STONE_BRICKS);
                    return;
                }
                if (d <= 18 && d > 13) {
                    loc.getBlock().setType(Material.CRACKED_STONE_BRICKS);
                    return;
                }
                if (d <= 23 && d > 18) {
                    loc.getBlock().setType(Material.JACK_O_LANTERN);
                    return;
                }
                if (d <= 28 && d > 23) {
                    loc.getBlock().setType(Material.LIGHT_GRAY_TERRACOTTA);
                    return;
                }
                if (d <= 33 && d > 28) {
                    loc.getBlock().setType(Material.MOSSY_STONE_BRICKS);
                    return;
                }
                if (d <= 38 && d > 33) {
                    loc.getBlock().setType(Material.MYCELIUM);
                    return;
                }
                if (d <= 43 && d > 38) {
                    loc.getBlock().setType(Material.STONE_BRICKS);
                    return;
                }
                if (d == 44) {
                    DEATH_PYSTINA.this.chestRandom(loc, p);
                    return;
                }
                if (d == 45) {
                    DEATH_PYSTINA.this.mobRandom(loc, p);
                    return;
                }
                if (d == 46) {
                    final RandomTutorial randomTutorial = new RandomTutorial(DEATH_PYSTINA.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 47) {
                    final podzem podzem = new podzem(DEATH_PYSTINA.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 48) {
                    final sneznii sneznii = new sneznii(DEATH_PYSTINA.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 49) {
                    final oshean oshean = new oshean(DEATH_PYSTINA.this.plugin);
                    oshean.random(x, y, z, loc, p);
                    return;
                }
                if (d == 50) {
                    final ghangl ghangl = new ghangl(DEATH_PYSTINA.this.plugin);
                    ghangl.random(x, y, z, loc, p);
                    return;
                }
                if (d == 51) {
                    final NETHER NETHER = new NETHER(DEATH_PYSTINA.this.plugin);
                    NETHER.random(x, y, z, loc, p);
                    return;
                }
                if (d == 52) {
                    final IDILIY IDILIY = new IDILIY(DEATH_PYSTINA.this.plugin);
                    IDILIY.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Пустынные Земли");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 112.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.BLACK_DYE, 5));
            }
            if (m <= 8 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.FERMENTED_SPIDER_EYE, 2));
            }
            if (m <= 13 && m > 8) {
                inv.setItem(slot, new ItemStack(Material.GRAY_DYE, 5));
            }
            if (m <= 16 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.GUNPOWDER, 6));
            }
            if (m <= 19 && m > 16) {
                inv.setItem(slot, new ItemStack(Material.LANTERN, 3));
            }
            if (m <= 20 && m > 19) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_11, 1));
            }
            if (m <= 22 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.PHANTOM_MEMBRANE, 3));
            }
            if (m <= 27 && m > 22) {
                inv.setItem(slot, new ItemStack(Material.POISONOUS_POTATO, 4));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.ROTTEN_FLESH, 4));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.WITHER_ROSE, 2));
            }
            if (m > 37) {
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
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.CAVE_SPIDER);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.PHANTOM);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SILVERFISH);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SKELETON);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SKELETON_HORSE);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.VEX);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ZOMBIE_HORSE);
        }
    }
}
