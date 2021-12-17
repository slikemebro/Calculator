package com.shpp.p2p.cs.hkorobov.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * this programme makes of any positive number 1
 */

public class Assignment3Part2 extends TextProgram {
    public void run(){
        /**
         * take only positive number
         */
        int number = readInt("Give me your positive number = ");

        if(checkNumber(number)) {
            if (numberIsOne(number)) System.out.println("end.");
        }

    }
    private boolean checkNumber(int number) {
        if (number < 1) {
            System.out.println(number + " - this number is not positive try again");
            return false;
        }
        else return true;
    }

    private boolean numberIsOne(int number) {
        while (number != 1){
            /**
             * if number is even programme take half of this number
             */
            if ((number % 2) == 0){
                System.out.print(number);
                number = number / 2;
                System.out.println(" - is even so I take half: " + number);
            }else {
                /**
                 * if number is odd programme multiply on 3 this number and plus 1
                 */
                System.out.print(number);
                number = (number * 3) + 1;
                System.out.println(" - is odd so I make 3n + 1: " + number);
            }
        }
        return true;
    }
}
