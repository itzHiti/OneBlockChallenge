package ru.OBC;

import ru.OBC.Main.*;
import org.bukkit.event.player.*;
import org.bukkit.entity.*;
import java.util.*;
import org.bukkit.scoreboard.*;
import org.bukkit.event.*;
import org.bukkit.event.block.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;
import ru.OBC.BIOME.*;
import org.bukkit.*;

public class ListenerE implements Listener
{
    Team breaker;
    private Main plugin;
    
    public ListenerE(final Main main) {
        this.plugin = main;
    }
    
    @EventHandler
    private void onPlayerJoin(final PlayerJoinEvent e) {
        final Player p = e.getPlayer();
        final Scoreboard s = p.getScoreboard();
        Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective objective = s.getObjective("blocks");
        if (objective == null) {
            s.registerNewObjective("blocks", "dummy");
        }
        objective.setDisplaySlot(DisplaySlot.PLAYER_LIST);
        objective.setDisplayName("blocks");
        for (final Player online : Bukkit.getOnlinePlayers()) {
            online.setScoreboard(s);
        }
        objective.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
        final Score x = objective.getScore(p.getDisplayName());
        final int score = x.getScore();
        this.breaker = s.getTeam("breaker");
        if (this.breaker == null) {
            s.registerNewTeam("0");
            (this.breaker = s.getTeam("0")).setSuffix(" §e" + this.plugin.getConfig().getInt(p + ".progress"));
        }
        if (score == 0) {
            this.breaker.addEntry(e.getPlayer().getName());
        }
    }
    
