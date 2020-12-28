package conditionsanddatatypes;
//Write a program which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program shall always print “bye!” before exiting.
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int number = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        number = num.nextInt();
        if(number % 2 == 0){
            System.out.printf("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
        System.out.println("Bye!");


    }
}