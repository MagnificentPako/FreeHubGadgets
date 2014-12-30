package me.free.hubgadgets.gadgets.gui.menu.menus;

import me.free.hubgadgets.gadgets.GadgetType;
import me.free.hubgadgets.gadgets.gui.GuiGadget;
import me.free.hubgadgets.gadgets.gui.menu.items.CategoryItem;
import ninja.amp.ampmenus.menus.ItemMenu;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Freack100.
 */
public class MainMenu extends ItemMenu {

    GuiGadget gadget;
    JavaPlugin plugin;

    public MainMenu(JavaPlugin plugin,GuiGadget guiGadget) {
        super("Gadgets", Size.THREE_LINE, plugin);
        this.gadget = guiGadget;
        this.plugin = plugin;

        setItem(1,new CategoryItem(this.plugin,GadgetType.CLICK,this.gadget.clickMenu));

    }

}
