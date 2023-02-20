package com.axalotl.cancelbreaks;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class CancelBreakBuddingAmethyst implements AttackBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        if(world != null && world.getBlockState(pos).getBlock() instanceof BuddingAmethystBlock && !player.isCreative()){
            return ActionResult.FAIL;
        }
        return ActionResult.PASS;
    }
}
