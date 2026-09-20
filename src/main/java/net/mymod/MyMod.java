package net.mymod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.mymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.mymod.item.ModItems.registerModItems;

public class MyMod implements ModInitializer {

	public static final String MOD_ID = "mymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		registerModItems();

		LOGGER.info("Hello Fabric!");
	}
}
