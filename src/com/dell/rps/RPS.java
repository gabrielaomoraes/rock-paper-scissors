package com.dell.rps;

public class RPS {

    public static final String ROCK = "Rock";
    public static final String SCISSORS = "Scissors";
    public static final String P1_WINS = "P1 wins";
    public static final String P2_WINS = "P2 wins";
    public static final String PAPER = "Paper";

    public String play(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Tie";
        }

        if (player1Wins(player1, player2)) {
            return P1_WINS;
        }
        return P2_WINS;
    }

    private boolean player1Wins(String player1, String player2) {
        return (player1.equals(ROCK) && player2.equals(SCISSORS)) ||
                (player1.equals(PAPER) && player2.equals(ROCK)) ||
                (player1.equals(SCISSORS) && player2.equals(PAPER));
    }
}
