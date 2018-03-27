//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////


package de.cdw.utils.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class xyzCmd implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player player = (Player) arg0;
		
		Location loc = player.getLocation();
		
		player.sendMessage(ChatColor.GRAY + "[" + ChatColor.AQUA + "Utils" + ChatColor.GRAY + "] " + ChatColor.GOLD + "X: " + ChatColor.AQUA + loc.getBlockX() + ChatColor.GOLD + " Y: " + ChatColor.AQUA + loc.getBlockY() + ChatColor.GOLD + " Z: " + ChatColor.AQUA + loc.getBlockZ());
		
		return true;
		
	}

}
