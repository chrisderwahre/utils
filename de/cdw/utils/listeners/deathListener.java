package de.cdw.utils.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import de.cdw.utils.cdwUtils;

public class deathListener implements Listener{
	
public cdwUtils plugin;
	
	public deathListener(cdwUtils instance){
        plugin = instance;
    }
	
	@EventHandler
	public void death(PlayerDeathEvent e) {
		e.setDeathMessage(ChatColor.GOLD + e.getEntity().getName() + ChatColor.GRAY + " ist gestorben!");
	}

}

