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

    public static BowlingGame newGame() {
        return new BowlingGame();
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
        return this;
    }

    public BowlingGame calculateScore() {
        if (frames.get(frameIndex).allBallsPlayed(frameIndex)) {
            int sumBallsKnockedPins = frames.get(frameIndex).getBall1().getPinsKnockedOut() + frames.get(frameIndex).getBall2().getPinsKnockedOut();
            int previousFrameScore = frameIndex - 1 >= 0 ? frames.get(frameIndex - 1).getSavedScore() : 0;
            int score = sumBallsKnockedPins + previousFrameScore;
            frames.get(frameIndex).setSavedScore(score);
        }
        return this;
    }

    public int getFirstFrameScore() {
        return getScoreByFrameIndex(1);
    }

    public int getSecondFrameScore() {
        return getScoreByFrameIndex(2);
    }

    public int getThirdFrameScore() {
        return getScoreByFrameIndex(3);
    }

    public int getFourthFrameScore() {
        return getScoreByFrameIndex(4);
    }

    public int getFifthFrameScore() {
        return getScoreByFrameIndex(5);
    }

    public int getSixthFrameScore() {
        return getScoreByFrameIndex(6);
    }

    public int getSeventhFrameScore() {
        return getScoreByFrameIndex(7);
    }

    public int getEighthFrameScore() {
        return getScoreByFrameIndex(8);
    }

    public int getNinethFrameScore() {
        return getScoreByFrameIndex(9);
    }

    public int getTenthFrameScore() {
        return getScoreByFrameIndex(10);
    }

    private int getScoreByFrameIndex(int i) {
        return frames.get(i - 1).getSavedScore();
    }
}
