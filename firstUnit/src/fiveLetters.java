import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fiveLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringArray = new ArrayList<>();
        for(int i = 1; i < 7; i++){
            System.out.println("Digite a palavra " + i + ":");
            String line = sc.nextLine();
            stringArray.add(line);
        }
        sc.close();
        System.out.println(stringArray);
        System.out.println("Palavras com mais de 5 letras: ");
        for (int i = 0; i < 6; i++) {
            if (stringArray.get(i).length() > 5) {
                
                System.out.println(stringArray.get(i));
            }
        }
    }
}
