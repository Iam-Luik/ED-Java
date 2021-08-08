package aluno;

public class Executavel {
    public static void main(String[] args) {
        AlunoFundamental aluno1 = new AlunoFundamental(1, "João", 8.2, 5.2, 6.4, 4.4);
        System.out.println(aluno1);

        AlunoGraduacao aluno2 = new AlunoGraduacao(2, "Matheus", 8.2, 7.4);
        System.out.println(aluno2);

        AlunoPos aluno3 = new AlunoPos(3, "José", 10.0, 10.0, 10.0);
        System.out.println(aluno3);

        Escola escola1 = new Escola("Bandtec");

        escola1.adicionarAluno(aluno1);
        escola1.adicionarAluno(aluno2);
        escola1.adicionarAluno(aluno3);

        escola1.exibeTodos();
        escola1.exibeAlunoGraduacao();
        escola1.exibeAprovados();
        escola1.buscaAluno(3);
    }
}
