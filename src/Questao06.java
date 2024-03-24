import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa reajusta o saldo inserido em 2%.\n");
                System.out.println("Digite o saldo:");
                double saldo = scanner.nextDouble();
                System.out.println("O saldo reajustado é: " + String.format("%.2f", (saldo * 1.02)) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar reajusatar o saldo.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
