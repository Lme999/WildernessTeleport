package me.Lme999.WildernessTeleport;

import org.bukkit.ChatColor;

import org.bukkit.entity.Player;

public class Help {
	
	Main plugin = new Main();
	
	public static void showHelp(Player player) {
		if(Operations.checkPermission("wilderness.help", player)){
			player.sendMessage(ChatColor.GOLD + "-=[ " + ChatColor.YELLOW + "WildernessTeleport Help" + ChatColor.GOLD + " ]=-");
			player.sendMessage(ChatColor.GOLD + "/wilderness help " + ChatColor.YELLOW + "Displays this message.");
			player.sendMessage(ChatColor.GOLD + "/wilderness, /wild, /wtp, /wildernesstp. " + ChatColor.YELLOW + "WildernessTeleport Alias Commands.");
		} else {
			player.sendMessage(Messages.noPermission);
		}
	}
	
}