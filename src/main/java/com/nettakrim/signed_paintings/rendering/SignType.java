package com.nettakrim.signed_paintings.rendering;

import net.minecraft.world.level.block.*;

public class SignType {
    public enum Type {
        STANDING,
        WALL,
        HANGING,
        WALL_HANGING
    }

    public static SignType.Type getType(Block block) {
        if (block instanceof StandingSignBlock) return Type.STANDING;
        if (block instanceof WallSignBlock) return Type.WALL;
        if (block instanceof CeilingHangingSignBlock) return Type.HANGING;
        if (block instanceof WallHangingSignBlock) return Type.WALL_HANGING;
        return Type.STANDING;
    }
}
