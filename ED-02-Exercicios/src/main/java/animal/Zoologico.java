package animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nome;
    private String cep;
    private List<Animal> lista;

    public Zoologico(String nome, String cep) {
        this.nome = nome;
        this.cep = cep;
        this.lista = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animal) {
        lista.add(animal);
    }

    public void exibirTodos() {
        for (Animal animal : lista) {
            System.out.println(animal);
        }
    }

    public void exibirMamiferos() {
        for (Animal animal : lista) {
            if (animal instanceof Mamiferos) {
                System.out.println(animal);
            }
        }
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", cep='" + cep + '\'' +
                ", lista=" + lista +
                '}';
    }
}
