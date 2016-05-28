package com.nrhumla.mars;

import java.util.HashMap;
import java.util.Map;

public enum Orientation {
    EAST, SOUTH, WEST, NORTH;

    private final static Map<Orientation, Orientation> RIGHT_ROTATIONS = initRightRotations();

    private static Map<Orientation, Orientation> initRightRotations() {
        Map<Orientation, Orientation> rightRotations = new HashMap<>();
        rightRotations.put(NORTH, EAST);
        rightRotations.put(SOUTH, WEST);
        rightRotations.put(EAST, SOUTH);
        rightRotations.put(WEST, NORTH);
        return rightRotations;
    }

    public Orientation right() {
        return RIGHT_ROTATIONS.get(this);
    }
}
