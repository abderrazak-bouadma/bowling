package com.hertas.bowling;

public enum Ball {
    ZERO_PIN_BALL(0),

    ONE_PIN_BALL(1),

    TWO_PIN_BALL(2),

    THREE_PIN_BALL(3),

    FOUR_PIN_BALL(4),

    FIVE_PIN_BALL(5),

    SIX_PIN_BALL(6),

    SEVEN_PIN_BALL(7),

    EIGHT_PIN_BALL(8),

    NINE_PIN_BALL(9),

    STRIKE_BALL(10);

    private final int pinsKnockedOut;

    Ball(int pinsKnockedOut) {
        this.pinsKnockedOut = pinsKnockedOut;
    }

    public int getPinsKnockedOut() {
        return pinsKnockedOut;
    }
}
