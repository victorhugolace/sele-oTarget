
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String normal = scanner.nextLine();

        String inverter = "";

        for (int i = normal.length() - 1; i >= 0; i-- )
        inverter += normal.charAt(i);

        System.out.println("A String Invertida fica assim:" + inverter);
        scanner.close();

    }
}
