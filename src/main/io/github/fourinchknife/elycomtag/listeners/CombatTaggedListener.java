package io.github.fourinchknife.elycomtag.listeners;

import io.github.fourinchknife.elycomtag.ElyComTag;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.scoreboard.ScoreboardManager;

public class CombatTaggedListener implements Listener {
    private final ElyComTag plugin;
    private final ScoreboardManager scoreboardManager;
    public CombatTaggedListener(ElyComTag plugin) {
        this.plugin = plugin;
        this.scoreboardManager = plugin.getServer().getScoreboardManager();
    }
    @EventHandler
    public void onEntityDamaged(EntityDamageByEntityEvent event){
        if (event.getEntity() instanceof Player){
            ((Player) event.getEntity()).setGliding(false);
        }
    }
}
