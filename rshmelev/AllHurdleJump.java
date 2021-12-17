package com.shpp.hlebkorobov.cs;

import com.shpp.karel.KarelTheRobot;

public class AllHurdleJump extends KarelTheRobot {

    /* this is code can use for levels HurdlejumpHigh and HurdleJumpSimple
       I improved the code so that Karl would come back
    */
    public void run() throws Exception {
        //Karl is doing levels to one side
        for (int i = 0; i < 6; i++){
            jumpOverTheHurdle();
        }

        //Karl is getting ready to go back
        turnLeft();
        turnLeft();
        move();

        //Karl come back
        for (int i = 0; i < 6; i++){
            jumpOverTheHurdleReverse();
        }
    }
    private void jumpOverTheHurdleReverse() throws Exception {
        turnRight();
        while(leftIsBlocked()){
            move();
        }
        turnLeft();
        move();
        move();
        turnLeft();
        while (frontIsClear()){
            move();
        }
        turnRight();
        while (frontIsClear()){
            move();
        }

    }

    private void jumpOverTheHurdle() throws Exception {
        turnLeft();
        while(rightIsBlocked()){
            move();
        }
        turnRight();
        move();
        move();
        turnRight();
        while (frontIsClear()){
            move();
        }
        turnLeft();
        while (frontIsClear()){
            move();
        }

    }

    private void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }


}
