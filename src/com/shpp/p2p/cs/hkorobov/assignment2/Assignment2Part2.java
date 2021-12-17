package com.shpp.p2p.cs.hkorobov.assignment2;


import acm.graphics.GFillable;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    //this constants make height and width of window
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;

    public static final int DIAMETER_OF_CIRCLE = 100;

    public static final int SIZE_OF_SQUARE = 200;

    public static final int LOCATION_OF_CIRCLES = 200;
    public static final int SECOND_LOCATION_OF_CIRCLES = 0;
    public static final int LOCATION_OF_SQUARE = 50;

    /**
     * this programme will make illusion
     * it will be 4 black circles at the all corners
     * and 1 white square  at the middle
     */
    public void run() {
        //this method delete menu bar
        getMenuBar().setVisible(false);

        GOval LeftTopOval = new GOval(SECOND_LOCATION_OF_CIRCLES, SECOND_LOCATION_OF_CIRCLES, DIAMETER_OF_CIRCLE, DIAMETER_OF_CIRCLE);
        GOval RightTopOval = new GOval(LOCATION_OF_CIRCLES, SECOND_LOCATION_OF_CIRCLES, DIAMETER_OF_CIRCLE, DIAMETER_OF_CIRCLE);
        GOval LeftBottomOval = new GOval(SECOND_LOCATION_OF_CIRCLES, LOCATION_OF_CIRCLES, DIAMETER_OF_CIRCLE, DIAMETER_OF_CIRCLE);
        GOval RightBottomOval = new GOval(LOCATION_OF_CIRCLES, LOCATION_OF_CIRCLES, DIAMETER_OF_CIRCLE, DIAMETER_OF_CIRCLE);
        GRect WhiteRect = new GRect(LOCATION_OF_SQUARE, LOCATION_OF_SQUARE, SIZE_OF_SQUARE, SIZE_OF_SQUARE);

        fillObject(LeftTopOval, Color.BLACK);
        fillObject(RightTopOval, Color.BLACK);
        fillObject(LeftBottomOval, Color.BLACK);
        fillObject(RightBottomOval, Color.BLACK);

        fillObject(WhiteRect, Color.WHITE);
        WhiteRect.setColor(Color.WHITE);

        //draw the illusion
        add(LeftTopOval);
        add(RightTopOval);
        add(LeftBottomOval);
        add(RightBottomOval);
        add(WhiteRect);
    }
    //This method fill all circles and square
    private void fillObject(GFillable obj, Color color) {
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}