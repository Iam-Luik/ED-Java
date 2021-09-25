public class ListaObj <T>{

    private T[] vetor;
    private int nroElem;


    public ListaObj(int tam) {
        vetor = (T[]) new Object[tam];
        nroElem = 0;
    }
    
    public Boolean adiciona(T valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia!");
            return false;
        }
        else {
            vetor[nroElem++] = valor;
            return true;
        }
    }

    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia!");
        }
        else {
            System.out.println("\nLista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

    public int busca(T valorPesquisado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(valorPesquisado)) {
                return i;
            }
        }
        return -1;
    }

    public Boolean removePeloIndice (int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("Índice inválido!");
            return false;
        }
        else {

            for (int i = indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            nroElem--;
            return true;
        }
    }

    public int getTamanho(){
        return nroElem;
    }

    public T getElemento(int indice){
        if (indice < 0 || indice > nroElem){
            return null;
        }
        return vetor[indice];
    }

    public void limpa(){
        nroElem = 0;
    }

    public Boolean removeElemento(T valor) {
        return removePeloIndice(busca(valor));
    }

}
