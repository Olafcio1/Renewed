package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.FlameEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(FlameEnchantment.class)
public abstract class FlameEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.flame";
    }
}
