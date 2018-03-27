//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////


package de.cdw.utils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import de.cdw.utils.cdwUtils;

public class leaveListener implements Listener{
	
	public cdwUtils plugin;
	
	public leaveListener(cdwUtils instance){
        plugin = instance;
    }
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		e.setQuitMessage(e.getPlayer().getDisplayName() + " hat den Server verlassen!");
	}
	
}
