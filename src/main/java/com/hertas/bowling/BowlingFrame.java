package com.hertas.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingFrame {

    private final List<Ball> balls;
    private int savedScore;

    private BowlingFrame() {
        this.balls = new ArrayList<Ball>();
    }

    public static BowlingFrame newInstance() {
        return new BowlingFrame();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public Ball getBall1() {
        return getBall(0);
    }

    public Ball getBall2() {
        return getBall(1);
    }

    public Ball getBall3() {
        return getBall(2);
    }

    private Ball getBall(int i) {
        return balls.get(i);
    }

    public int getSavedScore() {
        return this.savedScore;
    }

    public void setSavedScore(int score) {
        this.savedScore = score;
    }

    public boolean allBallsPlayed(int frameIndex) {
        if (frameIndex < 9) {
            if (balls.size() < 2)
                return false;
        } else if (frameIndex == 9) { //10th frame
            if (balls.size() < 3)
                return false;
        }
        return true;
    }
}
