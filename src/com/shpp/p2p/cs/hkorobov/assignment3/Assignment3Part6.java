package com.shpp.p2p.cs.hkorobov.assignment3;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part6 extends WindowProgram {

    /* The amount of time to pause between frames (50fps) */
    private static final double PAUSE_TIME = 1000.0 / 50;

    /* The initial horizontal velocity of the car */
    private static final double HORIZONTAL_VELOCITY = 4.0;

    /* Size of the world */
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 500;

    public void run(){
        /**
         * Crates the car that can drive throw the world
         */
        GRect carBody = makeCarBody();
        GRect carCab = makeCarCab();
        GRect firstWindow = makeFirstWindow();
        GRect secondWindow = makeSecondWindow();
        GOval firstWheel = makeFirstWheel();
        GOval secondWheel = makeSecondWheel();
        GRect firstDoor = makeFirstDoor();
        GRect secondDoor = makeSecondDoor();
        GRect thirdDoor = makeThirdDoor();

        /**
         * Creates ground and sky of the world(static)
         */
        makeGroundAndSky();

        add(secondWheel);
        add(firstWheel);
        add(carBody);
        add(carCab);
        add(firstWindow);
        add(secondWindow);
        add(firstDoor);
        add(secondDoor);
        add(thirdDoor);




        moveCar(firstWindow, firstWheel, secondWheel, secondWindow, carBody, carCab, firstDoor, secondDoor, thirdDoor);
    }

    /**
     * Simulate move of the car
     */
    private void moveCar(GRect firstWindow, GOval firstWheel, GOval secondWheel, GRect secondWindow,
                         GRect carBody, GRect carCab, GRect firstDoor, GRect secondDoor, GRect thirdDoor) {
        double carX = 0;
        while (carX != (APPLICATION_WIDTH - 160)){
            carBody.move(HORIZONTAL_VELOCITY, 0);
            carCab.move(HORIZONTAL_VELOCITY, 0);
            firstWindow.move(HORIZONTAL_VELOCITY, 0);
            secondWindow.move(HORIZONTAL_VELOCITY, 0);
            firstWheel.move(HORIZONTAL_VELOCITY, 0);
            secondWheel.move(HORIZONTAL_VELOCITY, 0);
            firstDoor.move(HORIZONTAL_VELOCITY, 0);
            secondDoor.move(HORIZONTAL_VELOCITY, 0);
            thirdDoor.move(HORIZONTAL_VELOCITY, 0);

            carX = secondWindow.getX();
            pause(PAUSE_TIME);
        }
    }

    private GRect makeFirstDoor(){
        GRect firstDoor = new GRect(102, 340, 1, 85);
        firstDoor.setFilled(true);
        firstDoor.setFillColor(Color.BLACK);
        return firstDoor;
    }
    private GRect makeSecondDoor(){
        GRect secondDoor = new GRect(175, 340, 1, 85);
        secondDoor.setFilled(true);
        secondDoor.setFillColor(Color.BLACK);
        return secondDoor;
    }
    private GRect makeThirdDoor(){
        GRect thirdDoor = new GRect(248, 340, 1, 85);
        thirdDoor.setFilled(true);
        thirdDoor.setFillColor(Color.BLACK);
        return thirdDoor;
    }
    private GOval makeFirstWheel(){
        GOval firstWheel = new GOval(50, 400, 50, 50);
        firstWheel.setFilled(true);
        firstWheel.setFillColor(Color.BLACK);

        return firstWheel;
    }
    private GOval makeSecondWheel(){
        GOval secondWheel = new GOval(250, 400, 50, 50);
        secondWheel.setFilled(true);
        secondWheel.setFillColor(Color.BLACK);

        return secondWheel;
    }
    private GRect makeCarBody(){
        GRect carBody = new GRect(0, 375, 340, 50);
        carBody.setFilled(true);
        carBody.setColor(Color.RED);
        carBody.setFillColor(Color.RED);

        return carBody;
    }
    private GRect makeCarCab(){
        GRect carCab = new GRect(100, 340, 150, 35);
        carCab.setFilled(true);
        carCab.setColor(Color.RED);
        carCab.setFillColor(Color.RED);

        return carCab;
    }
    private GRect makeFirstWindow(){
        GRect firstWindow = new GRect(110, 345, 60, 25);
        firstWindow.setFilled(true);
        firstWindow.setFillColor(Color.lightGray);

        return firstWindow;
    }
    private GRect makeSecondWindow(){
        GRect secondWindow = new GRect(180, 345, 60, 25);
        secondWindow.setFilled(true);
        secondWindow.setFillColor(Color.lightGray);

        return secondWindow;
    }



    private void makeGroundAndSky() {
        GRect ground = new GRect(0, 450, 1000, 50);
        GRect sky = new GRect(0,0, APPLICATION_WIDTH, APPLICATION_HEIGHT);

        sky.setFilled(true);
        sky.setFillColor(Color.cyan);
        sky.setColor(Color.cyan);
        ground.setFilled(true);
        ground.setFillColor(Color.GREEN);
        ground.setColor(Color.GREEN);
        add(sky);
        add(ground);
    }
}
