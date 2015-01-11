package me.Lme999.WildernessTeleport;

import org.bukkit.ChatColor;

import org.bukkit.entity.Player;

public class Help {
	
	Main plugin;

	public Help(Main instance) {
		plugin = instance;
	}
	
	public static void showHelp(Player player) {
		if(Operations.checkPermission("wilderness.help", player)){
			player.sendMessage(ChatColor.GOLD + "-=[ " + ChatColor.YELLOW + "WildernessTeleport Help" + ChatColor.GOLD + " ]=-");
			player.sendMessage(ChatColor.GOLD + "/wilderness help " + ChatColor.YELLOW + "Displays help message");
			player.sendMessage(ChatColor.GOLD + "/wilderness " + ChatColor.YELLOW + "Teleports you to the wilderness");
			player.sendMessage(ChatColor.GOLD + "/wilderness tppos X,Y,Z. " + ChatColor.YELLOW + "Teleports you to given coords.");
		} else {
			player.sendMessage(Messages.noPermission);
		}
	}
	
}