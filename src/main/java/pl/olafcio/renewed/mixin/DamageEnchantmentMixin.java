package pl.olafcio.renewed.mixin;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(DamageEnchantment.class)
public abstract class DamageEnchantmentMixin
       implements Translatable
{
    @Shadow @Final public int typeIndex;

    @Unique
    private static final String[] KEY_NAMES
                   = new String[]{"sharpness", "smite", "bane_of_arthropods"};

    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantment." + KEY_NAMES[this.typeIndex];
    }
}
