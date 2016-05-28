package com.nrhumla.mars;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class Rover {

    private Position position;
    private Map<Orientation, UnaryOperator<Position>> moves = new HashMap<>();

    public Rover(Position position) {
        this.position = position;
        moves.put(Orientation.NORTH, pos -> new Position(pos.x(), pos.y() + 1, pos.orientation()));
        moves.put(Orientation.SOUTH, pos -> new Position(pos.x(), pos.y() - 1, pos.orientation()));
        moves.put(Orientation.EAST, pos -> new Position(pos.x() + 1, pos.y(), pos.orientation()));
        moves.put(Orientation.WEST, pos -> new Position(pos.x() - 1, pos.y(), pos.orientation()));
    }

    public Position moveForward() {
        Position newPosition = moves.get(position.orientation()).apply(position);
        position = newPosition;
        return newPosition;
    }

    public Position rotateLeft() {
        Position newPosition = new Position(position.x(), position.y(), position.orientation().left());
        position = newPosition;
        return newPosition;
    }

    public Position rotateRight() {
        Position newPosition = new Position(position.x(), position.y(), position.orientation().right());
        position = newPosition;
        return newPosition;
    }
}
