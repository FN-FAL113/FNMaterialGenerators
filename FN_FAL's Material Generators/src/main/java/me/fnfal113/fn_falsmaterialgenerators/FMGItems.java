package me.fnfal113.fn_falsmaterialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;

public final class FMGItems {
    private FMGItems() {}

    public static final ItemGroup FMG_ITEM_CATEGORY = new ItemGroup(
            new NamespacedKey(FN_FALsMaterialGenerators.getInstance(), "fnfalsmaterialgenerators"),
            new CustomItemStack(Material.DIAMOND_BLOCK, "&6FN_FAL's Material Generators")
    );

    public static final SlimefunItemStack FMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
            "FMG_GENERATOR_MULTIBLOCK",
            Material.BEDROCK,
            "&9Generator multiblock",
            "",
            "&dBuild any of this addon's",
            "&dgenerators like this.",
            "&aThey will only output to a chest",
            "&adirectly above it."
    );

	/*	Template for adding more generator items
	public static final SlimefunItemStack FMG_GENERATOR_ = new SlimefunItemStack(
		"FMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Rate: &e ticks",
		"",
		"&9&oSimpleMaterialGenerators"
	);
	*/


    public static SlimefunItemStack FMG_GENERATOR_FNFAL_CLAY = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_CLAY",
            Material.CLAY,
            "&3FN_FAL's Clay Generator",
            "&6Generates Clay at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_WARPED1 = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_WARPED1",
            Material.WARPED_NYLIUM,
            "&4FN_FAL's Warped Nylium Generator",
            "&6Generates Warped Nylium at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_TERRACOTTA = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_TERRACOTTA",
            Material.TERRACOTTA,
            "&4FN_FAL's Terracotta Generator",
            "&6Generates Terracotta at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_BONE = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_BONE",
            Material.BONE_BLOCK,
            "&fFN_FAL's Bone Generator",
            "&6Generates Bone at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_DIAMOND = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&bFN_FAL's Diamond Generator",
            "&6Generates Diamond at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_EMERALD = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_EMERALD",
            Material.EMERALD_BLOCK,
            "&aFN_FAL's Emerald Generator",
            "&6Generates Emerald at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_DIRT = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_DIRT",
            Material.DIRT,
            "&fFN_FAL's Dirt Generator",
            "&6Generates Dirt at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );

    public static final SlimefunItemStack FMG_GENERATOR_FNFAL_HONEYCOMB = new SlimefunItemStack(
            "FMG_GENERATOR_FNFAL_HONEYCOMB",
            Material.HONEYCOMB_BLOCK,
            "&6FN_FAL's Dirt Generator",
            "&6Generates Dirt at a certain rate",
            "",
            "&5&oFN_Fal's Material Generators"
    );
}
