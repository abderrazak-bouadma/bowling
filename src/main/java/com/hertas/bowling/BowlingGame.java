package com.hertas.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    public static final int MAX_FRAME_NUMBER = 10;
    private static int frameIndex;
    private List<BowlingFrame> frames;

    public BowlingGame() {
        initFrames();
    }



    private void initFrames() {
        frameIndex = 0;
        frames = new ArrayList<BowlingFrame>();
        for (int i = 0; i < MAX_FRAME_NUMBER; i++) {
            frames.add(BowlingFrame.newInstance());
        }
    }

    public BowlingGame play(Ball ball) {
        BowlingFrame currentBowlingFrame = frames.get(frameIndex);
        if (currentBowlingFrame.allBallsPlayed(frameIndex))
            frameIndex++;
        frames.get(frameIndex).addBall(ball);
        calculateScore(frameIndex);
        return this;
    }

    private void calculateScore(int index) {
        if (frames.get(index).allBallsPlayed(frameIndex)) {
            int sumBallsKnockedPins = frames.get(index).getBall1().getKnockedPins() + frames.get(index).getBall2().getKnockedPins();
            int previousFrameScore = index - 1 >= 0 ? frames.get(index - 1).getSavedScore() : 0;
            int score = sumBallsKnockedPins + previousFrameScore;
            frames.get(index).setSavedScore(score);
        }
    }

    public int getScoreByFrameIndex(int i) {
        return frames.get(i - 1).getSavedScore();
    }

    public static BowlingGame newGame() {
        return new BowlingGame();
    }
}
