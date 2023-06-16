
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.arcaneheart.item.WaterManaDropItem;
import net.mcreator.arcaneheart.item.FireManaDropItem;
import net.mcreator.arcaneheart.item.EarthManaDropItem;
import net.mcreator.arcaneheart.item.BowlOfArcaneManaItem;
import net.mcreator.arcaneheart.item.BottledArcaneManaItem;
import net.mcreator.arcaneheart.item.BiggerBottleItem;
import net.mcreator.arcaneheart.item.ArcaneManaItem;
import net.mcreator.arcaneheart.item.ArcaneManaDropItem;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneHeartMod.MODID);
	public static final RegistryObject<Item> ARCANE_MANA_DROP = REGISTRY.register("arcane_mana_drop", () -> new ArcaneManaDropItem());
	public static final RegistryObject<Item> BOWL_OF_ARCANE_MANA = REGISTRY.register("bowl_of_arcane_mana", () -> new BowlOfArcaneManaItem());
	public static final RegistryObject<Item> BOTTLED_ARCANE_MANA = REGISTRY.register("bottled_arcane_mana", () -> new BottledArcaneManaItem());
	public static final RegistryObject<Item> ARCANE_MANA_BUCKET = REGISTRY.register("arcane_mana_bucket", () -> new ArcaneManaItem());
	public static final RegistryObject<Item> BIGGER_BOTTLE = REGISTRY.register("bigger_bottle", () -> new BiggerBottleItem());
	public static final RegistryObject<Item> EARTH_MANA_DROP = REGISTRY.register("earth_mana_drop", () -> new EarthManaDropItem());
	public static final RegistryObject<Item> WATER_MANA_DROP = REGISTRY.register("water_mana_drop", () -> new WaterManaDropItem());
	public static final RegistryObject<Item> FIRE_MANA_DROP = REGISTRY.register("fire_mana_drop", () -> new FireManaDropItem());
}
