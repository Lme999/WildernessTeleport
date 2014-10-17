package me.Lme999.WildernessTeleport;

import org.bukkit.ChatColor;


public class Messages {
	
	Main plugin = new Main();

	static ChatColor prefixBracketColor = ChatColor.RED;
	static ChatColor prefixNameColor = ChatColor.BLUE;
	static ChatColor defaultMessageColor = ChatColor.YELLOW;
	
	public static String prefix = new String(prefixBracketColor + "[" + prefixNameColor + "WildernessTeleport" + prefixBracketColor + "] " + defaultMessageColor);
	
	public static String notPlayer = new String(prefix + ChatColor.RED + "You're not a player!");
	
}