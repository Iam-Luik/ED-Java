import java.time.LocalDate;

public class Filme {
    private String nome;
    private String genero;
    private String diretor;
    private Double nota;
    private String lancamento;

    public Filme(String nome, String genero, String diretor, Double nota, String lancamento) {
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretor;
        this.nota = nota;
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", diretor='" + diretor + '\'' +
                ", nota=" + nota +
                ", lancamento=" + lancamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }
}
