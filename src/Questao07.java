import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa mostra o perímetro e a área do retangulo.\n");
                System.out.println("Digite a altura:");
                double altura = scanner.nextDouble();
                System.out.println("Digite o comprimento:");
                double comprimento = scanner.nextDouble();

                System.out.println(
                        "O perímetro é " + (altura + comprimento) + " e a área é " + (altura * comprimento) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar calcular.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
