import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];

        int[] numeros3 = new int[10];

        int posicao1 = 0;
        int posicao2 = 0;
        int posicao3 = 0;

        System.out.println("Digite os números do primeiro array: ");
        for (int i = 0; i < numeros1.length; i++){
            numeros1[i] = leitor.nextInt();
        }

        System.out.println("Digite os números do segundo array: ");
        for (int i = 0; i < numeros2.length; i++){
            numeros2[i] = leitor.nextInt();
        }

        Arrays.sort(numeros1);
        Arrays.sort(numeros2);


        System.out.println("Vetor 1 em ordem crescente: ");
        for (int i = 0; i < numeros1.length; i++){
            System.out.println(numeros1[i]);
        }

        System.out.println("Vetor 2 em ordem crescente: ");
        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        while (posicao1 < numeros1.length && posicao2 < numeros2.length){
            if (numeros1[posicao1] < numeros2[posicao2]){
                numeros3[posicao3++] = numeros1[posicao1++];

            }
            else {
                numeros3[posicao3++] = numeros2[posicao2++];
            }
        }

        while (posicao1 < numeros2.length){
            numeros3[posicao3++] = numeros1[posicao1++];
        }

        while (posicao2 < numeros2.length){
            numeros3[posicao3++] = numeros2[posicao2++];
        }

        System.out.println("Vetor 3 em ordem crescente: ");
        for (int i = 0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }






        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int mes;
        int dia;
        int total;

        System.out.print("Digite o dia do mes: ");
        dia = leitor.nextInt();

        System.out.print("Digite no mês do ano: ");
        mes = leitor.nextInt();


        if (mes == 1){
            total = dia;
        } else {
            total = dia;
            for (int i = 0; i < mes -1; i++){
                total += meses[i];
            }

        }

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano", dia, mes, total));


        String[] carros = new String[5];
        int[] rendimentos = new int[5];
        int km = 0;
        int economico = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Por favor digite um modelo de carro: ");
            carros[i] = leitor.next();
            System.out.print("Por favor digite o valor de rendimento: ");
            rendimentos[i] = leitor.nextInt();
        }

       km = Arrays.stream(rendimentos).max().getAsInt();

        for (int i = 0; i < carros.length; i++){
            if (km == rendimentos[i]){
                economico = i;
            }
        }
        System.out.println(String.format("O carro mais êconomico é: %s" , carros[economico]));

        System.out.println("--------------------------------");

        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Por favor digite um número: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println(String.format("A média é: %.2f", Arrays.stream(vetor).average().getAsDouble()));
        for (int numero : vetor) {
            if (numero >= 6) {
                System.out.println("Esse número está na média: " + numero);
            }
        }

        System.out.println("--------------------------------");

        int[] vetor2 = new int[10];
        int ocorrencia = 0;
        int valorOcorrencia;

        for (int i = 0; i < 10; i++) {
            System.out.print("Por favor digite um número: ");
            vetor2[i] = leitor.nextInt();
        }

        System.out.print("Digite um número para pesquisar quantidade de ocorrências: ");
        valorOcorrencia = leitor.nextInt();
        for (int numero : vetor2) {
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
