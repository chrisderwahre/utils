//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////

package de.cdw.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import de.cdw.utils.commands.biomeCmd;
import de.cdw.utils.commands.gmCmd;
import de.cdw.utils.commands.pingCmd;
import de.cdw.utils.commands.seedCmd;
import de.cdw.utils.commands.xyzCmd;
import de.cdw.utils.listeners.joinListener;
import de.cdw.utils.listeners.leaveListener;
import de.cdw.utils.listeners.weatherChangeListener;

public class cdwUtils extends JavaPlugin implements Listener{

	String prefix = "&7[&3Utils&7]:";
	String cmdfix = "[Utils]";
	
	Scoreboard sb;
	
	@Override
	public void onDisable() {
		System.out.println(cmdfix + " disabled.");
	}

	@Override
	public void onEnable() {
		sb = Bukkit.getScoreboardManager().getNewScoreboard();
		
		sb.registerNewTeam("00000Spieler");
		sb.getTeam("00000Spieler").setPrefix("§8[§fSpieler§8] §7");
		
		loadCommands();
		loadListeners();
		System.out.println(cmdfix + " enabled.");
	}
	
	public void loadCommands() {
		getCommand("gm").setExecutor(new gmCmd());
		getCommand("seed").setExecutor(new seedCmd());
		getCommand("biome").setExecutor(new biomeCmd());
		getCommand("xyz").setExecutor(new xyzCmd());
		getCommand("ping").setExecutor(new pingCmd());
	}
	
	public void loadListeners() {
		getServer().getPluginManager().registerEvents(new joinListener(this), this);
		getServer().getPluginManager().registerEvents(new leaveListener(this), this);
		getServer().getPluginManager().registerEvents(new weatherChangeListener(this), this);
	}
	
	private void setPrefix(Player player) {
		String team = "";
		
		team = "00000Spieler";
		
		sb.getTeam(team).addPlayer(player);
		player.setDisplayName(sb.getTeam(team).getPrefix() + player.getName());
		
		for (Player all : Bukkit.getOnlinePlayers()) {
			all.setScoreboard(sb);
		}
	}
	
	@EventHandler
	public void join(PlayerJoinEvent e) {
		setPrefix(e.getPlayer());
	}
}
