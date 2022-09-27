package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.plugin.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;

public class POSLEFAZA
{
    private final Main plugin;
    
    public POSLEFAZA(final Main plugin2) {
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
                final int d = (int)(Math.random() * 44.0);
                if (d <= 5) {
                    loc.getBlock().setType(Material.COAL_BLOCK);
                    return;
                }
                if (d <= 8 && d > 5) {
                    loc.getBlock().setType(Material.DIAMOND_BLOCK);
                    return;
                }
                if (d <= 11 && d > 8) {
                    loc.getBlock().setType(Material.EMERALD_BLOCK);
                    return;
                }
                if (d <= 16 && d > 11) {
                    loc.getBlock().setType(Material.BLACK_GLAZED_TERRACOTTA);
                    return;
                }
                if (d <= 20 && d > 16) {
                    loc.getBlock().setType(Material.GOLD_BLOCK);
                    return;
                }
                if (d <= 24 && d > 20) {
                    loc.getBlock().setType(Material.HONEY_BLOCK);
                    return;
                }
                if (d <= 29 && d > 24) {
                    loc.getBlock().setType(Material.IRON_BLOCK);
                    return;
                }
                if (d <= 34 && d > 29) {
                    loc.getBlock().setType(Material.LAPIS_BLOCK);
                    return;
                }
                if (d <= 39 && d > 34) {
                    loc.getBlock().setType(Material.REDSTONE_BLOCK);
                    return;
                }
                if (d <= 42 && d > 39) {
                    loc.getBlock().setType(Material.SLIME_BLOCK);
                    return;
                }
                if (d == 43) {
                    POSLEFAZA.this.chestRandom(loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Сундук фазы: ПослеФаза");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 19.0);
            if (m == 1) {
                inv.setItem(slot, new ItemStack(Material.CREEPER_HEAD, 64));
            }
            if (m <= 3 && m > 1) {
                inv.setItem(slot, new ItemStack(Material.DIAMOND_HORSE_ARMOR, 64));
            }
            if (m <= 4 && m > 3) {
                inv.setItem(slot, new ItemStack(Material.ELYTRA, 64));
            }
            if (m <= 5 && m > 4) {
                inv.setItem(slot, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.GOLDEN_APPLE, 64));
            }
            if (m <= 12 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.GOLDEN_HORSE_ARMOR, 64));
            }
            if (m <= 13 && m > 12) {
                inv.setItem(slot, new ItemStack(Material.PLAYER_HEAD, 64));
            }
            if (m <= 14 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.SKELETON_SKULL, 64));
            }
            if (m <= 15 && m > 14) {
                inv.setItem(slot, new ItemStack(Material.TOTEM_OF_UNDYING, 64));
            }
            if (m <= 16 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.VILLAGER_SPAWN_EGG, 64));
            }
            if (m <= 17 && m > 16) {
                inv.setItem(slot, new ItemStack(Material.ZOMBIE_HEAD, 64));
            }
            if (m <= 18 && m > 17) {
                inv.setItem(slot, new ItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG, 64));
            }
        }
    }
}
