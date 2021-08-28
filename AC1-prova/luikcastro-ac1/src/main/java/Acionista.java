public class Acionista implements Bonificavel{
    String nome;
    Integer qtdAcao;
    Double precoAcao;

    public Acionista(String nome, Integer qtdAcao, Double precoAcao) {
        this.nome = nome;
        this.qtdAcao = qtdAcao;
        this.precoAcao = precoAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAcao() {
        return qtdAcao;
    }

    public void setQtdAcao(Integer qtdAcao) {
        this.qtdAcao = qtdAcao;
    }

    public Double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(Double precoAcao) {
        this.precoAcao = precoAcao;
    }

    @Override
    public Double getValorBonus() {
        return ((qtdAcao * precoAcao) * 25) / 100;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", qtdAcao=" + qtdAcao +
                ", precoAcao=" + precoAcao +
                ", valorBonus="+ getValorBonus() +'}';
    }
}
