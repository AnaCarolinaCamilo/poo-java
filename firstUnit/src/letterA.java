import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class letterA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringArray = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            System.out.println("Digite a palavra " + i + ":");
            String line = sc.nextLine();
            stringArray.add(line);
        }
        sc.close();
        for (String s : stringArray) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    count++;
                }
            }
                 System.out.println( "Palavra: " + s + "- 'a' aparece " + count + "vezes");
            
            }
        }
}           

    

