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
        return null;
    }

    public Position rotateRight() {
        Position newPosition = new Position(position.x(), position.y(), position.orientation().right());
        position = newPosition;
        return newPosition;
    }
}
