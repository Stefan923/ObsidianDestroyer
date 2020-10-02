package com.drtshock.obsidiandestroyer.managers.factions;

import org.bukkit.Location;

public interface FactionsHook {

    public String getVersion();

    public boolean isFactionNormal(Location loc);

    public double getOfflinePercent(Location loc);

    public boolean isExplosionsEnabled(Location loc);

    public boolean isFactionAtPower(Location loc);
}
