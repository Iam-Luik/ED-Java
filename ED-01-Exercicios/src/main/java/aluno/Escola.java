package aluno;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> lista;

    public Escola(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        lista.add(aluno);
    }

    public void exibeTodos() {
        System.out.println("\n---- TODOS OS ALUNOS ----");
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }
        System.out.println("\nFim da lista de Alunos!");
    }

    public void exibeAlunoGraduacao() {
        System.out.println("\n---- ALUNOS GRADUADOS ----");
        for (Aluno aluno : lista) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println(aluno);
            }
        }
        System.out.println("\nFim da lista de alunos graduação!");
    }


    public void exibeAprovados() {
        System.out.println("\n---- ALUNOS APROVADOS ----");
        for (Aluno aluno : lista) {
            if (aluno.calculaMedia() > 6) {
                System.out.println(aluno);
            }
        }
        System.out.println("\nFim da lista de alunos aprovados!");
    }

    public void buscaAluno(Integer ra) {
        Boolean alunoEncontrado = false;
        System.out.println("\n---- ALUNO BUSCADO ----");
        for (Aluno aluno : lista) {
            if (aluno.getRa().equals(ra)) {
                System.out.println(aluno);
                alunoEncontrado = true;
                System.out.println("\nAluno buscado foi exibido com sucesso!");
            }
        }

        if (!alunoEncontrado) {
            System.out.println("Aluno não encontrado!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", lista=" + lista +
                '}';
    }
}
