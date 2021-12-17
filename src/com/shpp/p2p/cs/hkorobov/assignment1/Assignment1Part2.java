package com.shpp.p2p.cs.hkorobov.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot {


    public void run() throws Exception {
        //Karel makes three pillars
        while (frontIsClear()){

            turnLeft();

            while (frontIsClear()){
                makePillar();
            }
            // checking if the last beeper is exist
            if (noBeepersPresent()){
                putBeeper();
            }
            // Karel going back
            turnAround();

            while (frontIsClear()){
                move();
            }

            turnLeft();

            moveToNextPillarCorners();

        }
        turnLeft();

        while (frontIsClear()){
            makePillar();
        }

        if (noBeepersPresent()){
            putBeeper();
        }

        turnAround();

        while (frontIsClear()){
            move();
        }

        turnLeft();

    }
    //all pillars have some distance between each other that's why Karel knows how much he should make steps
    private void moveToNextPillarCorners() throws Exception {
        for (int i = 0; i < 4; i++){
            if(frontIsClear()){
                move();
            }
        }
    }
    // Karel is checking if connor is clear Karel put beeper and move forward to one connor
    private void makePillar() throws Exception {
        if (noBeepersPresent()){
            putBeeper();
        }
        move();
    }



    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }




}
