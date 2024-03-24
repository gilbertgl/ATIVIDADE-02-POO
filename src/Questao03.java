import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao03 {

    public static double MediaSimples(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa calcula a média aritmética de três números.\n");
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();
                System.out.println("Digite o terceiro número:");
                double num3 = scanner.nextDouble();

                double media = MediaSimples(num1, num2, num3);
                System.out.println("O resultado é: " + String.format("%.2f", media) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao calcular a média dos números.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
