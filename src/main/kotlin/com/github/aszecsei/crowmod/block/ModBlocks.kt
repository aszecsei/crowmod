package com.github.aszecsei.crowmod.block

import com.github.aszecsei.crowmod.CrowMod
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.registerObject

object ModBlocks {
    val REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CrowMod.ID)

    // the returned ObjectHolderDelegate can be used as a property delegate
    // this is automatically registered by the deferred registry at the correct times
    val EXAMPLE_BLOCK by REGISTRY.registerObject("example_block") {
        Block(BlockBehaviour.Properties.of().lightLevel { 15 }.strength(3.0f))
    }
}