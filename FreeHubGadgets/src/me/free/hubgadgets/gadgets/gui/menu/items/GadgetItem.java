package me.free.hubgadgets.gadgets.gui.menu.items;

import me.free.hubgadgets.gadgets.Gadget;
import ninja.amp.ampmenus.items.MenuItem;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Freack100.
 */
public class GadgetItem extends MenuItem {

    private Gadget gadget;

    public GadgetItem(Gadget gadget) {
        super(gadget.getName(),gadget.getIcon());
        this.gadget = gadget;
    }

}
