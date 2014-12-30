package me.free.hubgadgets.listener;

import me.free.hubgadgets.HubGadgets;
import me.free.hubgadgets.gadgets.Gadget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by Freack100.
 */
public class GadgetInteractListener implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
            for(Gadget gadget : HubGadgets.getInstance().getGadgets()){
                if(e.getItem().equals(gadget.getIcon())){
                    e.setCancelled(true);
                    gadget.execute(e.getPlayer());
                    return;
                }
            }
        }
    }

}
