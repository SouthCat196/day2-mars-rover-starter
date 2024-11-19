package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverTest {

    @Test
    void should_initialize_mars_rover() {
        MarsRover marsRover = new MarsRover();
        assertNotNull(marsRover);
    }

    @Test
    void should_show_status() {
        MarsRover marsRover = new MarsRover();
        String status = marsRover.showStatus();
        assertEquals("0:0:N", status);
    }

}
