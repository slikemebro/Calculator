package JustJava;

import java.util.Scanner;

public class SpeedOfFolling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float high = enterHigh(sc);

        float g = (float) 9.81;

        while (high < 0){
            high = enterHigh(sc);
        }

        float t = (2 * high) / g;
        float time = (float) Math.sqrt(t);
        System.out.println("Time will be = " + time + " sec");
    }

    private static float enterHigh(Scanner sc) {
        System.out.print("Enter a high in meters ");
        float high = sc.nextFloat();
        return high;
    }
}
