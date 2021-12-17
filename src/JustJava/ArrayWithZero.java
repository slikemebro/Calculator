package JustJava;

import java.util.Scanner;

public class ArrayWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of a square Array ");
        int n = sc.nextInt();

        int[][] array = new int[n][n];
        int c = n - 1;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < array.length; i++){
            array[i][i] = 0;
        }
        for (int i = 0; i < array.length; i++){
            array[i][c] = 0;
            c--;
        }

        for (int a = 0; a < array.length; a++){
            for (int b = 0; b < array.length; b++){
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
    }
}
