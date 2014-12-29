package me.free.hubgadgets.gadgets;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Freack100.
 */
public abstract class Gadget {

    private String name;
    private GadgetType type;
    private ItemStack icon;

    public Gadget(String name, ItemStack icon, GadgetType type){
        this.name = name;
        this.type = type;
        this.icon = icon;
    }

    public abstract void execute(Player p);

    public String getName() {
        return name;
    }

    public GadgetType getType() {
        return type;
    }

    public ItemStack getIcon() {
        return icon;
    }
}
