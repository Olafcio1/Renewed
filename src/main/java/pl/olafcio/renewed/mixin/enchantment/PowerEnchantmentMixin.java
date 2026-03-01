package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.PowerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(PowerEnchantment.class)
public abstract class PowerEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.power";
    }
}
