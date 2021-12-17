package com.shpp.p2p.cs.hkorobov.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * It is a gambling, when first player put 1$ on the table, and second throw a coin. If drop heads first player put double.
 * If  tails second player take all money on the table. Game will finish when second player will have 20$ or more.
 */

public class Assignment3Part5 extends TextProgram {

    public void run(){
        /**
         * prize it is all money second player
         */
        int prize = 0;
        /**
         * games it is how much game would have second player to win 20$ or more
         */
        int games = 0;
        while (prize < 20){
            /**
             * firstPlayer it is bid of first player
             */
            int firstPlayer = 1;
            /**
             * Math.random it throws a coin
             */
            int coin = (int) (Math.random() * 2);
            games++;
            while (coin == 1){
                firstPlayer *= 2;
                coin = (int) (Math.random() * 2);
            }
            System.out.println("This game, you earned $" + firstPlayer);
            prize += firstPlayer;
            System.out.println("Your total is $" + prize);
        }
        /**
         * Shows total games
         */
        System.out.println("It took " + games + " games to earn $" + prize);

    }
}
