package basic;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
