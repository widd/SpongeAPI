/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
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
 */
package org.spongepowered.api.world.teleport;

import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

public final class TeleportHelperKernels {

    private TeleportHelperKernels() {}

    // SORTFIELDS:ON

    /**
     * The default behavior for safe teleportation, this kernel attempts to
     * find a location to teleport to that has the following characteristics:
     *
     * <ul>
     *     <li>The two blocks that the player would occupy (the target and the
     *     block above) are passable.</li>
     *     <li>The floor is a non-passable or liquid block which is not known
     *     to harm the player.</li>
     * </ul>
     */
    public final static TeleportHelperKernel DEFAULT = DummyObjectProvider.createFor(TeleportHelperKernel.class, "DEFAULT");

    /**
     * This kernel attempts to find the following:
     *
     * <ul>
     *     <li>A block that is air or a liquid which is not known by Sponge
     *     to harm the player.</li>
     *     <li>A similar block one block above the target.</li>
     *     <li>That floor blocks are not cacti (and thus, hurt).</li>
     * </ul>
     */
    public final static TeleportHelperKernel FLYING = DummyObjectProvider.createFor(TeleportHelperKernel.class, "FLYING");

    /**
     * This kernel is the same as the {@link #DEFAULT} kernel, except that
     * portals are not valid targets.
     */
    public final static TeleportHelperKernel NO_PORTAL = DummyObjectProvider.createFor(TeleportHelperKernel.class, "NO_PORTAL");

    /**
     * This kernel is the same as the {@link #DEFAULT} kernel, except that
     * only targets that can see the sky are considered.
     */
    public final static TeleportHelperKernel SURFACE_ONLY = DummyObjectProvider.createFor(TeleportHelperKernel.class, "SURFACE_ONLY");

    // SORTFIELDS:OFF

}
