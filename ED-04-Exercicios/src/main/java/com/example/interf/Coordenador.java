package com.example.interf;

public class Coordenador implements Comissavel {
    private String nome;
    private Integer quantidadeHorasCoordenacao;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Integer quantidadeHorasCoordenacao, Double valorHoraCoordenacao) {
        this.nome = nome;
        this.quantidadeHorasCoordenacao = quantidadeHorasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeHorasCoordenacao() {
        return quantidadeHorasCoordenacao;
    }

    public void setQuantidadeHorasCoordenacao(Integer quantidadeHorasCoordenacao) {
        this.quantidadeHorasCoordenacao = quantidadeHorasCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorbonus() {
        return quantidadeHorasCoordenacao * valorHoraCoordenacao * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        return "com.example.interf.Coordenador{" +
                "nome='" + nome + '\'' +
                ", quantidadeHorasCoordenacao=" + quantidadeHorasCoordenacao +
                ", valorHoraCoordenacao=" + valorHoraCoordenacao +
                "valorBonus=" + getValorbonus() + '}';
    }
}
