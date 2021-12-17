package com.shpp.p2p.cs.hkorobov.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part3 extends WindowProgram {


    //the position of all toes
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /*
     *The position of the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    //this constants make height and width of window
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    /**
     * this programme makes two black paws
     * and you can change position of paws
     */
    public void run() {
        //this method delete menu bar
        getMenuBar().setVisible(false);

        //this function change position
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }
    private void drawPawprint(int x, int y) {
        GOval FirstToe = new GOval(FIRST_TOE_OFFSET_X + x, FIRST_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        GOval SecondToe = new GOval(SECOND_TOE_OFFSET_X + x, SECOND_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        GOval ThirdToe = new GOval(THIRD_TOE_OFFSET_X + x, THIRD_TOE_OFFSET_Y + y, TOE_WIDTH, TOE_HEIGHT);
        GOval Heel = new GOval(HEEL_OFFSET_X + x, HEEL_OFFSET_Y + y, HEEL_WIDTH, HEEL_HEIGHT);

        fillObject(FirstToe, Color.BLACK);
        fillObject(SecondToe, Color.BLACK);
        fillObject(ThirdToe,Color.BLACK);
        fillObject(Heel, Color.BLACK);

        //draw paw
        add(FirstToe);
        add(SecondToe);
        add(ThirdToe);
        add(Heel);
    }
    //This method fill all circles and square
    private void fillObject(GFillable obj, Color color) {
        obj.setFillColor(color);
        obj.setFilled(true);
    }


}