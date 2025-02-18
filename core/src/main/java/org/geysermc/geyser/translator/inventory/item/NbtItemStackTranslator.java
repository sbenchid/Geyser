/*
 * Copyright (c) 2019-2022 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.geyser.translator.inventory.item;

import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import org.geysermc.geyser.item.type.Item;
import org.geysermc.geyser.registry.type.ItemMapping;
import org.geysermc.geyser.session.GeyserSession;

public abstract class NbtItemStackTranslator {

    /**
     * Translate the item NBT to Bedrock
     * @param session the client's current session
     * @param itemTag the item's CompoundTag (cloned from Geyser's cached copy)
     * @param mapping Geyser's item mapping
     */
    public void translateToBedrock(GeyserSession session, CompoundTag itemTag, ItemMapping mapping) {

    }

    /**
     * Translate the item NBT to Java.
     * @param itemTag the item's CompoundTag
     * @param mapping Geyser's item mapping
     */
    public void translateToJava(CompoundTag itemTag, ItemMapping mapping) {

    }

    /**
     * Gets whether this nbt translator takes in this item.
     *
     * @param item Geyser's item mapping
     * @return if the item should be processed under this class
     */
    public boolean acceptItem(Item item) {
        return true;
    } // TODO

}
