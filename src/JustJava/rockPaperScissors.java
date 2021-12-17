package JustJava;

import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] variant = new String[3];
        variant[0] = "Rock";
        variant[1] = "Paper";
        variant[2] = "Scissors";

        int gamerChoose = 0;
        int ioScore = 0;
        int humanScore = 0;
        int drawScore = 0;

        while (gamerChoose != 4) {

            System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Stop");
            System.out.print("Choose your variant: ");

            gamerChoose = sc.nextInt();
            System.out.println();

            while (gamerChoose < 1 | gamerChoose > 4) {
                System.out.println("try again");
                gamerChoose = sc.nextInt();
            }

            int ioChoose = ioVariant();

            if (ioChoose == 0 & gamerChoose == 1) {
                System.out.println("DRAW");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                drawScore++;
            } else if (ioChoose == 1 & gamerChoose == 2) {
                System.out.println("DRAW");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                drawScore++;
            } else if (ioChoose == 2 & gamerChoose == 3) {
                System.out.println("DRAW");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                drawScore++;
            } else if (ioChoose == 0 & gamerChoose == 2) {
                System.out.println("HUMAN WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                humanScore++;
            } else if (ioChoose == 0 & gamerChoose == 3) {
                System.out.println("IO WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                ioScore++;
            } else if (ioChoose == 1 & gamerChoose == 1) {
                System.out.println("IO WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                ioScore++;
            } else if (ioChoose == 1 & gamerChoose == 3) {
                System.out.println("HUMAN WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                humanScore++;
            } else if (ioChoose == 2 & gamerChoose == 1) {
                System.out.println("IO WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                ioScore++;
            } else if (ioChoose == 2 & gamerChoose == 2) {
                System.out.println("HUMAN WINNER");
                System.out.println("Your variant is " + variant[gamerChoose - 1]);
                System.out.println("Io variant is " + variant[ioChoose]);
                humanScore++;
            }
            System.out.println();
        }
        System.out.println("Thank you for playing my game, I will wait your come back)");
        System.out.println("Human score = " + humanScore);
        System.out.println("Io score = " + ioScore);
        System.out.println("Draw Score = " + drawScore);
    }

    private static int ioVariant() {
        int ioChoose = (int) (Math.random() * 3);

        return ioChoose;
    }
}