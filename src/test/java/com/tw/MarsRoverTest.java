package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MarsRoverTest {

    @Test
    void should_initialize_mars_rover() {
        MarsRover marsRover = new MarsRover();
        assertNotNull(marsRover);
    }

}
