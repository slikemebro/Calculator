package com.shpp.p2p.cs.hkorobov.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part4 extends WindowProgram {
    //this constants make height and width of window
    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 800;

    //this constants give position of each color of the flag
    public static final int COLOR_WIDTH = 150;
    public static final int COLOR_HEIGHT = 500;

    public static final int COLOR_POSITION_HEIGHT = 150;

    public static final int COLOR_POSITION_WIDTH = 175;

    //this constants give font size of name of flag
    public static final String FONT_SIZE = "Verdana-50";

    /**
     * This programme makes vertical flag of Belgium
     * and writes a name of flag at the right bottom corner
     */
    public void run() {
        //this method delete menu bar
        getMenuBar().setVisible(false);

        //make flag of 3 colors
        GRect FlagOfBelgiumFirstColor = new GRect(COLOR_POSITION_WIDTH, COLOR_POSITION_HEIGHT, COLOR_WIDTH, COLOR_HEIGHT);
        GRect FlagOfBelgiumSecondColor = new GRect(COLOR_POSITION_WIDTH + COLOR_POSITION_HEIGHT, COLOR_POSITION_HEIGHT, COLOR_WIDTH, COLOR_HEIGHT);
        GRect FlagOfBelgiumThirdColor = new GRect(COLOR_POSITION_WIDTH + (COLOR_POSITION_HEIGHT * 2), COLOR_POSITION_HEIGHT, COLOR_WIDTH, COLOR_HEIGHT);

        //make a name of flag and draw whit right position
        GLabel NameOfFlag = new GLabel("Flag of Belgium");

        fillObject(FlagOfBelgiumFirstColor, Color.BLACK);

        fillObject(FlagOfBelgiumSecondColor, Color.YELLOW);

        fillObject(FlagOfBelgiumThirdColor, Color.RED);

        NameOfFlag.setColor(Color.black);
        NameOfFlag.setFont(FONT_SIZE);

        add(FlagOfBelgiumFirstColor);
        add(FlagOfBelgiumSecondColor);
        add(FlagOfBelgiumThirdColor);
        add(NameOfFlag, getWidth() - NameOfFlag.getWidth(),
                getHeight() - 10);
    }
    //This method fill flag
    private void fillObject(GRect obj, Color color) {
        obj.setColor(color);
        obj.setFillColor(color);
        obj.setFilled(true);
    }
}