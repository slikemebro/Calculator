package com.shpp.p2p.cs.hkorobov.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public static final int APPLICATION_WIDTH = 310;
    public static final int APPLICATION_HEIGHT = 285;

    public static final int WIDTH_SPACE_OF_BOX = 50;

    /**
     * This programme makes illusion a lot of squares
     */
    public void run(){
        for (int i = 0; i < NUM_ROWS; i++){
            for (int j = 0; j < NUM_COLS; j++){
                GRect BlackSquare = new GRect((j * WIDTH_SPACE_OF_BOX) + BOX_SPACING, (i * WIDTH_SPACE_OF_BOX) + BOX_SPACING,
                        BOX_SIZE, BOX_SIZE);
                BlackSquare.setFilled(true);
                BlackSquare.setFillColor(Color.BLACK);
                add(BlackSquare);
            }
        }
    }
}
