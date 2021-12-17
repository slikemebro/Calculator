package com.shpp.p2p.cs.hkorobov.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1 extends KarelTheRobot {

    /**
     * Karel should go to beeper pick it and go back
     * @throws Exception
     */
    public void run() throws Exception {

        goToBeeper();

        karlePickBeeper();

        comeBack();

    }

    /**
     * Karel is going to beeper
     * @throws Exception
     */
    private void goToBeeper() throws Exception {
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        move();
    }

    /**
     * Karel pick beeper
     * @throws Exception
     */
    private void karlePickBeeper() throws Exception {
        pickBeeper();
        turnAround();
    }

    /**
     * Karel going back
     * @throws Exception
     */
    private void comeBack() throws Exception {
        move();
        move();
        turnRight();
        move();
        turnLeft();
        move();
        move();

    }

    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }


}
