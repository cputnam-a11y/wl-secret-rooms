package net.mythical.secretrooms.block;

import net.minecraft.block.AbstractBlock;
import net.mythical.secretrooms.mixin.SettingsAccessor;

public class SettingsCloner {
    public static AbstractBlock.Settings copy(AbstractBlock.Settings settings) {
        AbstractBlock.Settings result = AbstractBlock.Settings.create();
        SettingsAccessor originalAccessor = (SettingsAccessor) settings;
        SettingsAccessor resultAccessor = (SettingsAccessor) result;
        resultAccessor.secretrooms$setJumpVelocityMultiplier(originalAccessor.secretrooms$getJumpVelocityMultiplier());

        resultAccessor.secretrooms$setSolidBlockPredicate(originalAccessor.secretrooms$getSolidBlockPredicate());

        resultAccessor.secretrooms$setAllowsSpawningPredicate(originalAccessor.secretrooms$getAllowsSpawningPredicate());

        resultAccessor.secretrooms$setPostProcessPredicate(originalAccessor.secretrooms$getPostProcessPredicate());

        resultAccessor.secretrooms$setSuffocationPredicate(originalAccessor.secretrooms$getSuffocationPredicate());

        resultAccessor.secretrooms$setBlockVisionPredicate(originalAccessor.secretrooms$getBlockVisionPredicate());

        resultAccessor.secretrooms$setLootTableKey(originalAccessor.secretrooms$getLootTableKey());

        resultAccessor.secretrooms$setHardness(originalAccessor.secretrooms$getHardness());

        resultAccessor.secretrooms$setResistance(originalAccessor.secretrooms$getResistance());

        resultAccessor.secretrooms$setCollidable(originalAccessor.secretrooms$getCollidable());

        resultAccessor.secretrooms$setRandomTicks(originalAccessor.secretrooms$getRandomTicks());

        resultAccessor.secretrooms$setLuminance(originalAccessor.secretrooms$getLuminance());

        resultAccessor.secretrooms$setMapColorProvider(originalAccessor.secretrooms$getMapColorProvider());

        resultAccessor.secretrooms$setSoundGroup(originalAccessor.secretrooms$getSoundGroup());

        resultAccessor.secretrooms$setSlipperiness(originalAccessor.secretrooms$getSlipperiness());

        resultAccessor.secretrooms$setVelocityMultiplier(originalAccessor.secretrooms$getVelocityMultiplier());

        resultAccessor.secretrooms$setDynamicBounds(originalAccessor.secretrooms$getDynamicBounds());

        resultAccessor.secretrooms$setOpaque(originalAccessor.secretrooms$getOpaque());

        resultAccessor.secretrooms$setIsAir(originalAccessor.secretrooms$getIsAir());

        resultAccessor.secretrooms$setBurnable(originalAccessor.secretrooms$getBurnable());

        resultAccessor.secretrooms$setLiquid(originalAccessor.secretrooms$getLiquid());

        resultAccessor.secretrooms$setForceNotSolid(originalAccessor.secretrooms$getForceNotSolid());

        resultAccessor.secretrooms$setForceSolid(originalAccessor.secretrooms$getForceSolid());

        resultAccessor.secretrooms$setPistonBehavior(originalAccessor.secretrooms$getPistonBehavior());

        resultAccessor.secretrooms$setToolRequired(originalAccessor.secretrooms$getToolRequired());

        resultAccessor.secretrooms$setOffsetter(originalAccessor.secretrooms$getOffsetter());

        resultAccessor.secretrooms$setBlockBreakParticles(originalAccessor.secretrooms$getBlockBreakParticles());

        resultAccessor.secretrooms$setRequiredFeatures(originalAccessor.secretrooms$getRequiredFeatures());

        resultAccessor.secretrooms$setEmissiveLightingPredicate(originalAccessor.secretrooms$getEmissiveLightingPredicate());

        resultAccessor.secretrooms$setInstrument(originalAccessor.secretrooms$getInstrument());

        resultAccessor.secretrooms$setReplaceable(originalAccessor.secretrooms$getReplaceable());
        return result;
    }
}
