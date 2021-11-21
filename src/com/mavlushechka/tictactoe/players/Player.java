package com.mavlushechka.tictactoe.players;

public enum Player {
    FIRST('X'), SECOND('O');

    public final char SYMBOL;

    Player(char symbol) {
        SYMBOL = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(SYMBOL);
    }
}