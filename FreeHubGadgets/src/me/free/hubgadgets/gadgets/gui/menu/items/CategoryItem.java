package me.free.hubgadgets.gadgets.gui.menu.items;

import me.free.hubgadgets.gadgets.Gadget;
import me.free.hubgadgets.gadgets.GadgetType;
import ninja.amp.ampmenus.events.ItemClickEvent;
import ninja.amp.ampmenus.items.MenuItem;
import ninja.amp.ampmenus.menus.ItemMenu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Freack100.
 */
public class CategoryItem extends MenuItem {

    private ItemMenu menu;
    private JavaPlugin plugin;

    public CategoryItem(JavaPlugin plugin, GadgetType type, ItemMenu menu) {
        super(type.getName(), type.getIcon());
        this.menu = menu;
        this.plugin = plugin;
    }

    @Override
    public void onItemClick(ItemClickEvent event) {
        event.setWillClose(true);
        final String playerName = event.getPlayer().getName();
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            public void run() {
                Player p = Bukkit.getPlayerExact(playerName);
                if (p != null) {
                    menu.open(p);
                }
            }
        }, 3);
    }

}

