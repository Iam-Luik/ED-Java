import java.util.Arrays;
import java.util.Scanner;

public class TesteVetor3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

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
    }
}
