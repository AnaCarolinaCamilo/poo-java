import java.util.Scanner;
public class diasSemana {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7: ");
    int dia = sc.nextInt();
    sc.close();
    if (dia >= 1 && dia <= 7) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        
    }
    else System.out.println("Número inválido");
   }
}
