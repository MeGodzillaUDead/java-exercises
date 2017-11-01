package exercises;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        // declare a Scanner instance and all that good stuff
        Scanner in;
        String name;

        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();

        System.out.println("Hello, " + name + ".");
    }
}
