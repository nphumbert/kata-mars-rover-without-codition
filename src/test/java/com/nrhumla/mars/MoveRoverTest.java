package com.nrhumla.mars;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveRoverTest {

    @Test
    public void should_move_rover() {
        // given
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        // when
        rover.rotateRight();
        rover.moveForward();
        Position finalPosition = rover.rotateLeft();

        // then
        assertThat(finalPosition).isEqualTo(new Position(1, 0, Orientation.NORTH));
    }
}
