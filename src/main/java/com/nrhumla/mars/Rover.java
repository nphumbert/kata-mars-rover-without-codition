package com.nrhumla.mars;

public class Rover {

    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position moveForward() {
        return null;
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
