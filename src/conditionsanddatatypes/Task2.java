package conditionsanddatatypes;
//Write a program that reads a number in inches, converts it to meters.
import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
            do {

                double meter;
                double inch;
                Scanner x = new Scanner(System.in);
                System.out.print("Input a value for inch: ");
                inch = x.nextDouble();
                meter = inch / 39.37;
                System.out.println(inch + " Inch is " + meter + " meters.");
            } while (true);
        }
}

