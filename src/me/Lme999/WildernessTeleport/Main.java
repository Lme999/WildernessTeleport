package me.Lme999.WildernessTeleport;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	public void onEnable() {
		getLogger().info(ChatColor.BLUE + "WildernessTeleport Now Enabled");
	}
	
	public void onDisable() {
		getLogger().info(ChatColor.RED + "WildernessTeleport Now Disabled!");
	}
}