package com.hertas.bowling;

import junit.framework.Assert;
import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void frame1_score_should_equals_5() {
        BowlingGame game = BowlingGame.newGame().play(Ball.ONE_PIN_BALL).play(Ball.FOUR_PIN_BALL);
        int scoreByFrameIndex = game.getScoreByFrameIndex(1);
        Assert.assertEquals(5, scoreByFrameIndex);
    }

    @Test
    public void frame2_score_should_be_14() {
        BowlingGame game = BowlingGame.newGame().play(Ball.ONE_PIN_BALL).play(Ball.FOUR_PIN_BALL).play(Ball.FOUR_PIN_BALL).play(Ball.FIVE_PIN_BALL);
        Assert.assertEquals(14, game.getScoreByFrameIndex(2));
    }

    @Test
    public void frame3_strike_calculate_score() {
        BowlingGame game = BowlingGame.newGame();
        game.play(Ball.ONE_PIN_BALL).play(Ball.FOUR_PIN_BALL).play(Ball.STRIKE_BALL).play(Ball.FOUR_PIN_BALL).play(Ball.SIX_PIN_BALL);
    }
}
