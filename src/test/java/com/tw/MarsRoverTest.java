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

    @Test
    void should_face_west_when_execute_command_l_given_0_0_N() {
        MarsRover marsRover = new MarsRover();

        String report = marsRover.executeCommand("L");

        assertEquals("0:0:W", report);
    }

    @Test
    void should_face_east_when_execute_command_r_given_0_0_N() {
        MarsRover marsRover = new MarsRover();

        String report = marsRover.executeCommand("R");

        assertEquals("0:0:E", report);
    }

}
