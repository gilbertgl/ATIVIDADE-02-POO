import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";

        do {
            try {
                System.out.println("Esse programa soma dois números inteiros.\n");
                System.out.println("Digite o seu nome:");
                String nome = scanner.nextLine();
                System.out.println("Digite o seu endereco:");
                String endereco = scanner.nextLine();
                System.out.println("Digite o seu telefone:");
                String telefone = scanner.nextLine();

                System.out.println("\nOlá " + nome + " o seu telefone é " + telefone + " e você mora no endereço "
                        + endereco + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número inteiro. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar somar os números.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
