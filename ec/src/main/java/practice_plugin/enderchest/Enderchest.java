package practice_plugin.enderchest;

import org.bukkit.plugin.java.JavaPlugin;
import practice_plugin.enderchest.commands.EnderChestCommand;

public final class Enderchest extends JavaPlugin {

    @Override
    public void onEnable() {
        if (getCommand("ec") != null) {
            getCommand("ec").setExecutor(new EnderChestCommand());
        } else {
            getLogger().severe("Command 'ec' not found! Check plugin.yml");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("Enderchest disabled");
    }
}