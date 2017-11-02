package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;
        double area;

        // input validation
        do {
            System.out.println("Enter the raidus of the circle:");
            radius = in.nextDouble();

            if (radius < 0) {
                System.out.println("Error: radius cannot be negative.");
            } else {
                area = Math.PI * Math.pow(radius, 2);
                System.out.println("The area of a circle with radius " + radius + " is: " + area);
            }
        } while (radius < 0);
    }
}
