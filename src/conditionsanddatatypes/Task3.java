package conditionsanddatatypes;
//The force of gravity on the Moon is equal to ~ 17%. Write a program that by entering your weight will count your weight on the Moon.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        do {

            double moon;
            double earth;
            Scanner x = new Scanner(System.in);
            System.out.print("Input your weight on earth: ");
            earth = x.nextDouble();
            moon = (earth * 16.5) / 100;
            System.out.println("Your weight on moon will be " + moon);
        } while (true);
    }
}