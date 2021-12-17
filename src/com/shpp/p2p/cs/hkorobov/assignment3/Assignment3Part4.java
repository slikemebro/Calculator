package com.shpp.p2p.cs.hkorobov.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
    /**
     * This program makes pyramid
     */
public class Assignment3Part4 extends WindowProgram {
    public static final int BRICK_HEIGHT = 50;
    public static final int BRICK_WIDTH = 100;
    /**
     * if you want change size of pyramid, you should change BRICKS_IN_BASE
     */
    public static final int BRICKS_IN_BASE = 10;
    public static final int APPLICATION_WIDTH = BRICK_WIDTH * BRICKS_IN_BASE;
    public static final int APPLICATION_HEIGHT = BRICK_HEIGHT * BRICKS_IN_BASE;
    public void run() {
        getMenuBar().setVisible(false);
        makePyramid();
    }
    private void makePyramid() {
        /**
         * this cycle makes height of pyramid
         */
        for (int i = 0; i < BRICKS_IN_BASE; i++){
            /**
             * this cycle makes width of pyramid
             */
            for (int j = i; j < BRICKS_IN_BASE; j++){
                GRect BlackRect = new GRect((APPLICATION_WIDTH - BRICK_WIDTH) - (BRICK_WIDTH * j) + (i * (BRICK_WIDTH / 2)),
                        (APPLICATION_HEIGHT - BRICK_HEIGHT) - (i * BRICK_HEIGHT),
                        BRICK_WIDTH, BRICK_HEIGHT);
                /**
                 * set color blocks of pyramid
                 */
                BlackRect.setFillColor(Color.WHITE);
                BlackRect.setFilled(true);
                add(BlackRect);
            }
        }
    }
}

