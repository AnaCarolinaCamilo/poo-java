import java.util.Scanner;
public class Identidade {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insira em uma linha nome,sobrenome,idade nesse formato");
    String dados = sc.nextLine();
    sc.close();
    System.out.println(exibirDados(dados));


}
public static String exibirDados(String linha){
    String[] arr = linha.split(",");
    return "Nome: " + arr[0] + "\n" + "Sobrenome: " + arr[1] + "\n" + "Idade: " + arr[2];

}
}
