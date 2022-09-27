package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class RED_PYSTINA
{
    private final Main plugin;
    
    public RED_PYSTINA(final Main plugin2) {
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
                final int d = (int)(Math.random() * 65.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.BROWN_TERRACOTTA);
                    return;
                }
                if (d <= 7 && d > 5) {
                    loc.getBlock().setType(Material.EMERALD_ORE);
                    return;
                }
                if (d <= 12 && d > 7) {
                    loc.getBlock().setType(Material.HAY_BLOCK);
                    return;
                }
                if (d <= 17 && d > 12) {
                    loc.getBlock().setType(Material.ORANGE_TERRACOTTA);
                    return;
                }
                if (d <= 22 && d > 17) {
                    loc.getBlock().setType(Material.RED_SAND);
                    return;
                }
                if (d <= 27 && d > 22) {
                    loc.getBlock().setType(Material.RED_SANDSTONE);
                    return;
                }
                if (d <= 32 && d > 27) {
                    loc.getBlock().setType(Material.RED_TERRACOTTA);
                    return;
                }
                if (d <= 37 && d > 32) {
                    loc.getBlock().setType(Material.SANDSTONE);
                    return;
                }
                if (d <= 42 && d > 37) {
                    loc.getBlock().setType(Material.TERRACOTTA);
                    return;
                }
                if (d <= 47 && d > 42) {
                    loc.getBlock().setType(Material.WHITE_CONCRETE);
                    return;
                }
                if (d <= 52 && d > 47) {
                    loc.getBlock().setType(Material.WHITE_TERRACOTTA);
                    return;
                }
                if (d <= 57 && d > 52) {
                    loc.getBlock().setType(Material.YELLOW_TERRACOTTA);
                    return;
                }
                if (d == 58) {
                    RED_PYSTINA.this.chestRandom(loc, p);
                    return;
                }
                if (d == 59) {
                    RED_PYSTINA.this.mobRandom(loc, p);
                    return;
                }
                if (d == 60) {
                    final RandomTutorial randomTutorial = new RandomTutorial(RED_PYSTINA.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 61) {
                    final podzem podzem = new podzem(RED_PYSTINA.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 62) {
                    final sneznii sneznii = new sneznii(RED_PYSTINA.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                    return;
                }
                if (d == 463) {
                    final oshean oshean = new oshean(RED_PYSTINA.this.plugin);
                    oshean.random(x, y, z, loc, p);
                    return;
                }
                if (d == 64) {
                    final ghangl ghangl = new ghangl(RED_PYSTINA.this.plugin);
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
        chest.setCustomName("Сундук фазы: Красная Пустыня");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 70.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.ACACIA_SAPLING, 3));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.BROWN_DYE, 5));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.CACTUS, 3));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.DEAD_BUSH, 3));
            }
            if (m <= 22 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.EMERALD, 1));
            }
            if (m <= 25 && m > 22) {
                inv.setItem(slot, new ItemStack(Material.EXPERIENCE_BOTTLE, 1));
            }
            if (m <= 26 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_STRAD, 1));
            }
            if (m <= 30 && m > 26) {
                inv.setItem(slot, new ItemStack(Material.REDSTONE, 6));
            }
            if (m <= 33 && m > 30) {
                inv.setItem(slot, new ItemStack(Material.SLIME_BALL, 4));
            }
            if (m > 33) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void mobRandom(final Location loc, final Player p) {
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final int d = (int)(Math.random() * 7.0);
        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
        for (int partical = 0; partical < 5; ++partical) {
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 + Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
        }
        if (d == 0) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.DONKEY);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.HUSK);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.LLAMA);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.PILLAGER);
        }
        if (d == 4) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.VILLAGER);
        }
        if (d == 5) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.VINDICATOR);
        }
        if (d == 6) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.WANDERING_TRADER);
        }
    }
}
