package com.shpp.p2p.cs.hkorobov.assignment3;

import com.shpp.cs.a.console.TextProgram;

/**
 * This programme calculates how enough did you do exercise,
 * and write if you did not enough how more you need to do
 */

public class Assignment3Part1 extends TextProgram {
    public void run() {
        // This array simulates weak
        int[] weak = new int[7];
        int days = 1;
        for (int i = 0; i < weak.length; i++) {
            weak[i] = readInt("How many minutes did you do on day " + days + "? ");
            days++;
        }
        cardiovacular(weak);
    }

    /**
     * check did you do enough exercise at weak, if something wrong show how much you should more
     * @param weak - all exercises at week
     */
    private void cardiovacular(int[] weak) {
        calculateCardiovacular(weak);
        calculateBlood(weak);
        System.out.println("Cardiovacular health: ");

        if (calculateCardiovacular(weak) >= 5 & calculateBlood(weak) >= 3) {
            System.out.println("    Great job! You've done enough exercise for cardiovacular health.");
            System.out.println("Blood pressure:");
            System.out.println("    Great job! You've done enough exercise to keep a low blood pressure.");
        } else if (calculateCardiovacular(weak) < 5 & calculateBlood(weak) >= 3) {
            int leastDay = 5 - calculateCardiovacular(weak);
            System.out.println("    You needed to train hard for at least " + leastDay + " more day(s) a week!");
            System.out.println("Blood pressure:");
            System.out.println("    Great job! You've done enough exercise to keep a low blood pressure.");
        } else if (calculateCardiovacular(weak) >= 5 & calculateBlood(weak) < 3) {
            int leastDay = 3 - calculateBlood(weak);
            System.out.println("    Great job! You've done enough exercise for cardiovacular health.");
            System.out.println("Blood pressure:");
            System.out.println("     You needed to train hard for at least " + leastDay + " more day(s) a week!");
        }
    }

    /**
     *
     * @param weak - all exercises at week
     * @return - how much you did full exercises at weak for blood
     */
    private int calculateBlood(int[] weak) {
        int bloodAloneWeak = 0;
        for (int i = 0; i < weak.length; i++) {
            if (weak[i] >= 40) {
                bloodAloneWeak++;
            }
        }
        return bloodAloneWeak;
    }

    /**
     *
     * @param weak - all exercises at week
     * @return - how much you did full exercises at weak for cardiovacular
     */
    private int calculateCardiovacular(int[] weak) {
        int cardiovacularAloneWeak = 0;
        for (int i = 0; i < weak.length; i++) {
            if (weak[i] >= 30) {
                cardiovacularAloneWeak++;
            }
        }
        return cardiovacularAloneWeak;
    }
}
