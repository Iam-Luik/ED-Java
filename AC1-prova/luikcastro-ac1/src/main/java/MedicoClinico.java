public class MedicoClinico extends Medico{
    Integer qtdConsulta;
    Double valorConsulta;

    public MedicoClinico(Integer crm, String nome, Integer qtdConsulta, Double valorConsulta) {
        super(crm, nome);
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(Integer qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public Double getValorBonus() {
        return ((qtdConsulta * valorConsulta) * 10) / 100;
    }

    @Override
    public String toString() {
        return "MedicoClinico{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                ", qtdConsulta=" + qtdConsulta +
                ", valorConsulta=" + valorConsulta +
                ", valorBonus" + getValorBonus() + '}';
    }
}
