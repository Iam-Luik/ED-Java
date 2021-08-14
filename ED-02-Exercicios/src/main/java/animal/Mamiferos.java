package animal;

public class Mamiferos extends Animal{
    public Mamiferos(String nome, String respiracao, Integer idade, String dietaAlimentar) {
        super(nome, respiracao, idade, dietaAlimentar);
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " está comendo");
    }

    public void mamar(){
        System.out.println(super.getNome() + " está mamando");
    }

    @Override
    public String toString() {
        return "\nMamiferos\n" + super.toString();
    }
}
