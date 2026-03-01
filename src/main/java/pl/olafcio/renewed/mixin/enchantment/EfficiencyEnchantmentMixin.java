package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.EfficiencyEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(EfficiencyEnchantment.class)
public abstract class EfficiencyEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.efficiency";
    }
}
