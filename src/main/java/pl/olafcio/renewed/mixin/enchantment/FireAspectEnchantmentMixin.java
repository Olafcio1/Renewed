package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.FireAspectEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(FireAspectEnchantment.class)
public abstract class FireAspectEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.fire_aspect";
    }
}
