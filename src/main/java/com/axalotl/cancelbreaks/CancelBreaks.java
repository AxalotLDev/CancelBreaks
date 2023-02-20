package com.axalotl.cancelbreaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;

public class CancelBreaks implements ModInitializer {

    @Override
    public void onInitialize() {
        AttackBlockCallback.EVENT.register(new CancelBreakBuddingAmethyst());
    }
}
