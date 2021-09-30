package me.fnfal113.fn_falsmaterialgenerators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class FN_FALsMaterialGenerators extends JavaPlugin implements SlimefunAddon {

    private static FN_FALsMaterialGenerators instance;

    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        setInstance(this);

        config.options().copyDefaults();
        saveDefaultConfig();

        FMGItemSetup.setup(this);
    }

    @Override
    public void onDisable() {
        setInstance(null);
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }


    public static FN_FALsMaterialGenerators getInstance() {
        return instance;
    }

    private static void setInstance(FN_FALsMaterialGenerators instance) {
        FN_FALsMaterialGenerators.instance = instance;
    }
}
