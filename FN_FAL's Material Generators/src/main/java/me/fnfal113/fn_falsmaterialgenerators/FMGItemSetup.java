package me.fnfal113.fn_falsmaterialgenerators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.SMGItems;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class FMGItemSetup {
    static FN_FALsMaterialGenerators plugin;

    public FMGItemSetup(FN_FALsMaterialGenerators plugin) {
        this.plugin = plugin;
    }


    public static void setup(FN_FALsMaterialGenerators plugin) {
        new GeneratorMultiblock(FMGItems.FMG_ITEM_CATEGORY, FMGItems.FMG_GENERATOR_MULTIBLOCK).register(plugin);


        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_CLAY,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_GRAVEL, null, SMGItems.SMG_GENERATOR_GRAVEL,
                        SMGItems.SMG_GENERATOR_GRAVEL_BROKEN, new ItemStack(Material.DIAMOND_PICKAXE), SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
                        new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(Material.FURNACE ), new ItemStack(Material.DIAMOND_PICKAXE)
                })
                .setItem(Material.CLAY)
                .setRate(plugin.config.getInt("FN_CLAY-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_WARPED1,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_NETHERRACK, SMGItems.SMG_GENERATOR_GRAVEL,
                        SMGItems.SMG_GENERATOR_SOUL_SAND, new ItemStack(Material.DIAMOND_PICKAXE), SMGItems.SMG_GENERATOR_SOUL_SAND,
                        SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.BLAST_FURNACE), SMGItems.SMG_GENERATOR_GRAVEL
                })
                .setItem(Material.WARPED_NYLIUM)
                .setRate(plugin.config.getInt("FN_WARPED_NYLIUM-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_TERRACOTTA,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.DAMASCUS_STEEL_INGOT, FMGItems.FMG_GENERATOR_FNFAL_CLAY, SlimefunItems.DAMASCUS_STEEL_INGOT,
                        SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.TERRACOTTA, 32), SMGItems.SMG_GENERATOR_GRAVEL,
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.BLAST_FURNACE), SMGItems.SMG_GENERATOR_COBBLESTONE
                })
                .setItem(Material.TERRACOTTA)
                .setRate(plugin.config.getInt("FN_TERRACOTTA-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_BONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.REINFORCED_ALLOY_INGOT, FMGItems.FMG_GENERATOR_FNFAL_CLAY, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SMGItems.SMG_GENERATOR_SOUL_SAND, new ItemStack(Material.BONE_BLOCK, 32), SMGItems.SMG_GENERATOR_SOUL_SAND,
                        SlimefunItems.PROGRAMMABLE_ANDROID, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID
                })
                .setItem(Material.BONE)
                .setRate(plugin.config.getInt("FN_BONE-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_DIAMOND,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SMGItems.SMG_GENERATOR_SOUL_SAND, SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
                        SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.DIAMOND_BLOCK, 48), SMGItems.SMG_GENERATOR_COBBLESTONE,
                        SlimefunItems.PROGRAMMABLE_ANDROID, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID
                })
                .setItem(Material.DIAMOND)
                .setRate(plugin.config.getInt("FN_DIAMOND-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_EMERALD,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SMGItems.SMG_GENERATOR_SOUL_SAND, SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
                        FMGItems.FMG_GENERATOR_FNFAL_DIAMOND, new ItemStack(Material.EMERALD_BLOCK, 48), FMGItems.FMG_GENERATOR_FNFAL_DIAMOND,
                        SlimefunItems.PROGRAMMABLE_ANDROID, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID
                })
                .setItem(Material.EMERALD)
                .setRate(plugin.config.getInt("FN_EMERALD-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_DIRT,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        new ItemStack(Material.DIAMOND_PICKAXE), SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.DIAMOND_PICKAXE),
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.DIRT, 64), SMGItems.SMG_GENERATOR_COBBLESTONE,
                        SlimefunItems.MAGNESIUM_INGOT, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.MAGNESIUM_INGOT
                })
                .setItem(Material.DIRT)
                .setRate(plugin.config.getInt("FN_DIRT-TickRate"))
                .register(plugin);

        new MaterialGenerator(FMGItems.FMG_ITEM_CATEGORY,
                FMGItems.FMG_GENERATOR_FNFAL_HONEYCOMB,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        new ItemStack(Material.HONEYCOMB_BLOCK, 16), null, new ItemStack(Material.HONEYCOMB_BLOCK, 16),
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.HONEYCOMB, 32), SMGItems.SMG_GENERATOR_COBBLESTONE,
                        SlimefunItems.TIN_INGOT, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.TIN_INGOT
                })
                .setItem(Material.HONEYCOMB)
                .setRate(plugin.config.getInt("FN_HONEYCOMB-TickRate"))
                .register(plugin);




    }
}
