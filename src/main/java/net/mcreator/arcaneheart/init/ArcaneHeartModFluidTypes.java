
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.arcaneheart.fluid.types.ArcaneManaFluidType;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ArcaneHeartMod.MODID);
	public static final RegistryObject<FluidType> ARCANE_MANA_TYPE = REGISTRY.register("arcane_mana", () -> new ArcaneManaFluidType());
}
