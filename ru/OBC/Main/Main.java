package ru.OBC.Main;

import org.bukkit.plugin.java.*;
import java.util.logging.*;
import java.io.*;
import org.bukkit.configuration.file.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;
import org.bukkit.*;
import ru.OBC.*;

public class Main extends JavaPlugin
{
    Logger log;
    public File file;
    public FileConfiguration fileConfig;
    public File file2;
    public FileConfiguration fileConfig2;
    FileConfiguration conf;
    
    public Main() {
        this.log = Logger.getLogger("Minecraft");
        this.file = new File(this.getDataFolder() + File.separator + "config.yml");
        this.fileConfig = (FileConfiguration)YamlConfiguration.loadConfiguration(this.file);
        this.file2 = new File(this.getDataFolder() + File.separator + "data.yml");
        this.fileConfig2 = (FileConfiguration)YamlConfiguration.loadConfiguration(this.file);
        this.conf = this.getConfig();
    }
    
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents((Listener)new ListenerE(this), (Plugin)this);
        this.getCommand("config").setExecutor((CommandExecutor)new jsonx(this));
        Bukkit.getPluginManager().registerEvents((Listener)new jsonx(this), (Plugin)this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " / ");
        this.log.info("Enabled.");
        if (!this.file.exists()) {
            this.saveResource("config.yml", true);
        }
        this.getCommand("OBC").setExecutor((CommandExecutor)new rl(this));
        this.saveDefaultConfig();
        if (!this.file2.exists()) {
            this.fileConfig2.set("Command", (Object)"data");
            this.saveCfg();
        }
    }
    
    private void saveCfg() {
        try {
            this.fileConfig2.save(this.file2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void onDisable() {
        this.saveConfig();
    }
}
