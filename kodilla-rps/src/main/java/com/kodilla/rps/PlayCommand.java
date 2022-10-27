package com.kodilla.rps;

public enum PlayCommand {
    ROCK("1"), PAPER("2"), SCISSORS("3"), ENDGAME("x"), NEWGAME("n");

    private String s;

    PlayCommand(String s) {
        this.s = s;
    }

    public static PlayCommand Of(String s) {
        for (PlayCommand possibilities : values()) {
            if (possibilities.s.equals(s)) {
                return possibilities;
            }
        }

        throw new IllegalArgumentException("Wrong move" + s);
    }

}

