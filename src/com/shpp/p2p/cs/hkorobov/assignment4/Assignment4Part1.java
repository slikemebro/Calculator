package com.shpp.p2p.cs.hkorobov.assignment4;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Assignment4Part1 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 800;

    /* The amount of time to pause between frames (60fps) */
    private static final double PAUSE_TIME = 1000.0 / 60;

    public static final int DISTANCE_ABOVE_ROCKET = 30;
    public static final int HEIGHT_OF_ROCKET = 20;
    public static final int WIDTH_OF_ROCKET = 100;

    public void run(){
        getMenuBar().setVisible(false);

        GRect rocket = new GRect(0, (APPLICATION_HEIGHT - DISTANCE_ABOVE_ROCKET) - HEIGHT_OF_ROCKET, WIDTH_OF_ROCKET, HEIGHT_OF_ROCKET);
        rocket.setFilled(true);
        rocket.setFillColor(Color.BLACK);
        add(rocket);
        while (true){
            rocket.move(getMousePosition().x, 0);
            pause(PAUSE_TIME);
        }
    }


}
