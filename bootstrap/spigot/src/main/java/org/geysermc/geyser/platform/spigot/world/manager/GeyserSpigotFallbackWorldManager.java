/*
 * Copyright (c) 2019-2021 GeyserMC. http://geysermc.org
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

package org.geysermc.geyser.platform.spigot.world.manager;

import org.bukkit.plugin.Plugin;
import org.geysermc.geyser.session.GeyserSessionImpl;
import org.geysermc.geyser.level.block.BlockStateValues;

/**
 * Should only be used when we know {@link GeyserSpigotWorldManager#getBlockAt(GeyserSessionImpl, int, int, int)}
 * cannot be accurate. Typically, this is when ViaVersion is not installed but a client still manages to connect.
 * If this occurs to you somehow, please let us know!!
 */
public class GeyserSpigotFallbackWorldManager extends GeyserSpigotWorldManager {
    public GeyserSpigotFallbackWorldManager(Plugin plugin) {
        super(plugin);
    }

    @Override
    public int getBlockAt(GeyserSessionImpl session, int x, int y, int z) {
        return BlockStateValues.JAVA_AIR_ID;
    }

    @Override
    public boolean hasOwnChunkCache() {
        return false;
    }

    @Override
    public boolean isLegacy() {
        return true;
    }
}
