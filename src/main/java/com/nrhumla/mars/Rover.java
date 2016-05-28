package com.nrhumla.mars;

import com.nrhumla.mars.instructions.Instruction;

public class Rover {

    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position apply(Instruction instruction) {
        position = instruction.apply(position);
        return position;
    }
}
