package pl.olafcio.renewed.mixininterface;

import net.fabricmc.loader.impl.util.StringUtil;
import net.minecraft.block.Block;
import net.minecraft.command.InvalidNumberException;
import net.minecraft.command.SyntaxException;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface ICommand {
    // ========================== //
    // INPUT TO JAVA TYPE PARSING //
    // ========================== //

    default int parseUnsignedInt(String value) {
        if (value.startsWith("+"))
            throw new InvalidNumberException("Expected an unsigned int");

        return Integer.parseUnsignedInt(value);
    }

    // =================================== //
    // INPUT TO MINECRAFT REGISTRY PARSING //
    // =================================== //

    default Item getItem(String name) {
        return (Item) access(name, "item", (Translatable[]) Item.ITEMS);
    }

    default Block getBlock(String name) {
        return (Block) access(name, "block", (Translatable[]) Block.BLOCKS);
    }

    default Enchantment getEnchantment(String name) {
        return (Enchantment) access(name, "enchantment", (Translatable[]) Enchantment.ALL_ENCHANTMENTS);
    }

    // ========= //
    // INTERNALS //
    // ========= //

    @NotNull
    @ApiStatus.Internal
    static <T extends Translatable> T access(String name, String registryName, T[] registry) {
        if (name.startsWith("+"))
            throw new InvalidNumberException("Invalid " + registryName + " ID");

        try {
            int id = Integer.parseUnsignedInt(name);
            T item = registry[id];

            if (item == null)
                throw new ArrayIndexOutOfBoundsException(StringUtil.capitalize(registryName) + " is 'null'");

            return item;
        } catch (NumberFormatException ignored) {
            // Try the name method then
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidNumberException(StringUtil.capitalize(registryName) + " ID out of bounds");
        }

        for (int i = 1; i < registry.length; i++) {
            T item = registry[i];
            if (item == null)
                break;
            else if (
                    item.getUseKey() != null &&
                    item.getUseKey().split("\\.")[1].toLowerCase().equals(name)
            )
                return item;
        }

        throw new SyntaxException("Expected an " + registryName + " ID/name");
    }
}
