package ru.OBC.BIOME;

import ru.OBC.Main.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.inventory.*;

public class chest
{
    private final Main plugin;
    
    public chest(final Main plugin2) {
        this.plugin = plugin2;
    }
    
    public void random(final int x, final int y, final int z, final Location loc, final Player p, final int prog) {
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 + Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 + Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 + Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 - Math.random(), y + 0.5 - Math.random(), z + 0.5 + Math.random()), 0);
        p.spawnParticle(Particle.HEART, new Location(p.getWorld(), x + 0.5 + Math.random(), y + 0.5 - Math.random(), z + 0.5 - Math.random()), 0);
        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)this.plugin, (Runnable)new Runnable() {
            @Override
            public void run() {
                if (prog == 1) {
                    chest.this.chestRandom(loc, p);
                    return;
                }
                if (prog == 2) {
                    chest.this.chestRandomPodzem(loc, p);
                    return;
                }
                if (prog == 3) {
                    chest.this.chestRandomSnez(loc, p);
                    return;
                }
                if (prog == 4) {
                    chest.this.chestRandomOshan(loc, p);
                    return;
                }
                if (prog == 5) {
                    chest.this.chestRandomGhangle(loc, p);
                    return;
                }
                if (prog == 6) {
                    chest.this.chestRandomRed(loc, p);
                    return;
                }
                if (prog == 7) {
                    chest.this.chestRandomNether(loc, p);
                    return;
                }
                if (prog == 8) {
                    chest.this.chestRandomIdilly(loc, p);
                    return;
                }
                if (prog == 9) {
                    chest.this.chestRandomDeath(loc, p);
                    return;
                }
                if (prog == 10) {
                    chest.this.chestRandomEnd(loc, p);
                    return;
                }
                if (prog == 11) {
                    chest.this.chestRandomPosle(loc, p);
                }
            }
        }, 1L);
    }
    
    private void chestRandom(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 300.0);
            if (m <= 5) {
                inv.setItem(slot, new ItemStack(Material.APPLE, slot));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.AZURE_BLUET, slot));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.CORNFLOWER, slot));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.BIRCH_SAPLING, 3));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.DANDELION, slot));
            }
            if (m <= 27 && m > 25) {
                inv.setItem(slot, new ItemStack(Material.EGG, 3));
            }
            if (m <= 32 && m > 27) {
                inv.setItem(slot, new ItemStack(Material.FLOWER_POT, 1));
            }
            if (m <= 37 && m > 32) {
                inv.setItem(slot, new ItemStack(Material.LEATHER, slot));
            }
            if (m <= 42 && m > 37) {
                inv.setItem(slot, new ItemStack(Material.MELON_SEEDS, 6));
            }
            if (m <= 43 && m > 42) {
                inv.setItem(slot, new ItemStack(Material.MUSIC_DISC_13));
            }
            if (m <= 48 && m > 43) {
                inv.setItem(slot, new ItemStack(Material.OAK_SAPLING));
            }
            if (m <= 53 && m > 48) {
                inv.setItem(slot, new ItemStack(Material.ORANGE_TULIP, slot));
            }
            if (m <= 58 && m > 53) {
                inv.setItem(slot, new ItemStack(Material.OXEYE_DAISY, slot));
            }
            if (m <= 63 && m > 58) {
                inv.setItem(slot, new ItemStack(Material.PINK_TULIP, slot));
            }
            if (m <= 68 && m > 63) {
                inv.setItem(slot, new ItemStack(Material.POPPY, slot));
            }
            if (m <= 70 && m > 68) {
                inv.setItem(slot, new ItemStack(Material.PUMPKIN_SEEDS, 4));
            }
            if (m <= 75 && m > 70) {
                inv.setItem(slot, new ItemStack(Material.RED_DYE, 10));
            }
            if (m <= 80 && m > 75) {
                inv.setItem(slot, new ItemStack(Material.POPPY, slot));
            }
            if (m <= 85 && m > 80) {
                inv.setItem(slot, new ItemStack(Material.RED_TULIP, slot));
            }
            if (m <= 90 && m > 85) {
                inv.setItem(slot, new ItemStack(Material.STICK, slot));
            }
            if (m <= 95 && m > 90) {
                inv.setItem(slot, new ItemStack(Material.SUNFLOWER, slot));
            }
            if (m <= 100 && m > 95) {
                inv.setItem(slot, new ItemStack(Material.WHEAT_SEEDS, 10));
            }
            if (m <= 105 && m > 100) {
                inv.setItem(slot, new ItemStack(Material.WHITE_TULIP, slot));
            }
            if (m <= 110 && m > 105) {
                inv.setItem(slot, new ItemStack(Material.YELLOW_DYE, slot));
            }
            if (m <= 200 && m > 105) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void chestRandomPodzem(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 101.0);
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
            if (m <= 100 && m > 45) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void chestRandomSnez(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 102.0);
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
            if (m <= 101 && m > 66) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void chestRandomOshan(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 200.0);
            if (m == 5) {
                inv.setItem(slot, new ItemStack(Material.BLUE_DYE, slot));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.COD_BUCKET, slot));
            }
            if (m <= 15 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.TUBE_CORAL, 3));
            }
            if (m <= 20 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.CYAN_DYE, slot));
            }
            if (m <= 25 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.DRIED_KELP, 3));
            }
            if (m <= 22 && m > 20) {
                inv.setItem(slot, new ItemStack(Material.HEART_OF_THE_SEA, 1));
            }
            if (m <= 27 && m > 22) {
                inv.setItem(slot, new ItemStack(Material.INK_SAC, slot));
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
                inv.setItem(slot, new ItemStack(Material.NAUTILUS_SHELL, slot));
            }
            if (m <= 49 && m > 44) {
                inv.setItem(slot, new ItemStack(Material.PRISMARINE_CRYSTALS, slot));
            }
            if (m <= 54 && m > 49) {
                inv.setItem(slot, new ItemStack(Material.PRISMARINE_SHARD, slot));
            }
            if (m <= 60 && m > 54) {
                inv.setItem(slot, new ItemStack(Material.PUFFERFISH_BUCKET, slot));
            }
            if (m <= 65 && m > 60) {
                inv.setItem(slot, new ItemStack(Material.SALMON_BUCKET, slot));
            }
            if (m <= 70 && m > 65) {
                inv.setItem(slot, new ItemStack(Material.SCUTE, slot));
            }
            if (m <= 75 && m > 70) {
                inv.setItem(slot, new ItemStack(Material.SEA_PICKLE, slot));
            }
            if (m <= 80 && m > 75) {
                inv.setItem(slot, new ItemStack(Material.SEAGRASS, slot));
            }
            if (m == 81) {
                inv.setItem(slot, new ItemStack(Material.TRIDENT, slot));
            }
            if (m <= 86 && m > 81) {
                inv.setItem(slot, new ItemStack(Material.TROPICAL_FISH_BUCKET, slot));
            }
            if (m <= 91 && m > 86) {
                inv.setItem(slot, new ItemStack(Material.TURTLE_EGG, slot));
            }
            if (m <= 96 && m > 91) {
                inv.setItem(slot, new ItemStack(Material.WATER_BUCKET, slot));
            }
            if (m > 96) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
    
    private void chestRandomGhangle(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 100.0);
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
    
    private void chestRandomRed(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
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
    
    private void chestRandomNether(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
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
    
    private void chestRandomIdilly(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
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
                inv.setItem(slot, new ItemStack(Material.FIRE_CHARGE, 3));
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
    
    private void chestRandomDeath(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
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
    
    private void chestRandomEnd(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
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
    
    private void chestRandomPosle(final Location loc, final Player p) {
        final Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        final Chest chest = (Chest)block.getState();
        final Inventory inv = chest.getInventory();
        chest.setCustomName("Доброжелательный сундук");
        chest.update();
        for (int slot = 0; slot < 27; ++slot) {
            final int m = (int)(Math.random() * 93.0);
            if (m == 1) {
                inv.setItem(slot, new ItemStack(Material.CREEPER_HEAD, 1));
            }
            if (m <= 3 && m > 1) {
                inv.setItem(slot, new ItemStack(Material.DIAMOND_HORSE_ARMOR, 1));
            }
            if (m <= 4 && m > 3) {
                inv.setItem(slot, new ItemStack(Material.ELYTRA, 1));
            }
            if (m <= 5 && m > 4) {
                inv.setItem(slot, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1));
            }
            if (m <= 10 && m > 5) {
                inv.setItem(slot, new ItemStack(Material.GOLDEN_APPLE, 3));
            }
            if (m <= 12 && m > 10) {
                inv.setItem(slot, new ItemStack(Material.GOLDEN_HORSE_ARMOR, 1));
            }
            if (m <= 13 && m > 12) {
                inv.setItem(slot, new ItemStack(Material.PLAYER_HEAD, 1));
            }
            if (m <= 14 && m > 13) {
                inv.setItem(slot, new ItemStack(Material.SKELETON_SKULL, 1));
            }
            if (m <= 15 && m > 14) {
                inv.setItem(slot, new ItemStack(Material.TOTEM_OF_UNDYING, 1));
            }
            if (m <= 16 && m > 15) {
                inv.setItem(slot, new ItemStack(Material.VILLAGER_SPAWN_EGG, 1));
            }
            if (m <= 17 && m > 16) {
                inv.setItem(slot, new ItemStack(Material.ZOMBIE_HEAD, 1));
            }
            if (m <= 18 && m > 17) {
                inv.setItem(slot, new ItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG, 1));
            }
            if (m > 17) {
                inv.setItem(slot, new ItemStack(Material.AIR));
            }
        }
    }
}
