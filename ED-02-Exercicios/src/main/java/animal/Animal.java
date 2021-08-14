package animal;

public abstract class Animal {
    private String nome;
    private String respiracao;
    private Integer idade;
    private String dietaAlimentar;

    public Animal(String nome, String respiracao, Integer idade, String dietaAlimenta) {
        this.nome = nome;
        this.respiracao = respiracao;
        this.idade = idade;
        this.dietaAlimentar = dietaAlimentar;
    }

    public abstract void comer();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRespiracao() {
        return respiracao;
    }

    public void setRespiracao(String respiracao) {
        this.respiracao = respiracao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", respiracao='" + respiracao + '\'' +
                ", idade=" + idade +
                ", dietaAlimentar='" + dietaAlimentar + '\'' +
                '}';
    }
}
