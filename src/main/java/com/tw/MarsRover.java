package com.tw;

import com.tw.entity.Coordinate;
import com.tw.marsRoverEnum.Command;
import com.tw.orientation.NorthOrientation;
import com.tw.orientation.Orientation;

public class MarsRover {

    private Coordinate coordinate;

    private Orientation orientation;

    public MarsRover() {
        coordinate = new Coordinate(0, 0);
        orientation = new NorthOrientation();
    }

    public String showStatus() {
        return String.format("%s:%s:%s", coordinate.getAbscissa(), coordinate.getOrdinate(), orientation.getDirection());
    }

    public String executeCommand(String command) {
        command.chars()
                .mapToObj(c -> (char) c)
                .forEach(this::executeCommandItem);

        return showStatus();
    }

    private void executeCommandItem(char commandItem) {
        if (Command.L.getCommand() == commandItem) {
            turnLeft();
        }
        if (Command.R.getCommand() == (commandItem)) {
            turnRight();
        }
        if (Command.M.getCommand() == (commandItem)) {
            moveForward();
        }
        if (Command.B.getCommand() == (commandItem)) {
            moveBackward();
        }
    }

    private void moveBackward() {
        coordinate = orientation.moveBackward(coordinate);
    }

    private void moveForward() {
        coordinate = orientation.moveForward(coordinate);
    }

    private void turnLeft() {
        orientation = orientation.turnLeft();
    }

    private void turnRight() {
        orientation = orientation.turnRight();
    }


}
