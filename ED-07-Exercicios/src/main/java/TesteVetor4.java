import java.util.Scanner;

public class TesteVetor4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

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
    }
}
