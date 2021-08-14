package animal;

public class Repteis extends Animal{
    public Repteis(String nome, String respiracao, Integer idade, String dietaAlimentar) {
        super(nome, respiracao, idade, dietaAlimentar);
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " está comendo");
    }



    public void trocarDePele(){
        System.out.println(super.getNome() + " está trocando de pele");
    }

    @Override
    public String toString() {
        return "\nRepteis\n" + super.toString();
    }
}
