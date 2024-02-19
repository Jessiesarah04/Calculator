import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Hardcoded values for demonstration
        double num1 = 10;
        double num2 = 5;

        // Operation selection
        char operation = '+';

        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result of addition: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result of subtraction: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result of multiplication: " + num1 + " * " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
