import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] numeros3 = new int[10];

        int posicao1 = 0;
        int posicao2 = 0;
        int posicao3 = 0;

        System.out.println("Digite os números do primeiro array: ");
        for (int i = 0; i < vetor1.length; i++){
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("Digite os números do segundo array: ");
        for (int i = 0; i < vetor2.length; i++){
            vetor2[i] = leitor.nextInt();
        }

        // método reutilizável estático
        ordenarCrescente(vetor1);
        ordenarCrescente(vetor2);

        System.out.println("Vetor 1 em ordem crescente: ");
        for (int i = 0; i < vetor1.length; i++){
            System.out.println(vetor1[i]);
        }

        System.out.println("Vetor 2 em ordem crescente: ");
        for (int i = 0; i < vetor2.length; i++){
            System.out.println(vetor2[i]);
        }

        // verifica indíces de 2 vetores diferente e atribui ao terceiro vetor o menor valor
        while (posicao1 < vetor1.length && posicao2 < vetor2.length){
            if (vetor1[posicao1] < vetor2[posicao2]){
                numeros3[posicao3++] = vetor1[posicao1++];

            }
            else {
                numeros3[posicao3++] = vetor2[posicao2++];
            }
        }

        //verifica se existe sobra no vetor 1 pela posição 1
        while (posicao1 < vetor2.length){
            numeros3[posicao3++] = vetor1[posicao1++];
        }

        //verifica se existe sobra no vetor 2 pela posição 2
        while (posicao2 < vetor2.length){
            numeros3[posicao3++] = vetor2[posicao2++];
        }

        System.out.println("Vetor 3 em ordem crescente: ");
        for (int i = 0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }
    }

    public static int[] ordenarCrescente(int[] numeros){
        // ordenar por ordem crescente sem utilizar o Arrays.sort(numeros1);
        // Este tipo de ordenação é feita através das posições
        // Se a posição J for menor que a posição C, é realizada uma troca de posições
        // ---> { 15, 8, 5, 6 }
        // ---> { 8, 15, 5, 6 }
        // ---> { 8, 5, 15, 6 }
        // ---> { 8, 5, 6, 15 }
        // ---> { 5, 8, 6, 15 }
        // ---> { 5, 6, 8, 15 }
        // Reparar na mudança de posições do 15 e do 8
        int[] vetor = numeros;
        int aux;

        for(int j = 0; j <= vetor.length - 1; j++)
        {
            for(int c = 0; c <= vetor.length - 1; c++)
            {
                if(vetor[j] < vetor[c]){
                    aux = vetor[j];
                    vetor[j] = vetor[c];
                    vetor[c] = aux;
                }
            }
        }
        return vetor;
    }
}
