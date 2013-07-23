package com.hertas.bowling;

/**
 * Created with IntelliJ IDEA.
 * User: Utilistateur
 * Date: 23/07/13
 * Time: 12:13
 * To change this template use File | Settings | File Templates.
 */
public class Ball {
    private final int knockedPins;

    public int getKnockedPins() {
        return knockedPins;
    }

    public Ball(int knockedPins) {
        this.knockedPins = knockedPins;
    }
}
