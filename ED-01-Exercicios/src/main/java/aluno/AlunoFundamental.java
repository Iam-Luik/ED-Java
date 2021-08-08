package aluno;

public class AlunoFundamental extends Aluno{

    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    public AlunoFundamental(Integer ra, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return "\nALUNO FUNDAMENTAL\n" +
                super.toString() +
                "\n1ª nota: " + this.nota1 +
                "\n2ª nota: " + this.nota2 +
                "\n3ª nota: " + this.nota3 +
                "\n4ª nota: " + this.nota4 +
                "\n" + String.format("Média: %.2f", this.calculaMedia());
    }
}
