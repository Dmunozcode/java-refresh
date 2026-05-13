package basic;
import java.util.Scanner;


public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Introduce el numero: ");
        num = scanner.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }

        }
        return true;

    }
}
