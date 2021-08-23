package com.example.abstr;

public abstract class Educador {
    private String nome;
    private Integer quantidadeAulasSemana;
    private Double valorHoraAula;

    public Educador(String nome, Integer quantidadeAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.quantidadeAulasSemana = quantidadeAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAulasSemana() {
        return quantidadeAulasSemana;
    }

    public void setQuantidadeAulasSemana(Integer quantidadeAulasSemana) {
        this.quantidadeAulasSemana = quantidadeAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public abstract Double getValorBonus();

    @Override
    public String toString() {
        return "Educador{" +
                "nome='" + nome + '\'' +
                ", quantidadeAulasSemana=" + quantidadeAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }
}
