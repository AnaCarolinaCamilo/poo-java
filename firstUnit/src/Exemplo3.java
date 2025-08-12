public class Exemplo3{
 public static void main(String[] args) {
 if (true) System.out.println("Ok");
 else System.out.println("Erro");     // codigo que nunca vai ser executado 
                                                                 // colchetes desnecessário
 }
}
// erros semântico (else nunca executado)
// erro sintático (colchete desnecessário)
