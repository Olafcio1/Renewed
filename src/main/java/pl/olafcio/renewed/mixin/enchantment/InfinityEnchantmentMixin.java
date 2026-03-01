package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.InfinityEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(InfinityEnchantment.class)
public abstract class InfinityEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.infinity";
    }
}
