package me.free.hubgadgets.gadgets.click;

import me.free.hubgadgets.gadgets.Gadget;
import me.free.hubgadgets.gadgets.GadgetType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Freack100.
 */
public class testClickGadget extends Gadget {

    public testClickGadget() {
        super("Test", new ItemStack(Material.STICK), GadgetType.CLICK);
    }

    @Override
    public void execute(Player p) {
        p.sendMessage("Test");
    }
}
