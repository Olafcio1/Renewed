package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.UnbreakingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(UnbreakingEnchantment.class)
public abstract class UnbreakingEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.unbreaking";
    }
}
