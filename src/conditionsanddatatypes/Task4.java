package conditionsanddatatypes;
//Write a program that will prompt you to enter a natural number and print the multiplication table corresponding to the number on the screen.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int a, c;
        {
            Scanner x = new Scanner(System.in);
            System.out.println("please give an integer: ");
            a = x.nextInt();
            System.out.println("\n");
            for (c = 0; c < 10; c++)
                System.out.println(a + " X " + c + " = " + a * c);
        }
    }
}
