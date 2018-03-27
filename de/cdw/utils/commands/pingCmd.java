package de.cdw.utils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_8_R3.EntityPlayer;

public class pingCmd implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		Player player = (Player)arg0;
		if (arg3.length == 0) {
			player.sendMessage(ChatColor.GRAY + "[" + ChatColor.AQUA + "Utils" + ChatColor.GRAY + "] " + ChatColor.AQUA + "Du hast einen Ping von " + ChatColor.GOLD + getPing(player) + ChatColor.BLUE + "ms!");
		}
		return true;
	}

	public double getPing(Player player) {
		CraftPlayer pc = (CraftPlayer) player;
		EntityPlayer pe = pc.getHandle();
		return pe.ping;
	}

}
