package animal;

public class Executavel {
    public static void main(String[] args) {
        Anfibios anfibio = new Anfibios("sapo cururu", "pulmonar", 1, "carnivoro");
        Mamiferos mamifero = new Mamiferos("Baleia", "pulmonar", 20, "carnivoro");
        Repteis repteis = new Repteis("Jacaré", "pulmonar", 20, "carnivoro");

        anfibio.comer();
        anfibio.umedecerPele();
        mamifero.mamar();
        mamifero.comer();
        repteis.trocarDePele();

        Zoologico zoologico = new Zoologico("Master Zoologico", "04832920");

        zoologico.adicionarAnimal(anfibio);
        zoologico.adicionarAnimal(mamifero);
        zoologico.adicionarAnimal(repteis);

        zoologico.exibirTodos();

        zoologico.exibirMamiferos();
    }
}
