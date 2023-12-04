package org.launchcode;
import java.util.Scanner;
public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        int milesDriven = input.nextInt();
        System.out.println("How many gallons of gas have you used?: ");
        int gasUsed = input.nextInt();
        int mpg = milesDriven / gasUsed;
        System.out.println("Your miles-per-gallon is " + mpg);
    }
}
