package com.tw;

import com.tw.command.*;
import com.tw.entity.Coordinate;
import com.tw.marsRoverEnum.Command;
import com.tw.orientation.NorthOrientation;
import com.tw.orientation.Orientation;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private Coordinate coordinate;

    private Orientation orientation;

    private final Map<Character, CommandStrategy> commandStrategies;

    public MarsRover() {
        coordinate = new Coordinate(0, 0);
        orientation = new NorthOrientation();
        commandStrategies = initializeCommandActions();
    }

    private Map<Character, CommandStrategy> initializeCommandActions() {
        Map<Character, CommandStrategy> strategies = new HashMap<>();
        strategies.put(Command.L.getCommand(), new TurnLeftCommand());
        strategies.put(Command.R.getCommand(), new TurnRightCommand());
        strategies.put(Command.M.getCommand(), new MoveForwardCommand());
        strategies.put(Command.B.getCommand(), new MoveBackwardCommand());
        return strategies;
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
        CommandStrategy strategy = commandStrategies.get(commandItem);
        if (strategy != null) {
            strategy.execute(this);
        } else {
            throw new IllegalArgumentException("Invalid command: " + commandItem);
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

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
