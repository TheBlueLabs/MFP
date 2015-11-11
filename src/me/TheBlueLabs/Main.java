package me.TheBlueLabs;

//imports
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    //Used when plugin is enabled.
    @Override
    public void onEnable(){
        getLogger().info("MFP has been enabled!");
    }
    //Used when plugin is disabled.
    @Override
    public void onDisable(){
        getLogger().info("MFP has been disabled!");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("hello") && sender instanceof Player)

        {
            Player player = (Player) sender;

            player.sendMessage("Hello, " + player.getName() + "!");

            return true;
        }

        return false;
    }
}
