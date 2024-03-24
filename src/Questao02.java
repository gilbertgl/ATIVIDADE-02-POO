import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa multiplica dois números.\n");
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();

                System.out.println("O resultado é: " + (num1 * num2) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar multiplicar os números.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
