package com.example.abstr;

public class TestePrograma {
    public static void main(String[] args) {
        Professor professor = new Professor("Thiago", 10, 100.00);
        Coordenador coordenador = new Coordenador("Thiago", 10, 100.00, 8, 150.00);

        ControleBonus controle = new ControleBonus();

        controle.adicionarProfessor(professor);
        controle.adicionarCoordenador(coordenador);
        System.out.println(String.format("Professor bônus: %.2f", professor.getValorBonus()));
        System.out.println(String.format("Coordenador bônus: %.2f", coordenador.getValorBonus()));
        System.out.println("Total bônus" + controle.calculaTotalBonus());
        controle.exibeEducadores();
    }
}
