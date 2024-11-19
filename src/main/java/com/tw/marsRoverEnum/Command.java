package com.tw.marsRoverEnum;

public enum Command {
    M('M'),
    L('L'),
    R('R'),
    B('B');

    private final char command;

    Command(char command) {
        this.command = command;
    }

    public char getCommand() {
        return command;
    }

}
