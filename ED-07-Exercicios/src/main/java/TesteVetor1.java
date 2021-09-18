import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Por favor digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        // equivalente a --> Arrays.stream(vetor).average().getAsDouble()
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media = media / vetor.length;

        System.out.println(String.format("A média é: %.2f", media));
        for (int numero : vetor) {
            if (numero > media) {
                System.out.println("Esse número está acima da média: " + numero);
            }
        }
    }
}
