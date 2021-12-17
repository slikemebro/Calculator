package com.shpp.p2p.cs.hkorobov.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    /*
    *This program can calculate the discriminant
    * you should give 3 numbers it is a, b and c
    * and program will count x1 and x2
    * but number a couldn't be zero because it won't be discriminant
     */

    public void run() {

        double a, b, c;
        double x1, x2;
        //you enter a,b and c
        a = readDouble("Please enter a = ");
        b = readDouble("Please enter b = ");
        c = readDouble("Please enter c = ");
        //this one show you your discriminant
        println(a + "*(x^2) + " + b + "*x + " + c + " = 0");

        double discriminant = b*b - 4 * a * c;
        //those count would you have one x or two x
        if (discriminant > 0){
            print("There are two roots:");
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            print(" " + x1 + " and " + x2);
        }else
        if (discriminant == 0){
            print("There is one root:");
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            print(" " + x1);
        }
        if (discriminant < 0){
            print("There are no real roots");
        }



    }





}