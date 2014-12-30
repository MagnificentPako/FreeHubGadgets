package me.free.hubgadgets.gadgets.gui;

import me.free.hubgadgets.gadgets.Gadget;
import me.free.hubgadgets.gadgets.GadgetType;
import me.free.hubgadgets.gadgets.gui.menu.menus.ClickMenu;
import me.free.hubgadgets.gadgets.gui.menu.menus.MainMenu;
import ninja.amp.ampmenus.menus.ItemMenu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Freack100.
 */
public class GuiGadget extends Gadget {

    public ItemMenu mainMenu;
    public ItemMenu clickMenu;

    JavaPlugin plugin;

    public GuiGadget(JavaPlugin plugin) {
        super("GUI", new ItemStack(Material.CHEST), GadgetType.GUI);

        this.plugin = plugin;

        mainMenu = new MainMenu(this.plugin,this);
        clickMenu = new ClickMenu(this.plugin,mainMenu);
    }

    @Override
    public void execute(Player p) {
        mainMenu.open(p);
    }

}
