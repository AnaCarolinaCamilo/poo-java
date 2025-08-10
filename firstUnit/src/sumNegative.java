import java.util.Scanner;

public class sumNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        while (true) {
            num = sc.nextInt();
            if (num < 0) break;
            sum += num ;
        }
        System.out.println("Soma dos números: " + sum);
        sc.close();
    }

}
