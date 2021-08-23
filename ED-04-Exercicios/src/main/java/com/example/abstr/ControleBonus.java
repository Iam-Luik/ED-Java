package com.example.abstr;

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
        listaProfessor.add(professor);
    }

    public void adicionarCoordenador(Coordenador coordenador){
        listaCoordenador.add(coordenador);
    }

    public double calculaTotalBonus(){
        Double soma = 0.0;
        for (Professor professor : listaProfessor){
            soma += professor.getValorBonus();
        }

        for (Coordenador coordenador : listaCoordenador){
            soma += coordenador.getValorBonus();
        }
        return soma;
    }

    public void exibeEducadores(){
        for (Professor professor : listaProfessor){
            System.out.println(professor);
        }

        for (Coordenador coordenador : listaCoordenador){
            System.out.println(coordenador);
        }
    }
}
