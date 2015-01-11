package me.Lme999.WildernessTeleport;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class Operations {
	
	Main plugin;

	public Operations(Main instance) {
		plugin = instance;
	}
	
	public static boolean checkPermission(String permission, Player p) {
		if (p.hasPermission(permission)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void teleportSafePosition(Player p, int x, int y, int z) {
		World w = p.getWorld();
		
		w.loadChunk(x, z);
	}
	
}