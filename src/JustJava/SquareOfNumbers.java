package JustJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        Float a = sc.nextFloat();

        System.out.print("Enter b = ");
        Float b = sc.nextFloat();

        System.out.print("Enter c = ");
        Float c = sc.nextFloat();

        if (a > 0){
            a = a * a;
        }
        if (b > 0){
            b = b * b;
        }
        if (c > 0){
            c = c * c;
        }
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
    }
}
