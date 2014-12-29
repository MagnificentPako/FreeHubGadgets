package me.free.hubgadgets;


import me.free.hubgadgets.gadgets.Gadget;
import me.free.hubgadgets.gadgets.click.testClickGadget;
import me.free.hubgadgets.listener.GadgetInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class HubGadgets extends JavaPlugin {

    private List<Gadget> gadgets = new ArrayList();

    private static HubGadgets instance;

    public static HubGadgets getInstance(){
        return instance;
    }

    public List<Gadget> getGadgets(){
        return this.gadgets;
    }

    @Override
    public void onEnable(){
        instance = this;

        addGadget(new testClickGadget());
        Bukkit.getPluginManager().registerEvents(new GadgetInteractListener(),this);
    }

    @Override
    public void onDisable(){
        instance = null;
    }

    public void addGadget(Gadget g){
        if(gadgets.contains(g)) return;
        gadgets.add(g);
    }

}
