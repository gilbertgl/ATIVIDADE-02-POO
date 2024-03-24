import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa soma dois números inteiros.\n");
                System.out.println("Digite o primeiro número:");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo número:");
                int num2 = scanner.nextInt();

                System.out.println("O resultado é: " + (num1 + num2) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
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
