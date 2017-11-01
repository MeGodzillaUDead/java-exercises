package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner in;
        double width;
        double height;
        double area;

        in = new Scanner(System.in);

        System.out.println("Enter the rectangle's width:");
        width = in.nextDouble();
        System.out.println("Enter the rectangle's height:");
        height = in.nextDouble();

        area = width * height;
        System.out.println("The rectangnle's area is " + area + ".");
    }
}
