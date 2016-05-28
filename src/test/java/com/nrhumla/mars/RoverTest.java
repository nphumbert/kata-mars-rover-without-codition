package com.nrhumla.mars;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void should_apply_instruction_when_process() {
        // given
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        // when
        Position position = rover.apply(pos -> new Position(pos.x() + 1, pos.y() + 1, pos.orientation()));

        // then
        assertThat(position).isEqualTo(new Position(1, 1, Orientation.NORTH));
    }

}
