import java.util.Scanner;
public class parEimpar {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int par = 0, impar = 0;
    System.out.println("Digite 10 números inteiros: ");
    for (int i = 1; i <= 10; i++) {
        System.out.println("Digite número " + i + ":");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                par++;
            }
            else impar++;
        }
        else {
            System.out.println("Número inválido, tente inserir um número inteiro.");
            sc.next();
            i--;
        }
    }
    sc.close();
    System.out.println("Quantidade de números ímpares: " + impar);
    System.out.println("Quantidade de números pares: " + par);

 }
}
