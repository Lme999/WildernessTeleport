package me.Lme999.WildernessTeleport;

import org.bukkit.entity.Player;

public class Operations {
	
	Main plugin = new Main();
	
	public static boolean checkPermission(String permission, Player player) {
		if (player.hasPermission(permission)) {
			return true;
		} else {
			return false;
		}
	}
	
}