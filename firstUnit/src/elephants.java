import java.util.Scanner;

public class elephants {
    public static void main(String[] args) {
     String elefantes = "elefantes ";
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.close();
     for(int i = n; i > 0; i--){
        String repeated = elefantes.repeat(i);
        if(i == 1){
            System.out.println("1 elefante incomoda");
        }
        else System.out.println( i + " " + repeated + " " + "incomodam");

     }
        
    }

}
