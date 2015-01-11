package me.Lme999.WildernessTeleport;

import org.bukkit.ChatColor;

import org.bukkit.entity.Player;

public class Help {
	
	Main plugin;

	public Help(Main instance) {
		plugin = instance;
	}
	
	public static void showHelp(Player p) {
		if(Operations.checkPermission("wilderness.help", p)){
			p.sendMessage(ChatColor.GOLD + "-=[ " + ChatColor.YELLOW + "WildernessTeleport Help" + ChatColor.GOLD + " ]=-");
			p.sendMessage(ChatColor.GOLD + "/wilderness help " + ChatColor.YELLOW + "Displays help message");
			p.sendMessage(ChatColor.GOLD + "/wilderness " + ChatColor.YELLOW + "Teleports you to the wilderness");
			p.sendMessage(ChatColor.GOLD + "/wilderness tppos X,Y,Z. " + ChatColor.YELLOW + "Teleports you to specified coords.");
		} else {
			p.sendMessage(Messages.noPermission);
		}
	}
	
}