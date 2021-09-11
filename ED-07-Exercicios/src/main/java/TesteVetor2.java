import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];
        int ocorrencia = 0;
        int valorOcorrencia;

        for (int i = 0; i < 10; i++) {
            System.out.print("Por favor digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.print("Digite um número para pesquisar quantidade de ocorrências: ");
        valorOcorrencia = leitor.nextInt();
        for (int numero : vetor) {
            if (numero == valorOcorrencia) {
                ocorrencia += 1;
            }
        }

        if (ocorrencia > 0) {
            System.out.println(String.format("O número %d ocorre %d vezes.", valorOcorrencia, ocorrencia));
        } else {
            System.out.println(String.format("O número %d não ocorre nenhuma vez", valorOcorrencia));
        }
    }
}
