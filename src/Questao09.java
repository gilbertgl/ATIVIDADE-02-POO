import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa converte Celsius para Fahrenheit.\n");
                System.out.println("Digite o valor em Celsius:");
                double valorEmCelsius = scanner.nextDouble();

                System.out.println(
                        "O resultado em Fahrenheit é: " + String.format("%.2f", (((9 * valorEmCelsius) + 160) / 5)));

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar converter.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
