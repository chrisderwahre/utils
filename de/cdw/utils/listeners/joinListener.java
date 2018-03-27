//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////


package de.cdw.utils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.cdw.utils.cdwUtils;
import me.confuser.barapi.BarAPI;
import net.md_5.bungee.api.ChatColor;

public class joinListener implements Listener{
	
	public cdwUtils plugin;
	
	public joinListener(cdwUtils instance){
        plugin = instance;
    }

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		try {
			e.getPlayer().sendMessage(ChatColor.GOLD + "Willkommen auf dem Server " + ChatColor.AQUA + e.getPlayer().getDisplayName() + "!");
			e.setJoinMessage(ChatColor.AQUA + e.getPlayer().getDisplayName() + ChatColor.YELLOW + " ist dem Server beigetreten!");
			BarAPI.setMessage(e.getPlayer(), "&6Willkommen auf dem Server! &3" + e.getPlayer());
			Thread.sleep(1000);
			BarAPI.removeBar(e.getPlayer());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}
