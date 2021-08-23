package com.example.interf;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List<Professor> listaProfessor;
    List<Coordenador> listaCoordenador;

    public ControleBonus() {
        listaProfessor = new ArrayList<Professor>();
        listaCoordenador = new ArrayList<Coordenador>();
    }

    public void adicionarProfessor(Professor professor){
        this.listaProfessor.add(professor);
    }

    public void adicionarCoordenador(Coordenador coordenador){
        this.listaCoordenador.add(coordenador);
    }

    public double calculaTotalBonus(){
        double soma = 0.0;
        for (Professor professor : listaProfessor){
            soma += professor.getValorbonus();
        }

        for (Coordenador coordenador : listaCoordenador){
            soma += coordenador.getValorbonus();
        }
        return soma;
    }
}
