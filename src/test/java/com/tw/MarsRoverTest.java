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

    @Test
    void should_move_forward_when_execute_command_m_given_0_0_N() {
        MarsRover marsRover = new MarsRover();

        String report = marsRover.executeCommand("M");

        assertEquals("0:1:N", report);
    }

    @Test
    void should_move_backward_when_execute_command_m_given_0_0_N() {
        MarsRover marsRover = new MarsRover();

        String report = marsRover.executeCommand("B");

        assertEquals("0:-1:N", report);
    }

    MarsRover build01EMarsRover() {
        MarsRover marsRover = new MarsRover();
        marsRover.executeCommand("M");
        marsRover.executeCommand("R");
        return marsRover;
    }

    @Test
    void should_face_north_when_execute_command_l_given_0_1_E() {
        MarsRover marsRover = build01EMarsRover();

        String report = marsRover.executeCommand("L");

        assertEquals("0:1:N", report);
    }

    @Test
    void should_face_south_when_execute_command_r_given_0_1_E() {
        MarsRover marsRover = build01EMarsRover();

        String report = marsRover.executeCommand("R");

        assertEquals("0:1:S", report);
    }

    @Test
    void should_move_forward_when_execute_command_m_given_0_1_E() {
        MarsRover marsRover = build01EMarsRover();

        String report = marsRover.executeCommand("M");

        assertEquals("1:1:E", report);
    }

    @Test
    void should_move_backward_when_execute_command_m_given_0_1_E() {
        MarsRover marsRover = build01EMarsRover();

        String report = marsRover.executeCommand("B");

        assertEquals("-1:1:E", report);
    }

    MarsRover build10SMarsRover() {
        MarsRover marsRover = new MarsRover();
        marsRover.executeCommand("R");
        marsRover.executeCommand("M");
        marsRover.executeCommand("R");
        return marsRover;
    }

    @Test
    void should_face_east_when_execute_command_l_given_1_0_S() {
        MarsRover marsRover = build10SMarsRover();

        String report = marsRover.executeCommand("L");

        assertEquals("1:0:E", report);
    }

    @Test
    void should_face_west_when_execute_command_r_given_1_0_S() {
        MarsRover marsRover = build10SMarsRover();

        String report = marsRover.executeCommand("R");

        assertEquals("1:0:W", report);
    }

    @Test
    void should_move_forward_when_execute_command_m_given_1_0_S() {
        MarsRover marsRover = build10SMarsRover();

        String report = marsRover.executeCommand("M");

        assertEquals("1:-1:S", report);
    }

    @Test
    void should_move_backward_when_execute_command_m_given_1_0_S() {
        MarsRover marsRover = build10SMarsRover();

        String report = marsRover.executeCommand("B");

        assertEquals("1:1:S", report);
    }

    MarsRover build11WMarsRover() {
        MarsRover marsRover = new MarsRover();
        marsRover.executeCommand("R");
        marsRover.executeCommand("M");
        marsRover.executeCommand("L");
        marsRover.executeCommand("M");
        marsRover.executeCommand("L");
        return marsRover;
    }

    @Test
    void should_face_south_when_execute_command_l_given_1_1_W() {
        MarsRover marsRover = build11WMarsRover();

        String report = marsRover.executeCommand("L");

        assertEquals("1:1:S", report);
    }

    @Test
    void should_face_north_when_execute_command_r_given_1_1_W() {
        MarsRover marsRover = build11WMarsRover();

        String report = marsRover.executeCommand("R");

        assertEquals("1:1:N", report);
    }

    @Test
    void should_move_forward_when_execute_command_m_given_1_1_W() {
        MarsRover marsRover = build11WMarsRover();

        String report = marsRover.executeCommand("M");

        assertEquals("0:1:W", report);
    }

    @Test
    void should_move_backward_when_execute_command_m_given_1_1_W() {
        MarsRover marsRover = build11WMarsRover();

        String report = marsRover.executeCommand("B");

        assertEquals("2:1:W", report);
    }

    @Test
    void should_return_2_1_S_when_execute_command_MRMRMLMLMRR_given_0_0_N() {
        MarsRover marsRover = new MarsRover();

        String report = marsRover.executeCommand("MRMRMLMLMRR");

        assertEquals("2:1:S", report);
    }

}
