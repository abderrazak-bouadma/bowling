package com.hertas.bowling;

import junit.framework.Assert;
import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void frame1_score_should_equals_5() {
        BowlingGame game = BowlingGame.newGame();
        game.play(Ball.ONE_PIN_BALL).calculateScore();
        game.play(Ball.FOUR_PIN_BALL).calculateScore();
        int scoreByFrameIndex = game.getFirstFrameScore();
        int expected = 5;
        Assert.assertEquals(expected, scoreByFrameIndex);
    }

    @Test
    public void frame2_score_should_be_14() {
        BowlingGame game = BowlingGame.newGame();
        game.play(Ball.ONE_PIN_BALL).calculateScore();
        game.play(Ball.FOUR_PIN_BALL).calculateScore();
        game.play(Ball.FOUR_PIN_BALL).calculateScore();
        game.play(Ball.FIVE_PIN_BALL).calculateScore();
        int expected = 14;
        Assert.assertEquals(expected, game.getSecondFrameScore());
    }

    public void frame3_strike_calculate_score() {
        BowlingGame game = BowlingGame.newGame();
        game.play(Ball.ONE_PIN_BALL).calculateScore();
        game.play(Ball.FOUR_PIN_BALL).calculateScore();
        game.play(Ball.STRIKE_BALL).calculateScore();
        game.play(Ball.FOUR_PIN_BALL).calculateScore();
        game.play(Ball.SIX_PIN_BALL).calculateScore();
    }
}
