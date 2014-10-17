package me.Lme999.WildernessTeleport;

import org.bukkit.entity.Player;

public class Help {
	
	Main plugin = new Main();
	
	public static void showHelp(Player player) {
		if(Operations.checkPermission("wilderness.help", player)){
			player.sendMessage("");
		} else {
			player.sendMessage(Messages.noPermission);
		}
	}
	
}