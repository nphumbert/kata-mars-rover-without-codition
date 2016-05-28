package com.nrhumla.mars;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrientationTest {

    @Test
    public void should_face_east_when_facing_north_and_right() {
        assertThat(Orientation.NORTH.right()).isEqualTo(Orientation.EAST);
    }

    @Test
    public void should_face_west_when_facing_south_and_rotate_right() {
        assertThat(Orientation.SOUTH.right()).isEqualTo(Orientation.WEST);
    }

    @Test
    public void should_face_south_when_facing_east_and_rotate_right() {
        assertThat(Orientation.EAST.right()).isEqualTo(Orientation.SOUTH);
    }

    @Test
    public void should_face_north_when_facing_west_and_rotate_right() {
        assertThat(Orientation.WEST.right()).isEqualTo(Orientation.NORTH);
    }
}