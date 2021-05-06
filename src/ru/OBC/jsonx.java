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
        final TextComponent join = new TextComponent("§7§o  [?] Нажми сюда, чтобы открыть меню помощи.");
        join.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
        join.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Открывает меню помощи.") }));
        final Player p = e.getPlayer();
        p.sendMessage("§aЗагружен:§6 OneBlockChallenge§f от Lairon и itzHiti§6§o OneBlock§f§o от IJAMinecraft");
        p.spigot().sendMessage((BaseComponent)join);
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        final int prog = this.plugin.getConfig().getInt(p + ".progress");
        if (args[0].equalsIgnoreCase("help")) {
            final TextComponent message = new TextComponent("§6[Фаза 1: Равнины]");
            message.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu1"));
            message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 1!") }));
            final TextComponent message2 = new TextComponent("§6[Фаза 2: Подземелье]");
            message2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu2"));
            message2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 2!") }));
            final TextComponent message3 = new TextComponent("§6[Фаза 3: Снежный биом]");
            message3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu3"));
            message3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 3!") }));
            final TextComponent message4 = new TextComponent("§6[Фаза 4: Дно океана]");
            message4.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu4"));
            message4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 4!") }));
            final TextComponent message5 = new TextComponent("§6[Фаза 5: Подземелье джунглей]");
            message5.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu5"));
            message5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 5!") }));
            final TextComponent message6 = new TextComponent("§6[Фаза 6: Красная пустыня]");
            message6.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu6"));
            message6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 6!") }));
            final TextComponent message7 = new TextComponent("§c[Фаза 7: Ад]");
            message7.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu7"));
            message7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 7!") }));
            final TextComponent message8 = new TextComponent("§6[Фаза 8: Идиллия]");
            message8.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu8"));
            message8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 8!") }));
            final TextComponent message9 = new TextComponent("§6[Фаза 9: Пустынные земли]");
            message9.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu9"));
            message9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 9!") }));
            final TextComponent message10 = new TextComponent("§c[Фаза 10: Конец]");
            message10.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu10"));
            message10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о фазе 10!") }));
            final TextComponent message11 = new TextComponent("§d[Послефаза]");
            message11.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config phasesmenu11"));
            message11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о послефазе!") }));
            final TextComponent messagechest = new TextComponent("§a[Сундуки]");
            messagechest.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config chests"));
            messagechest.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации\n о сундуках!") }));
            
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
            p.sendMessage("§6Меню Помощи");
            p.sendMessage("§eНажми на кнопки ниже для большей информации:");
            p.sendMessage("");
            if (prog > 0 || prog == 0) {
                p.spigot().sendMessage((BaseComponent)message);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 253) {
                p.spigot().sendMessage((BaseComponent)message2);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 684) {
                p.spigot().sendMessage((BaseComponent)message3);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 1387) {
                p.spigot().sendMessage((BaseComponent)message4);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 2153) {
                p.spigot().sendMessage((BaseComponent)message5);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 2911) {
                p.spigot().sendMessage((BaseComponent)message6);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 3710) {
                p.spigot().sendMessage((BaseComponent)message7);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 4492) {
                p.spigot().sendMessage((BaseComponent)message8);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 5193) {
                p.spigot().sendMessage((BaseComponent)message9);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 5989) {
                p.spigot().sendMessage((BaseComponent)message10);
            }
            else {
                p.sendMessage("§7[???]");
            }
            if (prog > 7036) {
                p.spigot().sendMessage((BaseComponent)message11);
            }
            else {
                p.sendMessage("§7[???]");
            }
            p.spigot().sendMessage((BaseComponent)messagechest);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("chests")) {
            final TextComponent messagechest2 = new TextComponent("§f[Сундуки Фазы]");
            messagechest2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации,  о сундуках!") }));
            final TextComponent messagechest3 = new TextComponent("§4[Доброжелательный Подарок]");
            messagechest3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации,  о сундуках!") }));
            final TextComponent messagechest4 = new TextComponent("§1[Супер Сундук]");
            messagechest4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации,  о сундуках!") }));
            final TextComponent messagechest5 = new TextComponent("§5[Редкий Сундук]");
            messagechest5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Нажмите для получения информации,  о сундуках!") }));
            final TextComponent back = new TextComponent("§7[Назад]");
            back.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage("§6Сундуки");
            p.spigot().sendMessage((BaseComponent)messagechest2);
            p.spigot().sendMessage((BaseComponent)messagechest3);
            p.spigot().sendMessage((BaseComponent)messagechest4);
            p.spigot().sendMessage((BaseComponent)messagechest5);
            p.spigot().sendMessage((BaseComponent)back);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu1")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Берёзовый дуб, Глина, Дёрн, Арбуз, Дуб, Подзол, Тыква") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Яблоко, Хаустония Серая, Берёзовый саженец, Василёк, Одуванчик, Яйцо, Цветочный Горшок, Кожа, Семена Арбуза, Диск #13, Дубовый саженец, Оранжевый тюльпан, Ромашка, Розовый тюльпан, Мак, Семена тыквы, Красный краситель, Красный тюльпан, Палка, Подсолнух, Семена пшеницы, Белый тюльпан, Жёлтый краситель") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Курица, Корова, Свинья, Овца") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Равнины");
            p.sendMessage(" §eЗдесь растет столько цветов и деревьев, что их хватит на всю жизнь.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu2")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Андезит, Угольная руда, Диорит, Гранит, Гравий, Железная руда, Еловый дуб, Камень") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Гриб, Уголь, Паутина, Перо, Кремень, Светло-серый краситель, Грибной суп, Музыкальный Диск 'Блоки', Красный гриб, Еловый саженец, Нить") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Крипер, Грибная корова, Павук, Зомби") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Подземелье");
            p.sendMessage(" §eМногие монстры бродят по подбрюшью мира.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu3")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Тёмный дуб, Золотая руда, Серая терракотта, Плотный лёд, Редстоуновая руда, Снежный блок, Белый цемент") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Синий лёд, Кость, Костная мука, Саженец тёмного дуба, Золотой слиток, Дёрн, Лёд, Железный слиток, Железный самородок, Музыкальный диск 'Чирп', Кроличья лапка, Кроличья шкурка, Снежок, Сладкие ягоды, Белый краситель") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Лиса, Полярный медведь, Кролик, Зимогор, Волк") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Снежный биом");
            p.sendMessage(" §eЗима покрывает землю своими ледяными руками.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu4")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Синяя терракотта, Кораловые блоки, Бирюзовая терракотта, Тёмный призмарин, Алмазная руда, Сушённый блок ламинарии, Лазуритовая руда, Призмарин, Призмариновые кирпичи, Песок, Морская лампа, Губка") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Синий краситель, Ведро с треской, Коралы, Бирюзовый краситель, Сушёная ламинария, Сердце моря, Чернильный мешок, Ламинария, Голубой краситель, Кувшинка, Музыкальный Диск 'Подожди (Wait)', Ракушка Наутилуса, Призмариновые кристаллы, Осколки призмарина, Ведро с иглобрюхом, Ведро с лососем, Черепашьи щиток, Морские огурцы, Морская трава, Трезубец, Ведро с тропической рыбой, Яйцо черепахи, Ведро с водой") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Треска, Дельфин, Утопленник, Древний страж, Страж, Иглобрюх, Лосось, Спрут, Тропическая рыба, Черепаха") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Дно океана");
            p.sendMessage(" §eПеред вами простираются бесконечные водные просторы со странными существами, скрывающимися в глубине.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu5")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Дуб акации, Булыжник, Зелёная терракотта, Тропическое бревно, Лаймовая терракотта, Замшелый булыжник") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Бабмук, Синяя орхидея, Книга, Какао бобы, Алмаз, Зелёный краситель, Саженец тропического дерева, Лазурит, Поводок, Ландыш, Лаймовый краситель, Музыкальный Диск 'Кошка', Бумага, Пион, Роза, Сахарный тростник, Лоза") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вызыватель, Лошадь, Оцелот, Панда, Попудай, Ведьма") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            p.sendMessage(" §6Подземелье Джунглей");
            p.sendMessage(" §eСкрытое древними деревьями и покрытое виноградными лозами, находится подземелье.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu6")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Коричневая терракотта, Изумрудная руда, Сноп сена, Оранжевая терракотта, Красный песок, Красный песчанник, Красная терракотта, Песчанник, Терракотта, Белый бетон, Белая терракотта, Жёлтая терракотта") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Саженец Акации, Коричневый краситель, Кактус, Мертвый куст, Изумруд, Бутылочка опыта, Музыкальный Диск 'Strad', Красная пыль, Слизь") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Осёл, Кадавр, Лама, Разбойник, Житель, Поборник, Странствующий торговец") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Красная пустыня");
            p.sendMessage(" §eПустыня - враждебное место жары, пыли и смерти.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu7")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Светокамень, Магма блок, Незеритовые кирпичи, Блок незер кварц руды, Блок адского нароста, Незеррак, Обсидиан, Красные незеритовые кирпичи, Песок душ") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Огненный порошок, Огненный стержень, Слеза гаста, Золотой самородок, Ведро лавы, Сгусток магмы, Музыкальный Диск 'Stal', Адский нарост, Оранжевый краситель, Кварц, Череп скелета-иссушителя") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Всполох, Гаст, Магма куб, Визер скелет, Зомбифицированный пиглин") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §cАд");
            p.sendMessage(" §eАдское измерение вторгается и распространяет хаос.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu8")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Пчелиное гнездо, Улей, Блок гриба, Резной кварцевый блок, Блок пчелинных сот, Голубая терракотта, Пурпуная терракотта, Стебель гриба, Блок кварца, Кварцевые колонны, Блок мухомора, Гладкий кварц") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Лук-батун, Семена свёклы, Свекольный суп, Торт, Морковка на удочке, Огненный заряд, Кусочек арбуза, Золотая морковь, Трава, Бутылочка мёда, Пчелиные соты, Железная конская броня, Кожаная конская броня, Музыкальный Диск 'Ward', Бирка, Розовый краситель, Седло") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Пчела, Кот, Мул, Слайм") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
           
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
            p.sendMessage(" §6Идиллия");
            p.sendMessage(" §eВетерок мира дует по всей земле.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu9")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Черная Терракота, Костяной Блок, Резной Каменные Кирпичи, Сломанные Каменные Кирпичи, Светильник Джека, Светло-Серая Терракота, Замшелые Каменные Кирпичи, Мицелий, Каменные Кирпичи") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Черный краситель, Маринованный Паучий глаз, Серый краситель, Порох, Фонарь, Музыкальный диск '11', Мембрана Фантома, Ядовитый картофель, Гнилая плоть, Визер-роза") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Пещерный паук, Фантом, Чешуйница, Скелет, Лошадь Скелет, Вредина, Зомби Лошадь") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §6Пустынные земли");
            p.sendMessage(" §eПеред вами лежит бесплодная земля.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu10")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Эндерняк, Эндерняковые Кирпичи, Розовая Терракота, Пурпурная Терракота, Пурпур, Пурпурный Пилон") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Плод Хоруса, Драконье Дыхание, Стрежень Энда, Око Эндера, Жемчужина Эндера, Пурпурный краситель, Музыкальный Диск 'Far', Музыкальный Диск 'Mall', Музыкальный Диск 'Mellohi', Фиолетовый краситель, Спектральная Стрела") }));
            final TextComponent mobs = new TextComponent("§a[Новые мобы]");
            mobs.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Эндермен, Эндермит, Шалкер") }));
            final TextComponent back2 = new TextComponent("§7[Назад]");
            back2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §cКонец");
            p.sendMessage(" §eДревние силы поднимаются, когда темная пустота сталкивается с вашим миром.");
            p.sendMessage("");
            p.spigot().sendMessage((BaseComponent)blocks);
            p.spigot().sendMessage((BaseComponent)items);
            p.spigot().sendMessage((BaseComponent)mobs);
            p.spigot().sendMessage((BaseComponent)back2);
            p.sendMessage("");
            return true;
        }
        if (args[0].equalsIgnoreCase("phasesmenu11")) {
            final TextComponent blocks = new TextComponent("§a[Новые блоки]");
            blocks.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Угольный Блок, Алмазный Блок, Изумрудный Блок, Глазурованная Терракота, Золотой Блок, Медовый Блок, Железный Блок, Лазуритовый Блок, Редстоун Блок, Блок Слизи") }));
            final TextComponent items = new TextComponent("§a[Новые предметы]");
            items.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Голова Крипера, Алмазная конская броня, Элитры, Зачарованная книга, Зачарованное золотое яблоко, Золотое яблоко, Золотая конская броня, Взвешенные зелья, Голова игрока, Череп, Тотем бессмертия, Яйцо призыва жителя, Голова зомби, Яйцо призыва зомби-крестьянина") }));
            final TextComponent back3 = new TextComponent("§7[Назад]");
            back3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/config help"));
            back3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Content[] { new Text("Вернуться в меню помощи.") }));
            
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
            p.sendMessage(" §4Послефаза");
            p.sendMessage(" §eБесконечный блок сбросил свои оковы и пульсирует энергией..");
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
