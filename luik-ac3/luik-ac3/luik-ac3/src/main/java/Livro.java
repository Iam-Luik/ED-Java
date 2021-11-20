public class Livro {
    private Integer id;
    private String nome;
    private Double valor;
    private String genero;
    private String autor;
    private Integer quantidadesPagina;

    public Livro(Integer id, String nome, Double valor, String genero, String autor, Integer quantidadesPagina) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.genero = genero;
        this.autor = autor;
        this.quantidadesPagina = quantidadesPagina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQuantidadesPagina() {
        return quantidadesPagina;
    }

    public void setQuantidadesPagina(Integer quantidadesPagina) {
        this.quantidadesPagina = quantidadesPagina;
    }

    @Override
    public String toString() {
        return String.format("%05d %-30s %010.2f %-15s %-20s %07d", getId(), getNome(), getValor(), getGenero(), getAutor(), getQuantidadesPagina());
    }
}
