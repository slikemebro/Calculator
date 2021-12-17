package com.shpp.hlebkorobov.cs;

import com.shpp.karel.KarelTheRobot;

public class Gleb extends KarelTheRobot {


    public void run() throws Exception {
        int i = 0;
        int j = 0;


        while (frontIsClear()){
            move();
            i++;
        }
        turnLeft();
        while (frontIsClear()){
            move();
            j++;
        }
        turnLeft();
        for (int g = ( j / 2 ) ; g < j; g++){

            clearDeskFromRightLeft();
            turnLeft();
            clearDeskFromLeftToRight();
            turnRight();
        }

        turnRight();
        for (int g = ( j / 2 ); g < j; g++) {
            paintDeskFromRightToLeft();

            paintDeskFromLeftToRight();
        }



    }

    private void paintDeskFromLeftToRight() throws Exception {
        turnRight();
        while (frontIsClear()){
            move();
            putBeeper();
            if (frontIsClear()) {
                move();
            }
        }
        turnLeft();
        if (frontIsClear()){
            move();
        }
    }

    private void paintDeskFromRightToLeft() throws Exception {
        turnLeft();
        while (frontIsClear()){
            move();
            putBeeper();
            if (frontIsClear()) {
                move();
            }
        }
        turnRight();
        if (frontIsClear()){
        move();
        }
    }

    private void clearDeskFromLeftToRight() throws Exception {
        while (frontIsClear()) {
            if (beepersPresent()) {
                while (beepersPresent()) {
                    pickBeeper();
                }
                move();
            }
            move();
        }
        if (beepersPresent()) {
            while (beepersPresent()) {
                pickBeeper();
            }
            move();
        }

        turnRight();
        if (frontIsClear()){
            move();
        }

    }

    private void clearDeskFromRightLeft() throws Exception {
        while (frontIsClear()) {
            if (beepersPresent()) {
                while (beepersPresent()) {
                    pickBeeper();
                }
                move();
            }
            move();

        }
        if (beepersPresent()) {
            while (beepersPresent()) {
                pickBeeper();
            }

        }
        turnLeft();
        if (frontIsClear()){
            move();
        }
    }





    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }






}
