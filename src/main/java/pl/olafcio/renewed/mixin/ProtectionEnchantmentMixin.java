package pl.olafcio.renewed.mixin;

import net.minecraft.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import pl.olafcio.renewed.mixininterface.Translatable;

@Mixin(ProtectionEnchantment.class)
public abstract class ProtectionEnchantmentMixin
       implements Translatable
{
    @Shadow @Final public int protectionTypeId;

    @Unique
    private static final String[] KEY_NAMES
                   = new String[]{"protection", "fire_protection", "feather_falling", "blast_protection", "projectile_protection"};

    @Override
    @SuppressWarnings("all")
    public String getUseKey() {
        return "enchantment." + KEY_NAMES[this.protectionTypeId];
    }
}
