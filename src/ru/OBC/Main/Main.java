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
    //Получить доступ к консоли
    public File file = new File(getDataFolder() + File.separator + "config.yml");
    public FileConfiguration fileConfig = YamlConfiguration.loadConfiguration(file);
    //В этом коде переменная - fileConfig - для конфиг файла config.yml
    public File file2 = new File(getDataFolder() + File.separator + "data.yml");
    public FileConfiguration fileConfig2 = YamlConfiguration.loadConfiguration(file);
    //В этом коде переменная - fileConfig2 - для доп. конфиг файла playerdata.yml

    FileConfiguration conf = getConfig();


    public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new ListenerE(this), this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + " / "); // оформление ебашь с красным или каким хочешь цветом, ок да?
        log.info("Enabled.");
        if (!this.file.exists() ) {    //Если файла не существует
            saveResource("config.yml", true); //То копирование при запуске  сервера доп. конфиг файла config.yml
        }
        getCommand("OBC").setExecutor(new rl(this));


        saveDefaultConfig();
        if (!this.file2.exists() ) {    //Если файла не существует
            this.fileConfig2.set("Command","data" ); // То присваиваем переменной Config2 -данные со строкой Command- и значением -data
            saveCfg();    // Сохраняем данные из переменной в конфиг custom.yml
            // к строке saveCfg();  Мы создаем метод ниже
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
