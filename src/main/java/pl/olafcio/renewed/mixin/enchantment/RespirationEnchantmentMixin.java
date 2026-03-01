package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.RespirationEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(RespirationEnchantment.class)
public abstract class RespirationEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.respiration";
    }
}
