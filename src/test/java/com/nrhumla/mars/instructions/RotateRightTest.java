package com.nrhumla.mars.instructions;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;
import com.nrhumla.mars.instructions.RotateRight;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateRightTest {

    @Test
    public void should_change_orientation_when_rotate_right() {
        assertThat(new RotateRight().apply(new Position(0, 0, Orientation.NORTH)))
                .isEqualTo(new Position(0, 0, Orientation.EAST));
    }
}