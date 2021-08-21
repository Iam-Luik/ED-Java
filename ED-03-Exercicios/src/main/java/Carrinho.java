import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Vendavel> lista;

    public Carrinho() {
        this.lista = new ArrayList<Vendavel>();
    }

    public void adicionarVendavel(Vendavel vendavel){
        this.lista.add(vendavel);
    }

    public Double calculaTotalVenda(){
        Double total = 0.0;
        for (Vendavel vendavel : lista){
            total += vendavel.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        for (Vendavel vendavel : lista){
            System.out.println(vendavel);
        }
    }
}
