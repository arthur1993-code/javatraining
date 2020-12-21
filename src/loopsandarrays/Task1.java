package loopsandarrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        do {

            double fahrenheit;
            double celsius;
            Scanner x = new Scanner(System.in);
            System.out.print("Input a degree in Fahrenheit: ");
            fahrenheit = x.nextDouble();
            celsius = (fahrenheit - 32) * (0.5556);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree in Celsius.");
        } while (true);

    }
}


