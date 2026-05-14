package oop;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do{
            showMenu();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(option != 5);

        System.out.println("Exiting app...");
        scanner.close();
    }
    public static void showMenu(){
        System.out.println("1. Add a book ");
        System.out.println("2. List books ");
        System.out.println("3. Search a book ");
        System.out.println("4. Delete a book ");
        System.out.println("5. Exit ");
    }
}
