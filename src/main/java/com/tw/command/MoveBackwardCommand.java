package com.tw.command;

import com.tw.MarsRover;

public class MoveBackwardCommand implements CommandStrategy {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setCoordinate(marsRover.getOrientation().moveBackward(marsRover.getCoordinate()));
    }
}
