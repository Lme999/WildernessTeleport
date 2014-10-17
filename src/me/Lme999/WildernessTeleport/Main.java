package me.Lme999.WildernessTeleport;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	Logger log = this.getLogger();
	PluginDescriptionFile desc = this.getDescription();
	String name = desc.getName();
	String ver = desc.getVersion();
	
	public void onEnable() {
		log.info("Enabled " + name + " v" + ver);
	}
	
	public void onDisable() {
		log.info("Disabled " + name + " v" + ver);
	}
	
}