public class MedicoCirurgiao extends Medico{
    Integer qtdCirurgia;
    Double valorCirurgia;
    Double valorAplicacaoAnestesia;

    public MedicoCirurgiao(Integer crm, String nome, Integer qtdCirurgia, Double valorCirurgia, Double valorAplicacaoAnestesia) {
        super(crm, nome);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    public Integer getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(Integer qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    public void setValorAplicacaoAnestesia(Double valorAplicacaoAnestesia) {
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    @Override
    public Double getValorBonus() {
        return ((qtdCirurgia * (valorCirurgia + valorAplicacaoAnestesia)) * 15) / 100;
    }

    @Override
    public String toString() {
        return "MedicoCirurgiao{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                ", qtdCirurgia=" + qtdCirurgia +
                ", valorCirurgia=" + valorCirurgia +
                ", valorAplicacaoAnestesia=" + valorAplicacaoAnestesia +
                ", valorBonus=" + getValorBonus() + '}';
    }
}
