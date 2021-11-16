public class Operacao {
    private ContaBancaria objConta;
    private String tipoOperacao;
    private Double valor;

    public Operacao(String tipoOperacao, Integer conta, Double valor) {
        this.objConta = new ContaBancaria(conta);
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "objConta=" + objConta +
                ", tipoOperacao='" + tipoOperacao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public ContaBancaria getObjConta() {
        return objConta;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public Double getValor() {
        return valor;
    }
}
