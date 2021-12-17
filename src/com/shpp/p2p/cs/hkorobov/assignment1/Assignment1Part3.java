package com.shpp.p2p.cs.hkorobov.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot {
    /*
    *Karel should find middle at the line
     */

    public void run() throws Exception {
        //Karel started at the bottom left corner and looking to west
        //Karel put beepers around the edges
        makeSize();

        //Karel starts to move beepers to the middle,
        // while will be present only one beeper at the middle
        findMiddle();
    }


    //this method finds middle
    private void findMiddle() throws Exception {
        if (frontIsClear()) {
            move();
            while (noBeepersPresent()){
                move();
            }
            if (beepersPresent()) {
                pickBeeper();
                turnAround();
                move();
                if (noBeepersPresent()) {
                    putBeeper();
                    findMiddle();
                }
            }
        }
    }

    //This method puts beepers at the corners
    private void makeSize() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
        }
        turnAround();
        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }




}
