package com.nrhumla.mars;

import java.util.HashMap;
import java.util.Map;

public enum Orientation {
    EAST, SOUTH, WEST, NORTH;

    private final static Map<Orientation, Orientation> RIGHT_ROTATIONS = initRightRotations();
    private final static Map<Orientation, Orientation> LEFT_ROTATIONS = initLeftRotations();

    public Orientation right() {
        return RIGHT_ROTATIONS.get(this);
    }

    private static Map<Orientation, Orientation> initRightRotations() {
        Map<Orientation, Orientation> rightRotations = new HashMap<>();
        rightRotations.put(NORTH, EAST);
        rightRotations.put(SOUTH, WEST);
        rightRotations.put(EAST, SOUTH);
        rightRotations.put(WEST, NORTH);
        return rightRotations;
    }

    public Orientation left() {
        return LEFT_ROTATIONS.get(this);
    }

    private static Map<Orientation, Orientation> initLeftRotations() {
        Map<Orientation, Orientation> leftRotations = new HashMap<>();
        leftRotations.put(NORTH, WEST);
        leftRotations.put(SOUTH, EAST);
        leftRotations.put(EAST, NORTH);
        leftRotations.put(WEST, SOUTH);
        return leftRotations;
    }
}
