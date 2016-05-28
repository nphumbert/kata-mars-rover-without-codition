package com.nrhumla.mars.instructions;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class MoveForward implements Instruction {

    private Map<Orientation, UnaryOperator<Position>> moves = new HashMap<>();

    public MoveForward() {
        moves.put(Orientation.NORTH, pos -> new Position(pos.x(), pos.y() + 1, pos.orientation()));
        moves.put(Orientation.SOUTH, pos -> new Position(pos.x(), pos.y() - 1, pos.orientation()));
        moves.put(Orientation.EAST, pos -> new Position(pos.x() + 1, pos.y(), pos.orientation()));
        moves.put(Orientation.WEST, pos -> new Position(pos.x() - 1, pos.y(), pos.orientation()));
    }

    @Override
    public Position apply(Position position) {
        return moves.get(position.orientation()).apply(position);
    }
}
