package ru.OBC;

import org.bukkit.scheduler.*;
import org.bukkit.entity.*;
import net.md_5.bungee.api.chat.hover.content.*;
import net.md_5.bungee.api.chat.*;
import org.bukkit.*;

public class Timer extends BukkitRunnable
{
    private Player player;
    int time;
    World w;
    Location loc;
    ArmorStand a;
    
    public Timer(final Player player) {
        this.time = 100;
        this.w = Bukkit.getWorld("world");
        this.loc = new Location(this.w, 0.5, 61.0, 0.5);
        this.a = (ArmorStand)this.loc.getWorld().spawnEntity(this.loc, EntityType.ARMOR_STAND);
        this.player = player;
    }
    
    public void run() {
        if (this.time <= 0) {
            this.cancel();
            this.a.remove();
            this.loc.getBlock().setType(Material.GRASS_BLOCK);
            final TextComponent join = new TextComponent("§7§o  [?] Нажми сюда, чтобы открыть меню помощи.");
            join.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            join.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { (Content)new Text("Открывает меню помощи.") }));
            this.player.sendMessage("§eВы открыли новый биом!");
            this.player.spigot().sendMessage((BaseComponent)join);
            return;
        }
        this.loc.getBlock().setType(Material.BEDROCK);
        this.a.setVisible(false);
        final String str = Integer.toString(this.time);
        this.a.setCustomName(ChatColor.GREEN + str);
        this.a.setCustomNameVisible(true);
        this.a.setGravity(false);
        --this.time;
    }
}
