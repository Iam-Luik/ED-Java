package com.example.abstr;

public class Professor extends Educador {
    public Professor(String nome, Integer quantidadeAulasSemana, Double valorHoraAula) {
        super(nome, quantidadeAulasSemana, valorHoraAula);
    }

    @Override
    public Double getValorBonus() {
        return super.getQuantidadeAulasSemana() * super.getValorHoraAula() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "\nProfessor\n" + super.toString();
    }
}
