package me.Lme999.WildernessTeleport;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
extends JavaPlugin {
    public final Logger logger = Bukkit.getLogger();
    FileConfiguration config;
    File cfile;

    public void onDisable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        this.logger.info(String.valueOf(pdfFile.getName()) + " Has Been Disabled");
    }

    public void onEnable() {
        PluginDescriptionFile pdfFile = this.getDescription();
        this.logger.info(String.valueOf(pdfFile.getName()) + " Version " + pdfFile.getVersion() + " Has Been Enabled!");
        this.config = this.getConfig();
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.cfile = new File(this.getDataFolder(), "config.yml");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("wilderness") || cmd.getName().equalsIgnoreCase("wild")) {
            switch (args.length) {
                case 0: {
                    if (sender.hasPermission("wilderness.tp")) {
                        if (!(sender instanceof Player)) break;
                        p.teleport(new Location(this.getServer().getWorld(this.getConfig().getString("World")), (double)this.getConfig().getInt("x"), (double)this.getConfig().getInt("y"), (double)this.getConfig().getInt("z"), (float)this.getConfig().getInt("yaw"), (float)this.getConfig().getInt("pitch")));
                        p.sendMessage((Object)ChatColor.BOLD + "You've been teleported to the wild!");
                        break;
                    }
                    sender.sendMessage((Object)ChatColor.DARK_RED + "You don't have permission to do this!");
                    break;
                }
                case 1: {
                    if (args[0].equalsIgnoreCase("reload")) {
                        if (sender.hasPermission("wilderness.reload")) {
                            this.config = YamlConfiguration.loadConfiguration((File)this.cfile);
                            p.sendMessage(this.getConfig().getString("WildernessReload"));
                        } else {
                            sender.sendMessage((Object)ChatColor.DARK_RED + "You don't have permission to do this!");
                        }
                    }
                    if (args[0].equalsIgnoreCase("set")) {
                        if (sender.hasPermission("wilderness.set")) {
                            if (args.length == 0) {
                                // empty if block
                            }
                            this.getConfig().set("World", (Object)p.getWorld().getName());
                            this.getConfig().set("x", (Object)p.getLocation().getX());
                            this.getConfig().set("y", (Object)p.getLocation().getY());
                            this.getConfig().set("z", (Object)p.getLocation().getZ());
                            this.getConfig().set("yaw", (Object)Float.valueOf(p.getLocation().getYaw()));
                            this.getConfig().set("pitch", (Object)Float.valueOf(p.getLocation().getPitch()));
                            this.saveConfig();
                            p.sendMessage((Object)ChatColor.GREEN + "You've set the first wild teleport point!!");
                        } else {
                            sender.sendMessage((Object)ChatColor.DARK_RED + "You don't have permission to do this!");
                        }
                    }
                    if (!args[0].equalsIgnoreCase("help")) break;
                    if (sender.hasPermission("wilderness.help")) {
                        p.sendMessage((Object)ChatColor.BLUE + "-----------------------------------------");
                        p.sendMessage((Object)ChatColor.BLUE + "-------------" + (Object)ChatColor.BOLD + "Wilderness Help" + (Object)ChatColor.BLUE + "-------------");
                        p.sendMessage((Object)ChatColor.GOLD + "/wild set");
                        p.sendMessage((Object)ChatColor.GOLD + "/wild reload");
                        p.sendMessage((Object)ChatColor.GOLD + "/wild help");
                        p.sendMessage((Object)ChatColor.GOLD + "/wilderness");
                        p.sendMessage((Object)ChatColor.GOLD + "/wild");
                        break;
                    }
                    p.sendMessage((Object)ChatColor.RED + "You don't have permission to do this!");
                }
            }
        }
        return false;
    }
}
