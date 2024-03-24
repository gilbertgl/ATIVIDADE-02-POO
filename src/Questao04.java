import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String sair = "n";
        do {
            try {
                System.out.println("Esse programa mostra o antecessor e o sucesso do número digitado.\n");
                System.out.println("Digite o número:");
                int num = scanner.nextInt();

                System.out.println("O antecessor é " + (num - 1) + " e o sucessor é " + (num + 1) + ".");

                scanner.nextLine();
                System.out.println("Deseja encerar o programa? (y/n)");
                sair = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("\n\nO caractere digitado não é um número inteiro. Tente novamente.\n\n");
            } catch (Exception e) {
                System.out.println("\n\nOcorreu um erro ao tentar mostrar os números.\n\n");
            }
            scanner.nextLine();
        } while (sair.equalsIgnoreCase("n"));

        scanner.close();
    }
}
