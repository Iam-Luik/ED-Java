package com.example.abstr;

public class Coordenador extends Educador{
    private Integer quantidadeHorasCordenacao;
    private Double valorHoraCordenacao;

    public Coordenador(String nome, Integer quantidadeAulasSemana, Double valorHoraAula, Integer quantidadeHorasCordenacao, Double valorHoraCordenacao) {
        super(nome, quantidadeAulasSemana, valorHoraAula);
        this.quantidadeHorasCordenacao = quantidadeHorasCordenacao;
        this.valorHoraCordenacao = valorHoraCordenacao;
    }

    @Override
    public Double getValorBonus() {
        return (super.getQuantidadeAulasSemana() * super.getValorHoraAula() * 4.5 * 0.15) + (this.quantidadeHorasCordenacao * valorHoraCordenacao * 4.5 * 0.2);
    }

    @Override
    public String toString() {
        return "\nCordenador\n" + super.toString();
    }
}
