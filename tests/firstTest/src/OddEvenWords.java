import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OddEvenWords {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.close();
    List<String> arrayString = new ArrayList<>();
    List<String> arrayPar = new ArrayList<>();
    List<String> arrayImpar = new ArrayList<>();

    for(int i = 1; i < 11; i++){
        System.out.println("Digite a palavra " + i + ":");
        String line = sc.nextLine();
        arrayString.add(line);
    }
    for(int i = 0; i < 10; i++){
        if (arrayString.get(i).length() % 2 == 0) {
            arrayPar.add(arrayString.get(i));
        }
        else arrayImpar.add(arrayString.get(i));
    }
    String palavrasP = palavrasPares(arrayPar);
    String palavrasI = palavrasImpares(arrayImpar);
    System.out.println(palavrasP);
    System.out.println(palavrasI);
    

}
public static String palavrasPares(List<String> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Palavra par: " + arr.get(i) + " Tamanho: " + arr.get(i).length() + "\n");
        }
        return " Total de palavras pares: "  + arr.size();
}
public static String palavrasImpares(List<String> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Palavra impar: " + arr.get(i) + " Tamanho: " + arr.get(i).length() + "\n");
        }
        return " Total de palavras ímpares: "  + arr.size();
}
}

