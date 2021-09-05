import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        int[] vetor = new int[7];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 7 números: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = leitor.nextInt();
        }

        System.out.println();
        System.out.println("Exibindo números em ordem crescente");

        for (int i = 0; i < vetor.length; i++){
            System.out.println(String.format("Vetor[%d] = %d", i, vetor[i]));
        }

        System.out.println();
        System.out.println("Exibindo números em ordem decrescente");
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.println(String.format("Vetor[%d] = %d", i, vetor[i]));
        }
    }
}
