package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.SilkTouchEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(SilkTouchEnchantment.class)
public abstract class SilkTouchEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.silk_touch";
    }
}
