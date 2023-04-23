package net.mythical.secretrooms;

import net.fabricmc.api.ModInitializer;
import net.mythical.secretrooms.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecretRooms implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "secretrooms";
	public static final Logger LOGGER = LoggerFactory.getLogger("secretrooms");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
