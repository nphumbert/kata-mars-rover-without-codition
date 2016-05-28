package com.nrhumla.mars.instructions;

import com.nrhumla.mars.Orientation;
import com.nrhumla.mars.Position;
import com.nrhumla.mars.instructions.RotateLeft;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateLeftTest {

    @Test
    public void should_change_orientation() {
        assertThat(new RotateLeft().apply(new Position(0, 0, Orientation.NORTH)))
                .isEqualTo(new Position(0, 0, Orientation.WEST));
    }

}