package com.axalotl.cancelbreaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BuddingAmethystBlock;


public class CancelBreaks implements ModInitializer {

    @Override
    public void onInitialize() {
        AttackBlockCallback.EVENT.register((player, world, _, pos, _) -> {
            if ((world.getBlockState(pos).getBlock() instanceof BuddingAmethystBlock ||
                    world.getBlockState(pos).getBlock().equals(Blocks.SUSPICIOUS_GRAVEL) ||
                    world.getBlockState(pos).getBlock().equals(Blocks.SUSPICIOUS_SAND)) && !player.isCreative()) {
                return InteractionResult.FAIL;
            }
            return InteractionResult.PASS;
        });
    }
}
