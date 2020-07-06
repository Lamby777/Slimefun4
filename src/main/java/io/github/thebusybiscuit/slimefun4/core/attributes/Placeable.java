package io.github.thebusybiscuit.slimefun4.core.attributes;

import java.util.Collection;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

/**
 * <strong>DO NOT IMPLEMENT THIS INTERFACE</strong>
 * This is implemented by every {@link SlimefunItem} by default.
 * Might be changed in the future.
 * 
 * @author TheBusyBiscuit
 *
 */
public interface Placeable {

    Collection<ItemStack> getDrops();

    Collection<ItemStack> getDrops(Player p);

    /**
     * This method determines how to treat this {@link Block} when it is broken.
     * If true is returned then it will be treated as a vanilla {@link Block}.
     * If false is returned then Slimefun will treat it as a {@link Block} that is
     * the placed down version of a {@link SlimefunItem}.
     * 
     * It returns false by default.
     * This was previously represented by the HandledBlock class.
     * 
     * @return Whether to use the vanilla block breaking behaviour
     */
    default boolean useVanillaBlockBreaking() {
        return false;
    }

    default void onPlace(Player p, Block b) {
        // Override this as necessary
    }

    default boolean onBreak(Player p, Block b) {
        // Override this as necessary
        return true;
    }

    default boolean onExplode(Block b) {
        // Override this as necessary
        return true;
    }

}
