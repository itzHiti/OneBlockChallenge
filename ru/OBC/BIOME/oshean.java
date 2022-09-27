package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.entity.*;

public class oshean
{
    private final Main plugin;
    
    public oshean(final Main plugin2) {
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
                final int d = (int)(Math.random() * 46.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.BLUE_TERRACOTTA);
                    return;
                }
                if (d <= 10 && d > 5) {
                    loc.getBlock().setType(Material.TUBE_CORAL_BLOCK);
                    return;
                }
                if (d <= 15 && d > 10) {
                    loc.getBlock().setType(Material.CYAN_TERRACOTTA);
                    return;
                }
                if (d <= 20 && d > 15) {
                    loc.getBlock().setType(Material.DARK_PRISMARINE);
                    return;
                }
                if (d <= 21 && d > 20) {
                    loc.getBlock().setType(Material.DIAMOND_ORE);
                    return;
                }
                if (d <= 26 && d > 21) {
                    loc.getBlock().setType(Material.DRIED_KELP_BLOCK);
                    return;
                }
                if (d <= 29 && d > 26) {
                    loc.getBlock().setType(Material.LAPIS_ORE);
                    return;
                }
                if (d <= 24 && d > 29) {
                    loc.getBlock().setType(Material.PRISMARINE);
                    return;
                }
                if (d <= 29 && d > 24) {
                    loc.getBlock().setType(Material.PRISMARINE_BRICKS);
                    return;
                }
                if (d <= 34 && d > 29) {
                    loc.getBlock().setType(Material.SAND);
                    return;
                }
                if (d <= 39 && d > 34) {
                    loc.getBlock().setType(Material.SEA_LANTERN);
                    return;
                }
                if (d <= 40 && d > 39) {
                    loc.getBlock().setType(Material.SPONGE);
                    return;
                }
                if (d == 41) {
                    oshean.this.chestRandom(loc, p);
                    return;
                }
                if (d == 42) {
                    oshean.this.mobRandom(loc, p);
                    return;
                }
                if (d == 43) {
                    final RandomTutorial randomTutorial = new RandomTutorial(oshean.this.plugin);
                    randomTutorial.random(x, y, z, loc, p);
                    return;
                }
                if (d == 44) {
                    final podzem podzem = new podzem(oshean.this.plugin);
                    podzem.random(x, y, z, loc, p);
                    return;
                }
                if (d == 45) {
                    final sneznii sneznii = new sneznii(oshean.this.plugin);
                    sneznii.random(x, y, z, loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: Дно Океана");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 300.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.BLUE_DYE, 2));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.COD_BUCKET, 1));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.TUBE_CORAL, 3));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.CYAN_DYE, 1));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.DRIED_KELP, 3));
            }
            if (m <= 22 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.HEART_OF_THE_SEA, 1));
            }
            if (m <= 27 && m > 22) {
                inv.setItem(slot, new ItemStack(Material.INK_SAC, 3));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.KELP, 6));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.LIGHT_BLUE_DYE));
            }
            if (m <= 42 && m > 37) {
                inv.setItem(slot, new ItemStack(Material.LILY_PAD));
            }
            if (m <= 43 && m > 42) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_WAIT));
            }
            if (m <= 44 && m > 43) {
                inv.setItem(slot, new ItemStack(Material.NAUTILUS_SHELL, 1));
            }
            if (m <= 49 && m > 44) {
                inv.setItem(slot, new ItemStack(Material.PRISMARINE_CRYSTALS, 1));
            }
            if (m <= 54 && m > 49) {
                inv.setItem(slot, new ItemStack(Material.PRISMARINE_SHARD, 1));
            }
            if (m <= 60 && m > 54) {
                inv.setItem(slot, new ItemStack(Material.PUFFERFISH_BUCKET, 1));
            }
            if (m <= 65 && m > 60) {
                inv.setItem(slot, new ItemStack(Material.SALMON_BUCKET, 1));
            }
            if (m <= 70 && m > 65) {
                inv.setItem(slot, new ItemStack(Material.SCUTE, 1));
            }
            if (m <= 75 && m > 70) {
                inv.setItem(slot, new ItemStack(Material.SEA_PICKLE, 1));
            }
            if (m <= 80 && m > 75) {
                inv.setItem(slot, new ItemStack(Material.SEAGRASS, 1));
            }
            if (m == 81) {
                inv.setItem(slot, new ItemStack(Material.TRIDENT, 1));
            }
            if (m <= 86 && m > 81) {
                inv.setItem(slot, new ItemStack(Material.TROPICAL_FISH_BUCKET, 1));
            }
            if (m <= 91 && m > 86) {
                inv.setItem(slot, new ItemStack(Material.TURTLE_EGG, 1));
            }
            if (m <= 96 && m > 91) {
                inv.setItem(slot, new ItemStack(Material.WATER_BUCKET, 1));
            }
            if (m > 96) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void mobRandom(final Location loc, final Player p) {
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final int d = (int)(Math.random() * 10.0);
        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
        for (int partical = 0; partical < 5; ++partical) {
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 + Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 2.5 - Math.random(), z + 0.5 + Math.random()), 0);
            p.spawnParticle(Particle.CLOUD, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 2.5 - Math.random(), z + 0.5 - Math.random()), 0);
        }
        if (d == 0) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.COD);
        }
        if (d == 1) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.DOLPHIN);
        }
        if (d == 2) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.DROWNED);
        }
        if (d == 3) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.ELDER_GUARDIAN);
        }
        if (d == 4) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.GUARDIAN);
        }
        if (d == 5) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.PUFFERFISH);
        }
        if (d == 6) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SALMON);
        }
        if (d == 7) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.SQUID);
        }
        if (d == 8) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.TROPICAL_FISH);
        }
        if (d == 9) {
            loc.getBlock().setType(Material.STONE);
            loc.getWorld().spawnEntity(new Location(loc.getWorld(), loc.getX() + 0.5, loc.getY() + 2.0, loc.getZ() + 0.5), EntityType.TURTLE);
        }
    }
}
