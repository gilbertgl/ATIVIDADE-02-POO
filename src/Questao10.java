import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa calcula a distância e a quatidade de combustível gasto.\n");
                System.out.println("Digite o tempo de viagem:");
                double tempo = scanner.nextDouble();
                System.out.println("Digite a velocidade média:");
                double velMedia = scanner.nextDouble();

                double distacia = tempo * velMedia;

                System.out.println("A distância percorrida foi " + String.format("%.2f", distacia) + " km e "
                        + String.format("%.2f", (distacia / 12)) + " litros de combustível foram gastos.");

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
