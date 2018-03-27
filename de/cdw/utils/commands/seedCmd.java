//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////

package de.cdw.utils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class seedCmd implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0.hasPermission("utils.seed")) {
			Player player = (Player) arg0;			
			player.sendMessage(ChatColor.GRAY + "[" + ChatColor.AQUA + "Utils" + ChatColor.GRAY + "] " + ChatColor.GOLD + "Seed: " + ChatColor.GREEN + player.getWorld().getSeed());			
			return true;
		} else {
			arg0.sendMessage("You dont have that Permission!");
		}
		return false;
	}

}
