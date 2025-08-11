import java.util.Scanner;
public class Senha {
    public static boolean VerificarSenha(String senha){
        String senhaCorreta = "Java123";
        Boolean verification = senhaCorreta.equalsIgnoreCase(senha);
        return verification;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        sc.close();
        Boolean verification = VerificarSenha(senha);
        if ( verification == true) {
            System.out.println("Acesso permitido");
        }
        else{
            System.out.println("Acesso negado");
        }
    }

}
