package net.mythical.secretrooms.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.sound.BlockSoundGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.function.Function;
import java.util.function.ToIntFunction;

@Mixin(AbstractBlock.Settings.class)
public interface SettingsAccessor {
    @Accessor("jumpVelocityMultiplier")
    float secretrooms$getJumpVelocityMultiplier();

    @Accessor("jumpVelocityMultiplier")
    void secretrooms$setJumpVelocityMultiplier(float jumpVelocityMultiplier);

    @Accessor("solidBlockPredicate")
    AbstractBlock.ContextPredicate secretrooms$getSolidBlockPredicate();

    @Accessor("solidBlockPredicate")
    void secretrooms$setSolidBlockPredicate(AbstractBlock.ContextPredicate solidBlockPredicate);

    @Accessor("allowsSpawningPredicate")
    AbstractBlock.TypedContextPredicate<EntityType<?>> secretrooms$getAllowsSpawningPredicate();

    @Accessor("allowsSpawningPredicate")
    void secretrooms$setAllowsSpawningPredicate(AbstractBlock.TypedContextPredicate<EntityType<?>> allowsSpawningPredicate);

    @Accessor("postProcessPredicate")
    AbstractBlock.ContextPredicate secretrooms$getPostProcessPredicate();

    @Accessor("postProcessPredicate")
    void secretrooms$setPostProcessPredicate(AbstractBlock.ContextPredicate postProcessPredicate);

    @Accessor("suffocationPredicate")
    AbstractBlock.ContextPredicate secretrooms$getSuffocationPredicate();

    @Accessor("suffocationPredicate")
    void secretrooms$setSuffocationPredicate(AbstractBlock.ContextPredicate suffocationPredicate);

    @Accessor("blockVisionPredicate")
    AbstractBlock.ContextPredicate secretrooms$getBlockVisionPredicate();

    @Accessor("blockVisionPredicate")
    void secretrooms$setBlockVisionPredicate(AbstractBlock.ContextPredicate blockVisionPredicate);

    @Accessor("lootTableKey")
    RegistryKey<LootTable> secretrooms$getLootTableKey();

    @Accessor("lootTableKey")
    void secretrooms$setLootTableKey(RegistryKey<LootTable> lootTableKey);

    @Accessor("hardness")
    float secretrooms$getHardness();

    @Accessor("hardness")
    void secretrooms$setHardness(float hardness);

    @Accessor("resistance")
    float secretrooms$getResistance();

    @Accessor("resistance")
    void secretrooms$setResistance(float resistance);

    @Accessor("collidable")
    boolean secretrooms$getCollidable();

    @Accessor("collidable")
    void secretrooms$setCollidable(boolean collidable);

    @Accessor("randomTicks")
    boolean secretrooms$getRandomTicks();

    @Accessor("randomTicks")
    void secretrooms$setRandomTicks(boolean randomTicks);

    @Accessor("luminance")
    ToIntFunction<BlockState> secretrooms$getLuminance();

    @Accessor("luminance")
    void secretrooms$setLuminance(ToIntFunction<BlockState> luminance);

    @Accessor("mapColorProvider")
    Function<BlockState, MapColor> secretrooms$getMapColorProvider();

    @Accessor("mapColorProvider")
    void secretrooms$setMapColorProvider(Function<BlockState, MapColor> mapColorProvider);

    @Accessor("soundGroup")
    BlockSoundGroup secretrooms$getSoundGroup();

    @Accessor("soundGroup")
    void secretrooms$setSoundGroup(BlockSoundGroup soundGroup);

    @Accessor("slipperiness")
    float secretrooms$getSlipperiness();

    @Accessor("slipperiness")
    void secretrooms$setSlipperiness(float slipperiness);

    @Accessor("velocityMultiplier")
    float secretrooms$getVelocityMultiplier();

    @Accessor("velocityMultiplier")
    void secretrooms$setVelocityMultiplier(float velocityMultiplier);

    @Accessor("dynamicBounds")
    boolean secretrooms$getDynamicBounds();

    @Accessor("dynamicBounds")
    void secretrooms$setDynamicBounds(boolean dynamicBounds);

    @Accessor("opaque")
    boolean secretrooms$getOpaque();

    @Accessor("opaque")
    void secretrooms$setOpaque(boolean opaque);

    @Accessor("isAir")
    boolean secretrooms$getIsAir();

    @Accessor("isAir")
    void secretrooms$setIsAir(boolean air);

    @Accessor("burnable")
    boolean secretrooms$getBurnable();

    @Accessor("burnable")
    void secretrooms$setBurnable(boolean burnable);

    @Accessor("liquid")
    boolean secretrooms$getLiquid();

    @Accessor("liquid")
    void secretrooms$setLiquid(boolean liquid);

    @Accessor("forceNotSolid")
    boolean secretrooms$getForceNotSolid();

    @Accessor("forceNotSolid")
    void secretrooms$setForceNotSolid(boolean forceNotSolid);

    @Accessor("forceSolid")
    boolean secretrooms$getForceSolid();

    @Accessor("forceSolid")
    void secretrooms$setForceSolid(boolean forceSolid);

    @Accessor("pistonBehavior")
    PistonBehavior secretrooms$getPistonBehavior();

    @Accessor("pistonBehavior")
    void secretrooms$setPistonBehavior(PistonBehavior pistonBehavior);

    @Accessor("toolRequired")
    boolean secretrooms$getToolRequired();

    @Accessor("toolRequired")
    void secretrooms$setToolRequired(boolean toolRequired);

    @Accessor("offsetter")
    AbstractBlock.Offsetter secretrooms$getOffsetter();

    @Accessor("offsetter")
    void secretrooms$setOffsetter(AbstractBlock.Offsetter offsetter);

    @Accessor("blockBreakParticles")
    boolean secretrooms$getBlockBreakParticles();

    @Accessor("blockBreakParticles")
    void secretrooms$setBlockBreakParticles(boolean blockBreakParticles);

    @Accessor("requiredFeatures")
    FeatureSet secretrooms$getRequiredFeatures();

    @Accessor("requiredFeatures")
    void secretrooms$setRequiredFeatures(FeatureSet requiredFeatures);

    @Accessor("emissiveLightingPredicate")
    AbstractBlock.ContextPredicate secretrooms$getEmissiveLightingPredicate();

    @Accessor("emissiveLightingPredicate")
    void secretrooms$setEmissiveLightingPredicate(AbstractBlock.ContextPredicate emissiveLightingPredicate);

    @Accessor("instrument")
    NoteBlockInstrument secretrooms$getInstrument();

    @Accessor("instrument")
    void secretrooms$setInstrument(NoteBlockInstrument instrument);

    @Accessor("replaceable")
    boolean secretrooms$getReplaceable();

    @Accessor("replaceable")
    void secretrooms$setReplaceable(boolean replaceable);
}
