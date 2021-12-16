package JustJava;

import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        float[][] numbers = new float[3][3];
        float[][] sole = new float[3][3];
        float[] soleX = new float[3];

        Scanner in = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("1. Something with matrix?");
        System.out.println("2. Something with sole(слар)");

        int choose = in.nextInt();

        while (choose != 1 & choose != 2) {
            System.out.println("try again");
            choose = in.nextInt();
        }

        switch (choose) {
            case (1):
                matrix(in, numbers);
                break;
            case (2):
                sole(in, sole, soleX);
                break;
        }
    }

    private static void sole(Scanner in, float[][] sole, float[] soleX) {
        for (int i = 0; i < sole.length; i++) {
            for (int j = 0; j < sole.length; j++) {
                sole[i][j] = 0;
            }
        }

        getSole(sole, in);
        getSoleX(soleX, in);

        System.out.println("╭" + sole[0][0] + "x1    " + sole[0][1] + "x2    " + sole[0][2] + "x3" + " = " + soleX[0]);
        System.out.println("|" + sole[1][0] + "x1    " + sole[1][1] + "x2    " + sole[1][2] + "x3" + " = " + soleX[1]);
        System.out.println("╰" + sole[2][0] + "x1    " + sole[2][1] + "x2    " + sole[2][2] + "x3" + " = " + soleX[2]);

        System.out.println("calculate sole by method Kramera");
//        deltaMatrix(sole);
        System.out.println("Delta of matrix = " + deltaMatrix(sole));
        matrixKamera(sole, soleX);
    }

    private static void matrixKamera(float[][] sole, float[] soleX) {
        /**
         * First delta X
         */
        float firstNumberDeltaFirstX = ((soleX[0] * sole[1][1] * sole[2][2]) +
                (sole[0][1] * sole[1][2] * soleX[2]) + (sole[0][2] * soleX[1] * sole[2][1]));

        float secondNumberDeltaFirstX = (sole[0][1] * soleX[1] * sole[2][2]) +
                (soleX[0] * sole[1][2] * sole[2][1]) + (sole[0][2] * sole[1][1] * soleX[2]);

        float deltaFistX = (firstNumberDeltaFirstX) - (secondNumberDeltaFirstX);
        System.out.println("Delta of first X = " + deltaFistX);
        /**
         *  Second delta X
         */
        float firstNumberDeltaSecondX = ((sole[0][0] * soleX[1] * sole[2][2]) +
                (soleX[0] * sole[1][2] * sole[2][0]) + (sole[0][2] * sole[1][0] * soleX[2]));

        float secondNumberDeltaSecondX = (soleX[1] * sole[0][2] * sole[2][0]) +
                (sole[0][0] * sole[1][2] * soleX[2]) + (sole[2][2] * soleX[0] * sole[1][0]);

        float deltaSecondX = (firstNumberDeltaSecondX) - (secondNumberDeltaSecondX);
        System.out.println("Delta of Second X = " + deltaSecondX);
        /**
         * Third delta X
         */
        float firstNumberDeltaThirdX = ((sole[0][0] * sole[1][1] * soleX[2]) +
                (sole[0][1] * soleX[1] * sole[2][0]) + (soleX[0] * sole[1][0] * sole[2][1]));

        float secondNumberDeltaThirdX = (sole[1][1] * soleX[0] * sole[2][0]) +
                (sole[0][0] * soleX[1] * sole[2][1]) + (soleX[2] * sole[0][1] * sole[1][0]);
        float deltaThirdX = (firstNumberDeltaThirdX) - (secondNumberDeltaThirdX);
        System.out.println("Delta of third X = " + deltaThirdX);
        /**
         *
         *
         */
        float firstX = deltaFistX / deltaMatrix(sole);
        float secondX = deltaSecondX / deltaMatrix(sole);
        float thirdX = deltaThirdX / deltaMatrix(sole);
        System.out.println("First X = " + firstX + "\nSecond X = " + secondX + "\nThird X = " + thirdX);
    }

    private static float[] getSoleX(float[] soleX, Scanner in) {
        for (int i = 0; i < soleX.length; i++) {
            int coefficient = i + 1;
            System.out.println("Input a x" + coefficient + ": ");
            float x = in.nextFloat();
            soleX[i] = x;
        }
        return soleX;
    }

    private static float[][] getSole(float[][] sole, Scanner in) {
        for (int i = 0; i < sole.length; i++) {
            for (int j = 0; j < sole.length; j++) {
                int firstCoefficient = i + 1;
                int secondCoefficient = j + 1;
                System.out.print("Input a x" + firstCoefficient + secondCoefficient + ": ");
                float x = in.nextFloat();
                sole[i][j] = x;
                /**
                 * text in console will be more
                 */

            }
        }
        /**
         * it is a short variant
         */
        System.out.println("╭" + sole[0][0] + "x1    " + sole[0][1] + "x2    " + sole[0][2] + "x3");
        System.out.println("|" + sole[1][0] + "x1    " + sole[1][1] + "x2    " + sole[1][2] + "x3");
        System.out.println("╰" + sole[2][0] + "x1    " + sole[2][1] + "x2    " + sole[2][2] + "x3");
        return sole;
    }

    private static float[][] matrix(Scanner in, float[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = 0;
            }
        }

        getMatrix(numbers, in);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("1. delta matrix");
        System.out.println("2. inverted matrix");
        System.out.println("what do u want to do with a matrix?");

        int doing = in.nextInt();
        switch (doing) {
            case (1):
                deltaMatrix(numbers);
                break;
            case (2):
                invertedMatrix(numbers);
                break;
        }
        return numbers;
    }

    private static void invertedMatrix(float[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i + j) % 2 == 0) {

                }
            }
        }
    }

    private static float[][] getMatrix(float[][] numbers, Scanner in) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int firstCoefficient = i + 1;
                int secondCoefficient = j + 1;
                System.out.print("Input a x" + firstCoefficient + secondCoefficient + ": ");
                float x = in.nextFloat();
                numbers[i][j] = x;

                System.out.println("╭" + numbers[0][0] + "    " + numbers[0][1] + "    " + numbers[0][2]);
                System.out.println("|" + numbers[1][0] + "    " + numbers[1][1] + "    " + numbers[1][2]);
                System.out.println("╰" + numbers[2][0] + "    " + numbers[2][1] + "    " + numbers[2][2]);

            }
        }
        return numbers;
    }

    private static float deltaMatrix(float[][] numbers) {
        float firstNumber = (numbers[0][0] * numbers[1][1] * numbers[2][2]) +
                (numbers[0][1] * numbers[1][2] * numbers[2][0]) + (numbers[0][2] * numbers[1][0] * numbers[2][1]);
        float secondNumber = (numbers[0][1] * numbers[1][0] * numbers[2][2]) +
                (numbers[0][0] * numbers[1][2] * numbers[2][1]) + (numbers[0][2] * numbers[1][1] * numbers[2][0]);
        float delta = firstNumber - secondNumber;
        return delta;
    }
}