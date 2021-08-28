import java.util.ArrayList;
import java.util.List;

public class    ControleBonus {
    List<Bonificavel> listaBonificavel;

    public ControleBonus() {
        this.listaBonificavel = new ArrayList<Bonificavel>();
    }

    public void adicionaBonificavel(Bonificavel bonificavel){
        this.listaBonificavel.add(bonificavel);
    }

    public void exibeTodosBonificaveis(){
        for (Bonificavel bonificavel : listaBonificavel){
            System.out.println(bonificavel);
        }
    }

    public Double calculaTotalBonus(){
        Double soma = 0.0;
        for (Bonificavel bonificavel : listaBonificavel){
            soma += bonificavel.getValorBonus();
        }
        return soma;
    }
}
