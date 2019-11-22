package com.dell.rps;

import org.junit.jupiter.api.Test;

import static com.dell.rps.RPS.P1_WINS;
import static com.dell.rps.RPS.P2_WINS;
import static com.dell.rps.RPS.PAPER;
import static com.dell.rps.RPS.ROCK;
import static com.dell.rps.RPS.SCISSORS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RpsTest {

    private RPS game = new RPS();

    @Test
    public void shouldP1WinsWhenRockVsScissor() {
        String result = game.play(ROCK, SCISSORS);

        assertEquals(P1_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenScissorVsRock() {
        String result = game.play(SCISSORS, ROCK);

        assertEquals(P2_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenRockVsPaper() {
        String result = game.play(ROCK, PAPER);

        assertEquals(P2_WINS, result);
    }

    @Test
    public void shouldP1WinsWhenPaperVsRock() {
        String result = game.play(PAPER, ROCK);

        assertEquals(P1_WINS, result);
    }

    @Test
    public void shouldP1WinsWhenScissorsVsPaper() {
        String result = game.play(SCISSORS, PAPER);

        assertEquals(P1_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenPaperVsScissors() {
        String result = game.play(PAPER, SCISSORS);

        assertEquals(P2_WINS, result);
    }

    @Test
    public void shouldTieWhenBothCallTheSame() {
        String result = game.play(ROCK, ROCK);

        assertEquals("Tie", result);
    }
}
