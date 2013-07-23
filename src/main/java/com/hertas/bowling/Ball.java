package com.hertas.bowling;

public enum Ball {
    ZERO_PIN_KNOCKED(0),

    ONE_PIN_KNOCKED(1),

    TWO_PIN_KNOCKED(2),

    THREE_PIN_KNOCKED(3),

    FOUR_PIN_KNOCKED(4),

    FIVE_PIN_KNOCKED(5),

    SIX_PIN_KNOCKED(6),

    SEVEN_PIN_KNOCKED(7),

    EIGHT_PIN_KNOCKED(8),

    NINE_PIN_KNOCKED(9),

    STRIKE(10);

    private final int pinsKnockedOut;

    Ball(int pinsKnockedOut) {
        this.pinsKnockedOut = pinsKnockedOut;
    }

    public int getPinsKnockedOut() {
        return pinsKnockedOut;
    }
}
