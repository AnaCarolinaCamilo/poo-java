import java.util.Scanner;
public class Formigas {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int n = sc.nextInt();
    sc.close();
    String formiga = "formigas ";
    
    for(int i = 1; i < n+1; i++){
        if( i == 1){
            System.out.println(i + " formiga marcha");
        }
        else{
            String repeated = formiga.repeat(i);
           System.out.println(i + " " + repeated + "marcham");
        }

    }
}

}
