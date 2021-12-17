package com.shpp.p2p.cs.hkorobov.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part4 extends KarelTheRobot {
    /*
    *Karel should make chessboard
     */

    public void run() throws Exception {
        /*
        *Karel started at the bottom left corner and looking to the west
        * He puts one beeper at the start
         */
        putBeeper();
        move();

        //Karel doing all in cycle while he looks to th East and at the left is clear
        //or while he looks at the West and at the right is clear

        while ((rightIsClear() || notFacingWest()) && (leftIsClear() || notFacingEast())) {
            makeLine();
            moveToTheNextLine();
        }

        //it is an extra row for the desk
        makeLine();
    }

    /*
    *this method doing desk while Karel looking to the West or East,
    * and front is clear
     */
    private void makeLine() throws Exception {
        while (frontIsClear()) {
            move();
            putBeeper();
            move();
        }
    }
    /*
    *This method helps Karel to move to the next line
     */
    private void moveToTheNextLine() throws Exception {
        if (facingEast()) {
            turnLeft();
            if (frontIsClear()){
                move();
                putBeeper();
                turnLeft();
                move();
            }
        } else {
            turnRight();
            if (frontIsClear()){
                move();
                putBeeper();
                turnRight();
                move();
            }
        }
    }


    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}