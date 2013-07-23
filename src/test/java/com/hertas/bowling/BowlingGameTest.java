package com.hertas.bowling;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Utilistateur
 * Date: 23/07/13
 * Time: 10:25
 */
public class BowlingGameTest {

    @Test
    public void frame1_score_should_equals_5() {
        BowlingGame game = new BowlingGame();
        game.play(new Ball(1));
        game.play(new Ball(4));
        int scoreByFrameIndex = game.getScoreByFrameIndex(1);
        Assert.assertEquals(5, scoreByFrameIndex);
    }

    @Test
    public void frame2_score_should_be_14() {
        BowlingGame game = new BowlingGame();
        game.play(new Ball(1));
        game.play(new Ball(4));
        game.play(new Ball(4));
        game.play(new Ball(5));
        Assert.assertEquals(14, game.getScoreByFrameIndex(2));
    }

    @Test
    public void frame3_strike_calculate_score() {
         //
    }
}
