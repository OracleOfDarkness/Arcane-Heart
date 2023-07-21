
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.arcaneheart.block.MagelightBlock;
import net.mcreator.arcaneheart.block.ArcaneManaBlock;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ArcaneHeartMod.MODID);
	public static final RegistryObject<Block> ARCANE_MANA = REGISTRY.register("arcane_mana", () -> new ArcaneManaBlock());
	public static final RegistryObject<Block> MAGELIGHT = REGISTRY.register("magelight", () -> new MagelightBlock());
}
