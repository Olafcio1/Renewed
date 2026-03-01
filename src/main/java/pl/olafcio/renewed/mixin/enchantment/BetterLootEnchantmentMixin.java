package pl.olafcio.renewed.mixin.enchantment;

import net.minecraft.enchantment.BetterLootEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import org.spongepowered.asm.mixin.Mixin;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(BetterLootEnchantment.class)
public abstract class BetterLootEnchantmentMixin
       extends Enchantment
       implements Translatable
{
    protected BetterLootEnchantmentMixin(int i, int j, EnchantmentTarget enchantmentTarget) {
        super(i, j, enchantmentTarget);
    }

    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        if (target == EnchantmentTarget.DIGGER)
            return "enchantment.fortune";
        else return "enchantment.looting";
    }
}
