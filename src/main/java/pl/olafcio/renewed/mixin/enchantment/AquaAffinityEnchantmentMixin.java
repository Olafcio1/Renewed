package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.AquaAffinityEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(AquaAffinityEnchantment.class)
public abstract class AquaAffinityEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantment.aqua_affinity";
    }
}
