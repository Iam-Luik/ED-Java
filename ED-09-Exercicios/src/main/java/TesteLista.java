public class TesteLista {
    public static void main(String[] args) {
        // cria lista passando o tamanho por parâmetro
        ListaEstatica lista = new ListaEstatica(3);

        // adiciona e mostra a lista com os elementos
        System.out.println(lista.addVect(10));
        System.out.println(lista.addVect(20));
        System.out.println(lista.addVect(30));
        lista.showVect();
        System.out.println("-----------------------");

        //procura a existência de um elemento na lista
        System.out.println(lista.search(7));
        System.out.println("-----------------------");

        //remove um elemento pela posição e exibe o vetor
        System.out.println(lista.removeByIndex(0));
        lista.showVect();
        System.out.println("-----------------------");

        //procura um elemento, se encontrar remove e retorna true, se não, retorna false e exibe a lista
        System.out.println(lista.removeByElement(20));
        lista.showVect();
    }
}
