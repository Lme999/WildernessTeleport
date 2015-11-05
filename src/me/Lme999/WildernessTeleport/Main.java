package me.Lme999.WildernessTeleport;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("WildernessTeleport is now enabled");
	}
	
	public void onDisable() {
		getLogger().info("WildernessTeleport is now disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("wildernessteleport")) {
			if (sender instanceof Player) {
				if (args.length == 0) {
					
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("help")) {
						
					} else if (args[0].equalsIgnoreCase("?")) {
						
					} else if (args[0].equalsIgnoreCase("tppos")) {
					
					}
				}
			} else {
				sender.sendMessage("Insert future message here");
			}
		}
		return false;
	}
}


