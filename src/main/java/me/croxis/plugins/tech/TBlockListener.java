package me.croxis.plugins.tech;

import net.croxis.plugins.research.TechManager;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TBlockListener implements Listener{
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event){
		if(event.getBlock().getType().equals(Material.BOOKSHELF) && event.getPlayer().hasPermission("tech")){
			TechManager.addPoints(event.getPlayer(), 20);
			event.getPlayer().sendMessage("You discovered more knowledge!");
		}
	}

}
