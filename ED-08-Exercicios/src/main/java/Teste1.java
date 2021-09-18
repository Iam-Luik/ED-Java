import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] T1 = new String[3];
        String[] T2 = new String[3];

        int posicao1 = 0;
        int posicao2 = 0;

        String nome;
        String turma;

        for (int i = 0; i < T1.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome = leitor.next();
            System.out.print("Digite a turma do aluno: ");
            turma = leitor.next();
            if (turma.equals("T1"))
                T1[posicao1++] = nome;
            else if (turma.equals("T2"))
                T2[posicao2++] = nome;
            else {
                System.out.println("Turma inválida");
                i -= 1;
            }
        }

        if (posicao1 < 1)
            System.out.println("Não foi adicionado nenhum aluno na turma 1");
        else {
            System.out.println("Alunos da turma 1!");
            for (int i = 0; i < posicao1; i++)
                System.out.println(T1[i]);
        }

        if (posicao2 < 1)
            System.out.println("Não foi adicionado nenhum aluno na turma 2");
        else {
            System.out.println("Alunos da turma 2!");
            for (int i = 0; i < posicao2; i++)
                System.out.println(T2[i]);
        }

        System.out.println(String.format("Valor total da Turma 1: %d", posicao1));
        System.out.println(String.format("Valor total da Turma 2: %d", posicao2));
    }
}
