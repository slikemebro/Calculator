package com.shpp.p2p.cs.hkorobov.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * this program brings numbers to the power
 */

public class Assignment3Part3 extends TextProgram {
    public void run(){
        /**
         * put number from console
         */
        double base = readDouble("give me base number =");
        /**
         * take degree from console
         */
        int exponent = readInt("give me exponent number =");
        raiseToPower(base, exponent);
    }

    private void raiseToPower(double base, int exponent) {
        /**
         * if degree is zero answer always will be 1
         */
        if (exponent == 0) {
            System.out.println(base + "^" + exponent + " = 1");
            return;
        }if (exponent > 0){
            double extraBase = base;
            System.out.print(base + "^" + exponent + " = ");

            for (int i = 1; i < exponent; i++){
                base *= extraBase;
            }

            System.out.println(base);
            return;
        }if (exponent < 0){
            /**
             * when degree is positive programme makes reverse it divides 1 on number,
             * and degree multiply on -1.
             * after makes as always
             */
            System.out.print(base + "^" + "(" + exponent + ")" + " = ");
            double newBase = 1 / base;
            double extraBase = newBase;
            exponent = exponent / (-1);

            for (int i = 1; i < exponent; i++){
                newBase *= extraBase;
            }

            System.out.println(newBase);
            return;
        }
    }
}
