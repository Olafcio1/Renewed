package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.PunchEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(PunchEnchantment.class)
public abstract class PunchEnchantmentMixin
       implements Translatable
{
    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantments.punch";
    }
}
