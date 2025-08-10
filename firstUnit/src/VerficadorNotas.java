import java.util.Scanner;
public class VerficadorNotas {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma nota de 0 a 10");

    double nota = sc.nextDouble();
    
    sc.close();

    if (nota >= 0 && nota <= 10){

        if (nota >= 8.5 && nota >= 0.1) {
          System.out.println("Aprovado com mérito");
          if (nota >= 7.1 && nota < 8.5) System.out.println("Aprovado");
          else if (nota < 7.1 && nota >= 5.1) System.out.println("Recuperação");
          else if (nota >= 0.1 && nota <= 3.9) System.out.println("Reprovado");
        }
        else {
        int notaInt = (int) nota;
        switch (notaInt) {
            case 1:
                System.out.println("Reprovado");
                System.exit(0);
                break;
            case 2:
                System.out.println("Reprovado");
                System.exit(0);
                break;
            case 3:
                System.out.println("Reprovado");
                System.exit(0);
                break;
            case 4:
                System.out.println("Reprovado");
                System.exit(0);
                break;
            case 5:
                System.out.println("Recuperação");
                System.exit(0);
                break;
            case 6:
                System.out.println("Recuperação");
                System.exit(0);
                break;
            case 7:
                System.out.println("Aprovado");
                System.exit(0);
                break;
            case 8:
                System.out.println("Aprovado");
                System.exit(0);

                break;
            case 9:
                System.out.println("Aprovado");
                System.exit(0);
                break;
            case 10:
                System.out.println("Aprovado");
                System.exit(0);
                break;
            case 0:
                System.out.println("Reprovado");
                System.exit(0);
                break;
        }
       }
    }
    else System.out.println("Nota inválida");
 }
}
