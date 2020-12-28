package loopsandarrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double i;
        double sum = 0;
        double mean;

        double[] arr = new double[10];

        Scanner x = new Scanner(System.in);
        System.out.println("enter 10 numbers with float points");
        for (i = 0; i < 10; i++) {
            arr[(int) i] = x.nextDouble();
            sum = sum + arr[(int) i];

        }
        mean = sum / 10;
        System.out.println("Arithmetic mean of numbers is " + mean);

    }
}
