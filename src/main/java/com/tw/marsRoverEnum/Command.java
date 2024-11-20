package com.tw.marsRoverEnum;

import com.tw.MarsRover;
import com.tw.command.*;

public enum Command {

    M('M', new MoveForwardCommand()),
    L('L', new TurnLeftCommand()),
    R('R', new TurnRightCommand()),
    B('B', new MoveBackwardCommand());

    private final char command;
    private final CommandStrategy strategy;

    Command(char command, CommandStrategy strategy) {
        this.command = command;
        this.strategy = strategy;
    }

    public char getCommand() {
        return command;
    }

    public void execute(MarsRover marsRover) {
        strategy.execute(marsRover);
    }

    public static Command fromChar(char commandChar) {
        for (Command command : Command.values()) {
            if (command.command == commandChar) {
                return command;
            }
        }
        throw new IllegalArgumentException("Invalid command: " + commandChar);
    }
}
