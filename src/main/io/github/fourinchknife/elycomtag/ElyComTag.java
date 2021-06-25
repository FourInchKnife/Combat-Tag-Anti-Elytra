package io.github.fourinchknife.elycomtag;

import io.github.fourinchknife.elycomtag.listeners.CombatTaggedListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class ElyComTag extends JavaPlugin {
    public final Logger logger = getLogger();
    @Override
    public void onEnable() {
        //Fired when the server enables the plugin
        logger.info("Riley's test plugin enabled");
        getServer().getPluginManager().registerEvents(new CombatTaggedListener(this), this);
    }
    @Override
    public void onDisable(){
        //Fired when the server stops and disables all plugins
        logger.info("Riley's test plugin disabled");
    }
}
