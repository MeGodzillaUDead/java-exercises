package exercises;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double milesDriven;
        double gallonsUsed;
        double milesPerGallon;

        System.out.println("How many miles have you driven?");
        milesDriven = in.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        gallonsUsed = in.nextDouble();

        milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("Your average gas mileage is " + milesPerGallon + " MPG.");
    }
}
