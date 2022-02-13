package com.shpp.p2p.cs.hkorobov.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part6 extends WindowProgram {
    //number of body caterpillar
    private static final int NUM_CIRCLES = 100;

    private static final int X = 0;
    private static final int Y_FOR_UP_CIRCLE = 0;
    private static final int Y_FOR_DOWN_CIRCLE = 30;
    private static final int RADIUS = 40;

    /*
     *This programme makes caterpillar you can change number type of body
     */
    public void run(){
        //this if check is it even number of body or not
        if ((NUM_CIRCLES % 2) == 0){
            for (int i = 0; i < NUM_CIRCLES / 2; i++){
                add(drawCircleDown(Color.GREEN, (X + 50) * i * 2, Y_FOR_DOWN_CIRCLE, RADIUS));
                add(drawCircleUp(Color.GREEN, (X + 50) * i * 2 + 50, Y_FOR_UP_CIRCLE, RADIUS));
            }
        }else{
            for (int i = 0; i < NUM_CIRCLES / 2; i++){
                add(drawCircleDown(Color.GREEN, (X + 50) * i * 2, Y_FOR_DOWN_CIRCLE, RADIUS));
                add(drawCircleUp(Color.GREEN, (X + 50) * i * 2 + 50, Y_FOR_UP_CIRCLE, RADIUS));
            }
            add(drawCircleDown(Color.GREEN, (X + 50) * (NUM_CIRCLES / 2) * 2, Y_FOR_DOWN_CIRCLE, RADIUS));
        }
    }

    //This method caterpillar
    private void fillObject(GFillable obj, Color color) {
        obj.setFillColor(color);
        obj.setFilled(true);
    }

    //This method draw all up circles
    private GOval drawCircleUp(Color color, int x, int y, int r) {
        GOval CircleUp = new GOval(x, y, r*2, r*2);
        fillObject(CircleUp, color);
        return CircleUp;
    }

    //This method draw all down circles
    private GOval drawCircleDown(Color color, int x, int y, int r) {
        GOval CircleDown = new GOval(x, y, r*2, r*2);
        fillObject(CircleDown, color);
        return CircleDown;
    }
}
