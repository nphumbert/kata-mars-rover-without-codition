package com.nrhumla.mars;

import com.nrhumla.mars.instructions.MoveForward;
import com.nrhumla.mars.instructions.RotateLeft;
import com.nrhumla.mars.instructions.RotateRight;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveRoverTest {

    @Test
    public void should_move_rover() {
        // given
        Rover rover = new Rover(new Position(0, 0, Orientation.NORTH));

        // when
        rover.apply(new RotateRight());
        rover.apply(new MoveForward());
        Position finalPosition = rover.apply(new RotateLeft());

        // then
        assertThat(finalPosition).isEqualTo(new Position(1, 0, Orientation.NORTH));
    }
}
