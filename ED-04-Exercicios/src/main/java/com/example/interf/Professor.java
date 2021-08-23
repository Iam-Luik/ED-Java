package com.example.interf;

public class Professor implements Comissavel{

    private String nome;
    private Integer quantidadeHorasAula;
    private Double valorHoraAula;

    public Professor(String nome, Integer quantidadeHorasAula, Double valorHoraAula) {
        this.nome = nome;
        this.quantidadeHorasAula = quantidadeHorasAula;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeHorasAula() {
        return quantidadeHorasAula;
    }

    public void setQuantidadeHorasAula(Integer quantidadeHorasAula) {
        this.quantidadeHorasAula = quantidadeHorasAula;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double getValorbonus() {
        return quantidadeHorasAula * valorHoraAula * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "com.example.interf.Professor{" +
                "nome='" + nome + '\'' +
                ", quantidadeHorasAula=" + quantidadeHorasAula +
                ", valorHoraAula=" + valorHoraAula +
                "valorBonus=" + getValorbonus() + '}';
    }
}
