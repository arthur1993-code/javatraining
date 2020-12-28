package conditionsanddatatypes;
//Take three numbers from the user and print the greatest number.
import javax.swing.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = x.nextInt();
        System.out.println("Enter second number: ");
        int num2 = x.nextInt();
        System.out.println("enter 3rd number: ");
        int num3 = x.nextInt();
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the greatest.");
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the greatest.");
        else if (num3 > num1 && num3 > num2)
            System.out.println(num3 + " is the greatest.");
        else
            System.out.println("The numbers are equal.");


    }
}