    @EventHandler
    private void blockevent(final BlockBreakEvent e) {
        final Location loc = e.getBlock().getLocation();
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final Player p = e.getPlayer();
        final World w = p.getWorld();
        if (x == 0 && z == 0 && y == 61) {
            if (p.getLocation().getBlockX() == 0 && p.getLocation().getBlockZ() == 0 && p.getLocation().getBlockY() == 62) {
                final Location tp = new Location(p.getLocation().getWorld(), p.getLocation().getX(), p.getLocation().getY() + 0.1, p.getLocation().getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
                p.teleport(tp);
            }
            final int prog = this.plugin.getConfig().getInt("block1.progress");
            if (prog <= 251) {
                final RandomTutorial randomTutorial = new RandomTutorial(this.plugin);
                randomTutorial.random(x, y, z, loc, p);
            }
            if (prog == 252) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 1);
            }
            if (prog == 253) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 10;
            }
            if (prog >= 254 && prog <= 682) {
                final podzem podzem = new podzem(this.plugin);
                podzem.random(x, y, z, loc, p);
            }
            if (prog == 683) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 2);
            }
            if (prog == 684) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 20;
            }
            if (prog >= 685 && prog <= 1386) {
                final sneznii sneznii = new sneznii(this.plugin);
                sneznii.random(x, y, z, loc, p);
            }
            if (prog == 1387) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 3);
            }
            if (prog == 1388) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 30;
            }
            if (prog >= 1389 && prog <= 2152) {
                final oshean oshean = new oshean(this.plugin);
                oshean.random(x, y, z, loc, p);
            }
            if (prog == 2153) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 4);
            }
            if (prog == 2154) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 40;
            }
            if (prog >= 2155 && prog <= 2910) {
                final ghangl ghangl = new ghangl(this.plugin);
                ghangl.random(x, y, z, loc, p);
            }
            if (prog == 2911) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 5);
            }
            if (prog == 2912) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 50;
            }
            if (prog >= 2913 && prog <= 3709) {
                final RED_PYSTINA RED_PYSTINA = new RED_PYSTINA(this.plugin);
                RED_PYSTINA.random(x, y, z, loc, p);
            }
            if (prog == 3710) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 6);
            }
            if (prog == 3711) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 60;
            }
            if (prog >= 3712 && prog <= 4491) {
                final NETHER NETHER = new NETHER(this.plugin);
                NETHER.random(x, y, z, loc, p);
            }
            if (prog == 4492) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 7);
            }
            if (prog == 4493) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 60;
            }
            if (prog >= 4494 && prog <= 5191) {
                final IDILIY IDILIY = new IDILIY(this.plugin);
                IDILIY.random(x, y, z, loc, p);
            }
            if (prog == 5192) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 8);
            }
            if (prog == 5193) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 60;
            }
            if (prog >= 5194 && prog <= 5988) {
                final DEATH_PYSTINA DEATH_PYSTINA = new DEATH_PYSTINA(this.plugin);
                DEATH_PYSTINA.random(x, y, z, loc, p);
            }
            if (prog == 5989) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 9);
            }
            if (prog == 5990) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 60;
            }
            if (prog >= 5991 && prog <= 7035) {
                final END END = new END(this.plugin);
                END.random(x, y, z, loc, p);
            }
            if (prog == 7036) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 0, loc, p, 10);
            }
            if (prog == 7037) {
                final Timer timer = new Timer(p);
                timer.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer.time = 60;
            }
            if (prog == 7038) {
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill ~2 ~-2 ~1 ~2 ~-2 ~-1 minecraft:end_portal_frame[eye=true,facing=west]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock ~2 ~-2 ~ minecraft:end_portal_frame[eye=false,facing=west]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill ~-2 ~-2 ~1 ~-2 ~-2 ~-1 minecraft:end_portal_frame[eye=true,facing=east]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock ~-2 ~-2 ~ minecraft:end_portal_frame[eye=false,facing=east]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill ~1 ~-2 ~2 ~-1 ~-2 ~2 minecraft:end_portal_frame[eye=true,facing=north]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock ~ ~-2 ~2 minecraft:end_portal_frame[eye=false,facing=north]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill ~1 ~-2 ~-2 ~-1 ~-2 ~-2 minecraft:end_portal_frame[eye=true,facing=south]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock ~ ~-2 ~-2 minecraft:end_portal_frame[eye=false,facing=south]");
            }
            if (prog >= 7038) {
                final POSLEFAZA POSLEFAZA = new POSLEFAZA(this.plugin);
                POSLEFAZA.random(x, y, z, loc, p);
            }
            final Scoreboard s = p.getScoreboard();
            Bukkit.getScoreboardManager().getNewScoreboard();
            final Objective objective = s.getObjective("Блоков");
            if (objective == null) {
                s.registerNewObjective("Блоков", "dummy");
            }
            final Objective objective2 = s.getObjective("blocks2");
            if (objective2 == null) {
                s.registerNewObjective("blocks2", "dummy");
            }
            this.plugin.getConfig().set("block1.progress", (Object)(this.plugin.getConfig().getInt("block1.progress") + 1));
            this.plugin.getConfig().set(p + ".progress", (Object)(this.plugin.getConfig().getInt(p + ".progress") + 1));
            this.plugin.saveConfig();
            objective.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
            objective2.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
            this.plugin.saveConfig();
            objective.setDisplaySlot(DisplaySlot.BELOW_NAME);
            objective2.setDisplayName("Блоков");
            objective2.setDisplaySlot(DisplaySlot.SIDEBAR);
            objective2.setDisplayName("§6§lСломано блоков: ");
            for (final Player online : Bukkit.getOnlinePlayers()) {
                online.setScoreboard(s);
            }
        }
    }
    
    @EventHandler
    private void blockevent2(final BlockBreakEvent e) {
        final Location loc = e.getBlock().getLocation();
        final int x = loc.getBlockX();
        final int y = loc.getBlockY();
        final int z = loc.getBlockZ();
        final Player p = e.getPlayer();
        final World w = p.getWorld();
        if (x == 0 && z == 20 && y == 61) {
            if (p.getLocation().getBlockX() == 0 && p.getLocation().getBlockZ() == 20 && p.getLocation().getBlockY() == 62) {
                final Location tp = new Location(p.getLocation().getWorld(), p.getLocation().getX(), p.getLocation().getY() + 0.1, p.getLocation().getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
                p.teleport(tp);
            }
            final int prog = this.plugin.getConfig().getInt("block2.progress");
            if (prog <= 251) {
                final RandomTutorial randomTutorial = new RandomTutorial(this.plugin);
                randomTutorial.random(x, y, z, loc, p);
            }
            if (prog == 252) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 1);
            }
            if (prog == 253) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 10;
            }
            if (prog >= 254 && prog <= 682) {
                final podzem podzem = new podzem(this.plugin);
                podzem.random(x, y, z, loc, p);
            }
            if (prog == 683) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 2);
            }
            if (prog == 684) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 20;
            }
            if (prog >= 685 && prog <= 1386) {
                final sneznii sneznii = new sneznii(this.plugin);
                sneznii.random(x, y, z, loc, p);
            }
            if (prog == 1387) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 3);
            }
            if (prog == 1388) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 30;
            }
            if (prog >= 1389 && prog <= 2152) {
                final oshean oshean = new oshean(this.plugin);
                oshean.random(x, y, z, loc, p);
            }
            if (prog == 2153) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 4);
            }
            if (prog == 2154) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 40;
            }
            if (prog >= 2155 && prog <= 2910) {
                final ghangl ghangl = new ghangl(this.plugin);
                ghangl.random(x, y, z, loc, p);
            }
            if (prog == 2911) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 5);
            }
            if (prog == 2912) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 50;
            }
            if (prog >= 2913 && prog <= 3709) {
                final RED_PYSTINA RED_PYSTINA = new RED_PYSTINA(this.plugin);
                RED_PYSTINA.random(x, y, z, loc, p);
            }
            if (prog == 3710) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 6);
            }
            if (prog == 3711) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 60;
            }
            if (prog >= 3712 && prog <= 4491) {
                final NETHER NETHER = new NETHER(this.plugin);
                NETHER.random(x, y, z, loc, p);
            }
            if (prog == 4492) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 7);
            }
            if (prog == 4493) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 60;
            }
            if (prog >= 4494 && prog <= 5191) {
                final IDILIY IDILIY = new IDILIY(this.plugin);
                IDILIY.random(x, y, z, loc, p);
            }
            if (prog == 5192) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 8);
            }
            if (prog == 5193) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 60;
            }
            if (prog >= 5194 && prog <= 5988) {
                final DEATH_PYSTINA DEATH_PYSTINA = new DEATH_PYSTINA(this.plugin);
                DEATH_PYSTINA.random(x, y, z, loc, p);
            }
            if (prog == 5989) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 9);
            }
            if (prog == 5990) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 60;
            }
            if (prog >= 5991 && prog <= 7035) {
                final END END = new END(this.plugin);
                END.random(x, y, z, loc, p);
            }
            if (prog == 7036) {
                final chest chest = new chest(this.plugin);
                chest.random(0, 61, 20, loc, p, 10);
            }
            if (prog == 7037) {
                final Timer2 timer2 = new Timer2(p);
                timer2.runTaskTimer((Plugin)this.plugin, 0L, 20L);
                timer2.time = 60;
            }
            if (prog == 7038) {
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill -2 55 17 0 55 17 minecraft:end_portal_frame[facing=south,eye=true]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock -1 55 17 minecraft:end_portal_frame[facing=south,eye=false]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill 1 55 18 1 55 20 minecraft:end_portal_frame[facing=west,eye=true]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock 1 55 19 minecraft:end_portal_frame[facing=west]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill 0 55 21 -2 55 21 minecraft:end_portal_frame[eye=true]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock -1 55 21 minecraft:end_portal_frame");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "fill -3 55 20 -3 55 18 minecraft:end_portal_frame[facing=east,eye=true]");
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), "setblock -3 55 19 minecraft:end_portal_frame[facing=east]");
            }
            if (prog >= 7038) {
                final POSLEFAZA POSLEFAZA = new POSLEFAZA(this.plugin);
                POSLEFAZA.random(x, y, z, loc, p);
            }
            final Scoreboard s = p.getScoreboard();
            Bukkit.getScoreboardManager().getNewScoreboard();
            final Objective objective3 = s.getObjective("Блоков");
            if (objective3 == null) {
                s.registerNewObjective("Блоков", "dummy");
            }
            final Objective objective4 = s.getObjective("blocks4");
            if (objective4 == null) {
                s.registerNewObjective("blocks4", "dummy");
            }
            this.plugin.getConfig().set("block2.progress", (Object)(this.plugin.getConfig().getInt("block2.progress") + 1));
            this.plugin.getConfig().set(p + ".progress", (Object)(this.plugin.getConfig().getInt(p + ".progress") + 1));
            this.plugin.saveConfig();
            objective3.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
            objective4.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
            objective3.setDisplaySlot(DisplaySlot.BELOW_NAME);
            objective4.setDisplayName("Блоков");
            objective4.setDisplaySlot(DisplaySlot.SIDEBAR);
            objective4.setDisplayName("§6§lСломано блоков: ");
            for (final Player online : Bukkit.getOnlinePlayers()) {
                online.setScoreboard(s);
            }
        }
        final Scoreboard s2 = p.getScoreboard();
        Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective objective5 = s2.getObjective("Блоков");
        if (objective5 == null) {
            s2.registerNewObjective("Блоков", "dummy");
        }
        final Objective objective6 = s2.getObjective("blocks2");
        if (objective6 == null) {
            s2.registerNewObjective("blocks2", "dummy");
        }
        Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective objective7 = s2.getObjective("Блоков");
        if (objective7 == null) {
            s2.registerNewObjective("Блоков", "dummy");
        }
        final Objective objective8 = s2.getObjective("blocks4");
        if (objective8 == null) {
            s2.registerNewObjective("blocks4", "dummy");
        }
        objective5.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
        objective6.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
        objective5.setDisplaySlot(DisplaySlot.BELOW_NAME);
        objective6.setDisplayName("Блоков");
        objective6.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective6.setDisplayName("§6§lСломано блоков: ");
        objective7.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
        objective8.getScore(p.getDisplayName()).setScore(this.plugin.getConfig().getInt(p + ".progress"));
        objective7.setDisplaySlot(DisplaySlot.BELOW_NAME);
        objective8.setDisplayName("Блоков");
        objective8.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective8.setDisplayName("§6§lСломано блоков: ");
    }
}
