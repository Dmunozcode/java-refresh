package basic;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        int option = 0;
        double temperature;
        double result;

        Scanner scanner = new Scanner(System.in);

        do {
            showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the temperature:");
                    temperature = scanner.nextDouble();

                    result = celsiusToFahrenheit(temperature);
                    System.out.println("The result is: " + result);
                    break;

                case 2:
                    System.out.println("Enter the temperature:");
                    temperature = scanner.nextDouble();

                    result = fahrenheitToCelsius(temperature);
                    System.out.println("The result is: " + result);
                    break;

                case 3:
                    System.out.println("Enter the temperature:");
                    temperature = scanner.nextDouble();

                    result = celsiusToKelvin(temperature);
                    System.out.println("The result is: " + result);
                    break;

                case 4:
                    System.out.println("Enter the temperature:");
                    temperature = scanner.nextDouble();

                    result = kelvinToCelsius(temperature);
                    System.out.println("The result is: " + result);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 5);

        System.out.println("Exiting program...");
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Exit");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}