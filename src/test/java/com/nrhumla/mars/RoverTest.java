package com.nrhumla.mars;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void should_change_orientation_when_rotate_right() {
        // given
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        // when
        Position position = rover.rotateRight();

        // then
        assertThat(position).isEqualTo(new Position(0, 0, Orientation.EAST));
    }

    @Test
    public void should_change_orientation_when_rotate_left() {
        // given
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        // when
        Position position = rover.rotateLeft();

        // then
        assertThat(position).isEqualTo(new Position(0, 0, Orientation.WEST));
    }

}
