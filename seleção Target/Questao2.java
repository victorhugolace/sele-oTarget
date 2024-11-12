
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int x = 0, y = 1;

        boolean pertence = false;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {

            while (y <= numero) {
                if (y == numero) {
                    pertence = true;
                    break;
                }

                int provisorio = y;
                y = x + y;
                x = provisorio;
            }
        }
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
