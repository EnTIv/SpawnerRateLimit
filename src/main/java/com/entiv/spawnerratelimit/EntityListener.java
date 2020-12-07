package com.entiv.spawnerratelimit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class EntityListener implements Listener {
    @EventHandler
    private void onEntitySpawn(CreatureSpawnEvent event) {
        if (!event.getSpawnReason().equals(CreatureSpawnEvent.SpawnReason.SPAWNER)) return;

        if (Math.random() > Main.getInstance().getConfig().getDouble("Rate")) {
            event.setCancelled(true);
        }
    }
}
