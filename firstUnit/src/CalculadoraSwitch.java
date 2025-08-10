import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva dois números decimais separados por um espaço: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
         
        String menu = """  
                Menu de operações:
                1 - adição
                2 - subtração
                3 - multiplicação
                4 - divisão
                """;
        System.out.println(menu);
        double res = 0;
        int opr = sc.nextInt();
        sc.close();
        if (opr <= 4 && opr > 0) {
            
            switch (opr) {
                case 1:
                    res = num1 + num2;
                    break;
                case 2:
                    res = num1 - num2;
                    break;
                case 3:
                    res = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        res = num1 / num2;
                    }
                    else {
                        System.out.println("Divisão inválida");
                        System.exit(0);
                    }
                    break;
            }
            System.out.println("Resultado: " + res);
        }
        else System.out.println("Escolha uma operação válida");
    }
}
