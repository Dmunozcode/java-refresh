package basic;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int option = 0;
        double num1;
        double num2;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        do{
            showMenu();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Introduzca el primer numero");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduzca el segundo numero");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("El resultado es " + resultado);
                  break;
                case 2:
                    System.out.println("Introduzca el primer numero");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduzca el segundo numero");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("El resultado es " + resultado);
                    break;
                case 3:
                    System.out.println("Introduzca el primer numero");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduzca el segundo numero");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("El resultado es " + resultado);
                    break;
                case 4:
                    System.out.println("Introduzca el primer numero");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduzca el segundo numero");
                    num2 = scanner.nextDouble();
                    resultado = num1 / num2;
                    System.out.println("El resultado es " + resultado);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        }while(option != 5);
        System.out.println("Saliendo de la calculadora...");
    }
    public static void showMenu(){
        System.out.println("1. Sumar: ");
        System.out.println("2. Restar: ");
        System.out.println("3. Multiplicar: ");
        System.out.println("4. Dividir: ");
        System.out.println("5. Salir: ");
    }
}
