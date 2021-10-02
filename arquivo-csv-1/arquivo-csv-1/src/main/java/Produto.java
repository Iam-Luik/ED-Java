public class Produto {
    private Integer codProduto;
    private String nome;
    private Double preco;
    private String avaliacao;
    private Integer quantidadeVendida;

    public Produto(Integer codProduto, String nome, Double preco, String avaliacao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.quantidadeVendida = 0;
    }

    public void comprar(int quantidade){
        this.quantidadeVendida += quantidade;
    }

    public double calcularFaturamento(){
        return this.quantidadeVendida * this.preco;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", avaliacao='" + avaliacao + '\'' +
                ", quantidadeVendida=" + quantidadeVendida +
                '}';
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}