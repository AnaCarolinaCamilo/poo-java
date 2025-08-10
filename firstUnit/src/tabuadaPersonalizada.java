import java.util.Scanner;
public class tabuadaPersonalizada {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digita um número inteiro: ");
    int num = sc.nextInt();
    sc.close();
    System.out.println("Tabuada Personalizada de " + num);
    for (int i = 1; i <= 10; i++) {
       System.out.println( num + "x" + i + "= 10" + (num*i));

    }
}
}
