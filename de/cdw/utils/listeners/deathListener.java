package de.cdw.utils.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathListener implements Listener{
	
	public void death(PlayerDeathEvent e) {
		e.setDeathMessage(ChatColor.GOLD + e.getEntity().getName() + ChatColor.GRAY + " ist gestorben!");
	}

}
