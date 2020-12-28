package conditionsanddatatypes;

import java.util.Scanner;
//Write a calculator that will suggest entering 2 numbers and 1 math operation; Numbers can be int, double, float. Math operation is a char and can be: (+, -, /, *, etc..)
public class Task5 {
    public static void main(String[] args) {

            double number1;
            double number2;
            double answer = 0.0;
            char operation;

            Scanner x = new Scanner(System.in);
            System.out.print("Input the first number: ");
            number1 = x.nextDouble();
            System.out.print("Input the second number: ");
            number2 = x.nextDouble();
            System.out.print("Input math operation: ");
            operation = x.next().charAt(0);

            switch (operation) {
                case '+' -> answer = number1 + number2;
                case '-' -> answer = number1 - number2;
                case '*' -> answer = number1 * number2;
                case '/' -> answer = number1 / number2;
            }
            int num1 = (int) number1;
            int num2 = (int) number2;
            if (number1 == num1 && number2 == num2) {
                System.out.println(num1 + " " + operation + " " + num2 + " = " + answer);
            }
            else {
                System.out.println(number1 + " " + operation + " " + number2 + " = " + answer);
            }


    }
}
