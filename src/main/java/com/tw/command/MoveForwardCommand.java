package com.tw.command;

import com.tw.MarsRover;

public class MoveForwardCommand implements CommandStrategy {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setCoordinate(marsRover.getOrientation().moveForward(marsRover.getCoordinate()));
    }
}
