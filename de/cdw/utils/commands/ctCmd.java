//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////

package de.cdw.utils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ctCmd implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0.hasPermission("utils.ct")) {
			Player player = (Player)arg0;
			player.openWorkbench(null, true);
			return true;
		} else {
			arg0.sendMessage("You dont have that Permission!");
		}
		
		return false;
	}

}
