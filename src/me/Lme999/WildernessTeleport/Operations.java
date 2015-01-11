package me.Lme999.WildernessTeleport;

import org.bukkit.Location;
import org.bukkit.Material;
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
		if (checkSafePosition(w, x, y, z)) {
			p.teleport(new Location(w, x, y, z));
		}
		w.loadChunk(x, z);
	}
	
	private static boolean checkSafePosition(World w, int x, int y, int z) {
		Location l = new Location(w, x, y, z);
		Location lo = new Location(w, x, y+1, z);
		if (!(l.getBlock().getType().equals(Material.AIR)) && !(lo.getBlock().getType().equals(Material.AIR))) {
			return true;
		} else {
			checkSafePosition(w, x, y+1, z);
			return true;
		}
	}
	
}