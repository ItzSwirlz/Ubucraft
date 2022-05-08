package com.github.ItzSwirlz.Ubucraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class UBedBlockEntity extends BlockEntity {
   private int color;

   public UBedBlockEntity(BlockPos p_155115_, BlockState p_155116_) {
      super(BlockEntityType.BED, p_155115_, p_155116_);
   }

   public UBedBlockEntity(BlockPos p_155118_, BlockState p_155119_, int p_155120_) {
      super(BlockEntityType.BED, p_155118_, p_155119_);
      this.color = color;
   }

   public ClientboundBlockEntityDataPacket getUpdatePacket() {
      return ClientboundBlockEntityDataPacket.create(this);
   }
}