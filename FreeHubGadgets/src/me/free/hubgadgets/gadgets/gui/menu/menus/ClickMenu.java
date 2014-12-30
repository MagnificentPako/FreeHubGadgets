package me.free.hubgadgets.gadgets.gui.menu.menus;

import ninja.amp.ampmenus.items.BackItem;
import ninja.amp.ampmenus.menus.ItemMenu;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Freack100.
 */
public class ClickMenu extends ItemMenu {

    public ClickMenu(JavaPlugin plugin, ItemMenu parent) {
        super("Click", Size.SIX_LINE, plugin, parent);
        setItem(9*6,new BackItem());
    }
}
