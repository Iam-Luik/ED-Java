package com.example.interf;

public class TestePrograma {
    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("Gerson", 1300, 40.00);
        Professor professor = new Professor("Célia", 1300, 40.00);

        ControleBonus controle = new ControleBonus();

        controle.adicionarCoordenador(coordenador);
        controle.adicionarProfessor(professor);

        System.out.println(String.format("Coordernador bônus: %.2f", coordenador.getValorbonus()));
        System.out.println(String.format("Professor bônus: %.2f", professor.getValorbonus()));

        System.out.println(String.format("Total bônus: %.2f", controle.calculaTotalBonus()));
    }
}
