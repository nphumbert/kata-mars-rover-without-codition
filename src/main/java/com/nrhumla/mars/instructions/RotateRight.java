package com.nrhumla.mars.instructions;

import com.nrhumla.mars.Position;

public class RotateRight implements Instruction {

    @Override
    public Position apply(Position position) {
        return new Position(position.x(), position.y(), position.orientation().right());
    }
}
