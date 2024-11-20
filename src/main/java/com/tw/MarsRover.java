package com.tw;

import com.tw.entity.Coordinate;
import com.tw.marsRoverEnum.Command;
import com.tw.orientation.NorthOrientation;
import com.tw.orientation.Orientation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MarsRover {

    private Coordinate coordinate;

    private Orientation orientation;

    private final Map<Character, Consumer<Void>> commandActions;

    public MarsRover() {
        coordinate = new Coordinate(0, 0);
        orientation = new NorthOrientation();
        commandActions = initializeCommandActions();
    }

    private Map<Character, Consumer<Void>> initializeCommandActions() {
        Map<Character, Consumer<Void>> actions = new HashMap<>();
        actions.put(Command.L.getCommand(), v -> turnLeft());
        actions.put(Command.R.getCommand(), v -> turnRight());
        actions.put(Command.M.getCommand(), v -> moveForward());
        actions.put(Command.B.getCommand(), v -> moveBackward());
        return actions;
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
        Consumer<Void> action = commandActions.get(commandItem);
        if (action != null) {
            action.accept(null);
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


}
