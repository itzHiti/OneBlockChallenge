package ru.OBC.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


import ru.OBC.ListenerE;
import ru.OBC.rl;

import java.io.File;
import java.util.logging.Logger;

public class Main extends JavaPlugin {
	


    Logger log = Logger.getLogger("Minecraft");
    //�������� ������ � �������
    public File file = new File(getDataFolder() + File.separator + "config.yml");
    public FileConfiguration fileConfig = YamlConfiguration.loadConfiguration(file);
    //� ���� ���� ���������� - fileConfig - ��� ������ ����� config.yml
    public File file2 = new File(getDataFolder() + File.separator + "data.yml");
    public FileConfiguration fileConfig2 = YamlConfiguration.loadConfiguration(file);
    //� ���� ���� ���������� - fileConfig2 - ��� ���. ������ ����� playerdata.yml

    FileConfiguration conf = getConfig();


    public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new ListenerE(this), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " / "); // ���������� ����� � ������� ��� ����� ������ ������, �� ��?
        log.info("Enabled.");
        if (!this.file.exists() ) {    //���� ����� �� ����������
            saveResource("config.yml", true); //�� ����������� ��� �������  ������� ���. ������ ����� config.yml
        }
        getCommand("OBC").setExecutor(new rl(this));


        saveDefaultConfig();
        if (!this.file2.exists() ) {    //���� ����� �� ����������
            this.fileConfig2.set("Command","data" ); // �� ����������� ���������� Config2 -������ �� ������� Command- � ��������� -data
            saveCfg();    // ��������� ������ �� ���������� � ������ custom.yml
            // � ������ saveCfg();  �� ������� ����� ����
        }}
    private void saveCfg() {
        try {
            fileConfig2.save(file2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void onDisable() {
        this.saveConfig();
    }

}
