import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Por favor digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println(String.format("A média é: %.2f", Arrays.stream(vetor).average().getAsDouble()));
        for (int numero : vetor) {
            if (numero > Arrays.stream(vetor).average().getAsDouble()) {
                System.out.println("Esse número está acima da média: " + numero);
            }
        }
    }
}
