
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ArcaneHeartMod.MODID);
	public static final RegistryObject<PaintingVariant> ARCANE_PAINTING = REGISTRY.register("arcane_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> ORDER_PAINTING = REGISTRY.register("order_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> ENTROPY_PAINTING = REGISTRY.register("entropy_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> FIRE_PAINTING = REGISTRY.register("fire_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> WATER_PAINTING = REGISTRY.register("water_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> EARTH_PAINTING = REGISTRY.register("earth_painting", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> AIR_PAINTING = REGISTRY.register("air_painting", () -> new PaintingVariant(48, 48));
}
