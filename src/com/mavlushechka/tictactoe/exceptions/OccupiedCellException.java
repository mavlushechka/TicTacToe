package com.mavlushechka.tictactoe.exceptions;

public class OccupiedCellException extends Exception {
    public OccupiedCellException(String errorMessage) {
        super(errorMessage);
    }
}
