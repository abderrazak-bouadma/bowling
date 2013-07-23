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
        Assert.assertEquals(5, game.getFrame(1).getScore());
    }


}
