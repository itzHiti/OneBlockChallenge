package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class END
{
    private final Main plugin;
    
    public END(final Main plugin2) {
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
                final int d = (int)(Math.random() * 40.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.END_STONE);
                    return;
                }
                if (d <= 10 && d > 5) {
                    loc.getBlock().setType(Material.END_STONE_BRICKS);
                    return;
                }
                if (d <= 15 && d > 10) {
                    loc.getBlock().setType(Material.PINK_TERRACOTTA);
                    return;
                }
                if (d <= 20 && d > 15) {
                    loc.getBlock().setType(Material.PURPLE_TERRACOTTA);
                    return;
                }
                if (d <= 25 && d > 20) {
                    loc.getBlock().setType(Material.PURPUR_BLOCK);
                    return;
                }
                if (d <= 30 && d > 25) {
                    loc.getBlock().setType(Material.PURPUR_PILLAR);
                    return;
                }
                if (d == 31) {
                    END.this.chestRandom(loc, p);
                    return;
                }
                if (d == 32) {
                    END.this.mobRandom(loc, p);
                    return;
                }
                if (d == 33) {
                    final RandomTutorial randomTutorial = new RandomTutorial(END.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 34) {
                    final podzem podzem = new podzem(END.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 35) {
                    final sneznii sneznii = new sneznii(END.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 36) {
                    final oshean oshean = new oshean(END.this.plugin);
                    oshean.random(x, y, z, loc, p);
                    return;
                }
                if (d == 37) {
                    final ghangl ghangl = new ghangl(END.this.plugin);
                    ghangl.random(x, y, z, loc, p);
                    return;
                }
                if (d == 38) {
                    final NETHER NETHER = new NETHER(END.this.plugin);
                    NETHER.random(x, y, z, loc, p);
                    return;
                }
                if (d == 39) {
                    final IDILIY IDILIY = new IDILIY(END.this.plugin);
                    IDILIY.random(x, y, z, loc, p);
                    return;
                }
                if (d == 40) {
                    final IDILIY IDILIY = new IDILIY(END.this.plugin);
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
        chest.setCustomName("Сундук фазы: Край");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 109.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.CHORUS_FRUIT, 6));
            }
            if (m <= 7 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.DRAGON_BREATH, slot));
            }
            if (m <= 10 && m > 7) {
                inv.setItem(slot, new ItemStack(Material.END_ROD, 2));
            }
            if (m <= 13 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.ENDER_EYE, 1));
            }
            if (m <= 16 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.ENDER_PEARL, 2));
            }
            if (m <= 21 && m > 16) {
                inv.setItem(slot, new ItemStack(Material.MAGENTA_DYE, 5));
            }
            if (m <= 22 && m > 21) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_FAR, 1));
            }
            if (m <= 23 && m > 22) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_MALL, 1));
            }
            if (m <= 24 && m > 23) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_MELLOHI, 1));
            }
            if (m <= 29 && m > 24) {
                inv.setItem(slot, new ItemStack(Material.PURPLE_DYE));
            }
            if (m <= 34 && m > 29) {
                inv.setItem(slot, new ItemStack(Material.SPECTRAL_ARROW));
            }
            if (m > 34) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void mobRandom(final Location loc, final Player p) {
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final int d = (int)(Math.random() * 3.0);
        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
        for (int partical = 0; partical < 5; ++partical) {
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 + Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
        }
        if (d == 0) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ENDERMAN);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ENDERMITE);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SHULKER);
        }
    }
}
