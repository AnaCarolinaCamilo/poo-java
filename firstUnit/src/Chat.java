import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> queue = new ArrayList<>();

        int msgC = 0;

        while (true) {
            System.out.print("Digite uma mensagem (ou 'sair' para encerrar): ");
            String input = sc.nextLine();

            System.out.println();
            if (input.equals("sair"))
                break;

            queue.add(input);
            if (queue.size() > 5) {
                queue.remove(0);
                msgC = 0;
            }

            for (int i = 0; i < queue.size(); i++) {
                System.out.printf("Mensagem %d: %s\n", i - msgC, queue.get(i));
            }

            msgC++;
        }
    }

}
