import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[7];

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

        System.out.println("------------------------------------------");

        String[] vetorString = new String[10];
        boolean validador = false;
        String nomePesquisado;

        System.out.println("Digite 10 nomes: ");
        for (int i = 0; i < vetorString.length; i++){
            vetorString[i] = leitor.next();
        }

        System.out.print("Digite um nome para procurar: ");
        nomePesquisado = leitor.next();
        System.out.println("nome pesquisado é: " + nomePesquisado);

        for (int i = vetorString.length -1; i >= 0; i--){
            if (vetorString[i].equals(nomePesquisado)){
                validador = true;
                System.out.println(String.format("Nome encontrado no índice: [%d]", i));
            }
        }
        if (validador == false){
            System.out.println("Nome não encontrado");
        }
    }
}
