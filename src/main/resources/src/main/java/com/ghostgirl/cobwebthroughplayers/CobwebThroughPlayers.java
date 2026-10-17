
package com.ghostgirl.cobwebthroughplayers;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobwebThroughPlayers implements ModInitializer {
    public static final String MOD_ID = "cobwebthroughplayers";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Cobweb Through Players loaded!");
    }
}
