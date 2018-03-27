//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////

package de.cdw.utils.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class gmCmd implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.hasPermission("utils.changeGameMode")) {
		 if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
            	Player player = (Player) sender;
            	
                player.setGameMode(GameMode.CREATIVE);
                
                return true;
            } if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
            	Player player = (Player) sender;
            	
                player.setGameMode(GameMode.SURVIVAL);
                
                return true;
            } if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
            	Player player = (Player) sender;
            	
                player.setGameMode(GameMode.ADVENTURE);
                
                return true;
            } if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
            	Player player = (Player) sender;
            	
                player.setGameMode(GameMode.SPECTATOR);
                
                return true;
            } else {
            	sender.sendMessage(ChatColor.RED + "You dont have that permission!");
            	return true;
            }	
		}
		return false;
	}
	
}
