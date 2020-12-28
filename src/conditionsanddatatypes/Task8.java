package conditionsanddatatypes;
//
import javax.swing.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        do {

            float x;
            Scanner i = new Scanner(System.in);
            System.out.print("Input a number: ");
            x = i.nextFloat();
            if (x == 0)
                System.out.println("zero");
            else if (x > 1 && x <= 1000000)
                System.out.println("positive");
            else if (x > 0 && x < 1)
                System.out.println("small");
            else if (x < 0)
                System.out.println("negative");
            else if (x > 1000000)
                System.out.println("large");
        } while (true);

    }
}
