package animal;

public class Anfibios extends Animal{
    public Anfibios(String nome, String respiracao, Integer idade, String dietaAlimentar) {
        super(nome, respiracao, idade, dietaAlimentar);
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " está comendo");
    }

    public void umedecerPele(){
        System.out.println(super.getNome() + " está mamando");
    }

    @Override
    public String toString() {
        return "\nAnfibios\n" + super.toString();
    }
}
