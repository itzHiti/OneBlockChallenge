package ru.OBC;

import ru.OBC.Main.*;
import org.bukkit.event.player.*;
import net.md_5.bungee.api.chat.hover.content.*;
import net.md_5.bungee.api.chat.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import org.bukkit.command.*;

public class jsonx implements CommandExecutor, Listener
{
    private Main plugin;
    
    public jsonx(final Main plugin) {
        this.plugin = plugin;
    }
    
    @EventHandler
    private void onPlayerJoin(final PlayerJoinEvent e) {
        final TextComponent join = new TextComponent("�7�o  [?] ����� ����, ����� ������� ���� ������.");
        join.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
        join.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� ���� ������.") }));
        final Player p = e.getPlayer();
        p.sendMessage("�a��������:�6 OneBlockChallenge�f �� Lairon � itzHiti�6�o OneBlock�f�o �� IJAMinecraft");
        p.spigot().sendMessage((BaseComponent)join);
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        final int prog = this.plugin.getConfig().getInt(p + ".progress");
        if (args[0].equalsIgnoreCase("help")) {
            final TextComponent message = new TextComponent("�6[���� 1: �������]");
            message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu1"));
            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 1!") }));
            final TextComponent message2 = new TextComponent("�6[���� 2: ����������]");
            message2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu2"));
            message2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 2!") }));
            final TextComponent message3 = new TextComponent("�6[���� 3: ������� ����]");
            message3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu3"));
            message3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 3!") }));
            final TextComponent message4 = new TextComponent("�6[���� 4: ��� ������]");
            message4.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu4"));
            message4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 4!") }));
            final TextComponent message5 = new TextComponent("�6[���� 5: ���������� ��������]");
            message5.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu5"));
            message5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 5!") }));
            final TextComponent message6 = new TextComponent("�6[���� 6: ������� �������]");
            message6.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu6"));
            message6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 6!") }));
            final TextComponent message7 = new TextComponent("�c[���� 7: ��]");
            message7.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu7"));
            message7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 7!") }));
            final TextComponent message8 = new TextComponent("�6[���� 8: �������]");
            message8.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu8"));
            message8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 8!") }));
            final TextComponent message9 = new TextComponent("�6[���� 9: ��������� �����]");
            message9.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu9"));
            message9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 9!") }));
            final TextComponent message10 = new TextComponent("�c[���� 10: �����]");
            message10.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu10"));
            message10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���� 10!") }));
            final TextComponent message11 = new TextComponent("�d[���������]");
            message11.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu11"));
            message11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ���������!") }));
            final TextComponent messagechest = new TextComponent("�a[�������]");
            messagechest.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config chests"));
            messagechest.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������\n � ��������!") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("�6���� ������");
            p.sendMessage("�e����� �� ������ ���� ��� ������� ����������:");
            p.sendMessage("");
            if (prog > 0 || prog == 0) {
                p.spigot().sendMessage((BaseComponent)message);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 253) {
                p.spigot().sendMessage((BaseComponent)message2);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 684) {
                p.spigot().sendMessage((BaseComponent)message3);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 1387) {
                p.spigot().sendMessage((BaseComponent)message4);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 2153) {
                p.spigot().sendMessage((BaseComponent)message5);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 2911) {
                p.spigot().sendMessage((BaseComponent)message6);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 3710) {
                p.spigot().sendMessage((BaseComponent)message7);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 4492) {
                p.spigot().sendMessage((BaseComponent)message8);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 5193) {
                p.spigot().sendMessage((BaseComponent)message9);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 5989) {
                p.spigot().sendMessage((BaseComponent)message10);
            }
            else {
                p.sendMessage("�7[???]");
            }
            if (prog > 7036) {
                p.spigot().sendMessage((BaseComponent)message11);
            }
            else {
                p.sendMessage("�7[???]");
            }
            p.spigot().sendMessage((BaseComponent)messagechest);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("chests")) {
            final TextComponent messagechest2 = new TextComponent("�f[������� ����]");
            messagechest2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������,  � ��������!") }));
            final TextComponent messagechest3 = new TextComponent("�4[���������������� �������]");
            messagechest3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������,  � ��������!") }));
            final TextComponent messagechest4 = new TextComponent("�1[����� ������]");
            messagechest4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������,  � ��������!") }));
            final TextComponent messagechest5 = new TextComponent("�5[������ ������]");
            messagechest5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ��� ��������� ����������,  � ��������!") }));
            final TextComponent back = new TextComponent("�7[�����]");
            back.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("�6�������");
            p.spigot().sendMessage((BaseComponent)messagechest2);
            p.spigot().sendMessage((BaseComponent)messagechest3);
            p.spigot().sendMessage((BaseComponent)messagechest4);
            p.spigot().sendMessage((BaseComponent)messagechest5);
            p.spigot().sendMessage((BaseComponent)back);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu1")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������� ���, �����, ĸ��, �����, ���, ������, �����") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������, ��������� �����, �������� �������, ������, ���������, ����, ��������� ������, ����, ������ ������, ���� #13, ������� �������, ��������� �������, �������, ������� �������, ���, ������ �����, ������� ���������, ������� �������, �����, ���������, ������ �������, ����� �������, Ƹ���� ���������") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������, ������, ������, ����") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6�������");
            p.sendMessage(" �e����� ������ ������� ������ � ��������, ��� �� ������ �� ��� �����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu2")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������, �������� ����, ������, ������, ������, �������� ����, ������ ���, ������") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����, �����, �������, ����, �������, ������-����� ���������, ������� ���, ����������� ���� '�����', ������� ����, ������ �������, ����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������, ������� ������, �����, �����") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6����������");
            p.sendMessage(" �e������ ������� ������ �� ��������� ����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu3")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Ҹ���� ���, ������� ����, ����� ����������, ������� ��, ������������ ����, ������� ����, ����� ������") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����� ��, �����, ������� ����, ������� ������ ����, ������� ������, ĸ��, ˸�, �������� ������, �������� ���������, ����������� ���� '����', �������� �����, �������� ������, ������, ������� �����, ����� ���������") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����, �������� �������, ������, �������, ����") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6������� ����");
            p.sendMessage(" �e���� ��������� ����� ������ �������� ������.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu4")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����� ����������, ��������� �����, ��������� ����������, Ҹ���� ���������, �������� ����, �������� ���� ���������, ����������� ����, ���������, ������������� �������, �����, ������� �����, �����") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����� ���������, ����� � �������, ������, ��������� ���������, ������� ���������, ������ ����, ���������� �����, ���������, ������� ���������, ��������, ����������� ���� '������� (Wait)', ������� ���������, ������������� ���������, ������� ����������, ����� � ����������, ����� � �������, ��������� �����, ������� ������, ������� �����, ��������, ����� � ����������� �����, ���� ��������, ����� � �����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������, �������, ����������, ������� �����, �����, ��������, ������, �����, ����������� ����, ��������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6��� ������");
            p.sendMessage(" �e����� ���� ������������ ����������� ������ �������� �� ��������� ����������, ������������� � �������.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu5")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��� ������, ��������, ������ ����������, ����������� ������, �������� ����������, �������� ��������") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������, ����� �������, �����, ����� ����, �����, ������ ���������, ������� ������������ ������, �������, �������, ������, �������� ���������, ����������� ���� '�����', ������, ����, ����, �������� ��������, ����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("����������, ������, ������, �����, �������, ������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            p.sendMessage(" �6���������� ��������");
            p.sendMessage(" �e������� �������� ��������� � �������� ������������ ������, ��������� ����������.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu6")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("���������� ����������, ���������� ����, ���� ����, ��������� ����������, ������� �����, ������� ���������, ������� ����������, ���������, ����������, ����� �����, ����� ����������, Ƹ���� ����������") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������� ������, ���������� ���������, ������, ������� ����, �������, ��������� �����, ����������� ���� 'Strad', ������� ����, �����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("���, ������, ����, ���������, ������, ��������, ������������� ��������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6������� �������");
            p.sendMessage(" �e������� - ���������� ����� ����, ���� � ������.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu7")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�����������, ����� ����, ����������� �������, ���� ����� ����� ����, ���� ������� �������, ��������, ��������, ������� ����������� �������, ����� ���") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������� �������, �������� ��������, ����� �����, ������� ���������, ����� ����, ������� �����, ����������� ���� 'Stal', ������ ������, ��������� ���������, �����, ����� �������-����������") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������, ����, ����� ���, ����� ������, ����������������� ������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �c��");
            p.sendMessage(" �e������ ��������� ���������� � �������������� ����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu8")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������� ������, ����, ���� �����, ������ ��������� ����, ���� ��������� ���, ������� ����������, �������� ����������, ������� �����, ���� ������, ��������� �������, ���� ��������, ������� �����") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("���-�����, ������ �����, ���������� ���, ����, �������� �� ������, �������� �����, ������� ������, ������� �������, �����, ��������� ���, �������� ����, �������� ������� �����, ������� ������� �����, ����������� ���� 'Ward', �����, ������� ���������, �����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�����, ���, ���, �����") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
           
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6�������");
            p.sendMessage(" �e������� ���� ���� �� ���� �����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu9")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������ ���������, �������� ����, ������ �������� �������, ��������� �������� �������, ���������� �����, ������-����� ���������, �������� �������� �������, �������, �������� �������") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������ ���������, ������������ ������ ����, ����� ���������, �����, ������, ����������� ���� '11', �������� �������, �������� ���������, ������ �����, �����-����") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������� ����, ������, ���������, ������, ������ ������, �������, ����� ������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �6��������� �����");
            p.sendMessage(" �e����� ���� ����� ���������� �����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu10")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������, ������������ �������, ������� ���������, ��������� ���������, ������, ��������� �����") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("���� ������, �������� �������, �������� ����, ��� ������, ��������� ������, ��������� ���������, ����������� ���� 'Far', ����������� ���� 'Mall', ����������� ���� 'Mellohi', ���������� ���������, ������������ ������") }));
            final TextComponent mobs = new TextComponent("�a[����� ����]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������, ��������, ������") }));
            final TextComponent back2 = new TextComponent("�7[�����]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �c�����");
            p.sendMessage(" �e������� ���� �����������, ����� ������ ������� ������������ � ����� �����.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu11")) {
            final TextComponent blocks = new TextComponent("�a[����� �����]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("�������� ����, �������� ����, ���������� ����, ������������� ���������, ������� ����, ������� ����, �������� ����, ����������� ����, �������� ����, ���� �����") }));
            final TextComponent items = new TextComponent("�a[����� ��������]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("������ �������, �������� ������� �����, ������, ������������ �����, ������������ ������� ������, ������� ������, ������� ������� �����, ���������� �����, ������ ������, �����, ����� ����������, ���� ������� ������, ������ �����, ���� ������� �����-�����������") }));
            final TextComponent back3 = new TextComponent("�7[�����]");
            back3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("��������� � ���� ������.") }));
            
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage(" �4���������");
            p.sendMessage(" �e����������� ���� ������� ���� ����� � ���������� ��������..");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)back3);
            p.sendMessage("");
            return true;
        }
        return false;
    }
}
