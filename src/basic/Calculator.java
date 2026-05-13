package basic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int option = 0;
        double firstNumber;
        double secondNumber;
        double result;

        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the first number:");
                    firstNumber = scanner.nextDouble();

                    System.out.println("Enter the second number:");
                    secondNumber = scanner.nextDouble();

                    result = firstNumber + secondNumber;
                    System.out.println("The result is: " + result);
                    break;

                case 2:
                    System.out.println("Enter the first number:");
                    firstNumber = scanner.nextDouble();

                    System.out.println("Enter the second number:");
                    secondNumber = scanner.nextDouble();

                    result = firstNumber - secondNumber;
                    System.out.println("The result is: " + result);
                    break;

                case 3:
                    System.out.println("Enter the first number:");
                    firstNumber = scanner.nextDouble();

                    System.out.println("Enter the second number:");
                    secondNumber = scanner.nextDouble();

                    result = firstNumber * secondNumber;
                    System.out.println("The result is: " + result);
                    break;

                case 4:
                    System.out.println("Enter the first number:");
                    firstNumber = scanner.nextDouble();

                    System.out.println("Enter the second number:");
                    secondNumber = scanner.nextDouble();

                    if (secondNumber == 0) {
                        System.out.println("Error: cannot divide by zero");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("The result is: " + result);
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 5);

        System.out.println("Exiting calculator...");
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }
}