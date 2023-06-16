
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcaneheart.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.arcaneheart.item.WaterManaDropItem;
import net.mcreator.arcaneheart.item.OrderManaDropItem;
import net.mcreator.arcaneheart.item.FireManaDropItem;
import net.mcreator.arcaneheart.item.EntropyManaDropItem;
import net.mcreator.arcaneheart.item.EarthManaDropItem;
import net.mcreator.arcaneheart.item.BiggerBottleItem;
import net.mcreator.arcaneheart.item.ArcaneManaItem;
import net.mcreator.arcaneheart.item.ArcaneManaDropItem;
import net.mcreator.arcaneheart.item.AirManaDropItem;
import net.mcreator.arcaneheart.ArcaneHeartMod;

public class ArcaneHeartModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneHeartMod.MODID);
	public static final RegistryObject<Item> ARCANE_MANA_DROP = REGISTRY.register("arcane_mana_drop", () -> new ArcaneManaDropItem());
	public static final RegistryObject<Item> ARCANE_MANA_BUCKET = REGISTRY.register("arcane_mana_bucket", () -> new ArcaneManaItem());
	public static final RegistryObject<Item> BIGGER_BOTTLE = REGISTRY.register("bigger_bottle", () -> new BiggerBottleItem());
	public static final RegistryObject<Item> EARTH_MANA_DROP = REGISTRY.register("earth_mana_drop", () -> new EarthManaDropItem());
	public static final RegistryObject<Item> WATER_MANA_DROP = REGISTRY.register("water_mana_drop", () -> new WaterManaDropItem());
	public static final RegistryObject<Item> FIRE_MANA_DROP = REGISTRY.register("fire_mana_drop", () -> new FireManaDropItem());
	public static final RegistryObject<Item> AIR_MANA_DROP = REGISTRY.register("air_mana_drop", () -> new AirManaDropItem());
	public static final RegistryObject<Item> ENTROPY_MANA_DROP = REGISTRY.register("entropy_mana_drop", () -> new EntropyManaDropItem());
	public static final RegistryObject<Item> ORDER_MANA_DROP = REGISTRY.register("order_mana_drop", () -> new OrderManaDropItem());
}
