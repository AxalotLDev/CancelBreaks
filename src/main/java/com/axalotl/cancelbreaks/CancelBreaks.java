package com.axalotl.cancelbreaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.util.ActionResult;

public class CancelBreaks implements ModInitializer {

    @Override
    public void onInitialize() {
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if(world != null && world.getBlockState(pos).getBlock() instanceof BuddingAmethystBlock && !player.isCreative()){
                return ActionResult.FAIL;
            }
            return ActionResult.PASS;
        });
    }
}
