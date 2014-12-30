package me.free.hubgadgets.gadgets;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Freack100.
 */
public enum GadgetType {

    CLICK("Click", new ItemStack(Material.CHEST)),
    EFFECT("Effect", new ItemStack(Material.CHEST)),
    MORPH("Morph", new ItemStack(Material.CHEST)),
    PET("Pet", new ItemStack(Material.CHEST)),
    GUI("GUI",new ItemStack(Material.CHEST));

    private String name;
    private ItemStack icon;

    GadgetType(String name, ItemStack icon){
        this.name = name;
        this.icon = icon;
    }

    public String getName(){
        return this.name;
    }
    public ItemStack getIcon() {
        return icon;
    }
}
