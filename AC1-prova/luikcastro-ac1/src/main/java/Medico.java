public abstract class Medico implements Bonificavel {
    Integer crm;
    String nome;

    public Medico(Integer crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                '}';
    }
}
