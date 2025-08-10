import java.util.Scanner;

public class primeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um limite para os números: ");
        int lim = sc.nextInt();
        sc.close();
        int count = 0;
        
        for(int i = 0; i <= lim; i++){
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Total de números primos: " + count);
        }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
    }


