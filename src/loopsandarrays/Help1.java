package loopsandarrays;

import java.util.Scanner;

public class Help1 {
    static Scanner scanner = new Scanner(System.in);

    public static void checkInputInt() {

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Letters entered, please enter a number");
                scanner.next();
                continue;
            }
            return;
        }
    }

    public static int checkForPositiveInt() {
        while (true) {
            checkInputInt();
            int x = scanner.nextInt();
            if (x < 0) {
                System.out.println("Negative number entered, please try again");
                continue;
            }
            return x;

        }
    }

    public static int CheckForOnlyNumber() {
        while (true) {
            checkInputInt();
            int x = scanner.nextInt();
            if (x != (int) x) {
                System.out.println("Negative number entered, please try again");
                continue;
            }
            return x;

        }
    }

}
