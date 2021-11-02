import java.util.Arrays;

public class PilhaObj<T>{

    private T[] pilha;
    private int topo;


    public PilhaObj(int tam) {
        pilha = (T[]) new Object[tam];
        topo = -1;
    }

    boolean isEmpty() {
        return this.topo == -1;
    }

    boolean isFull() {
        return this.topo == pilha.length - 1;
    }

    void push(T valor) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            this.pilha[++topo] = valor;
        }
    }

    T pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilha[this.topo--];
    }

    T peek() {
        if (isEmpty()) {
            return null;
        }
        return this.pilha[this.topo];
    }

    void exibe() {
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
        } else {

            for (int i = this.topo; i >= 0; i--) {
                System.out.print(this.pilha[i]);
                System.out.println("");
            }
        }
    }

    PilhaObj<T> multiPop(int n) {
        if (topo < (n - 1)) {
            return null;
        } else {
            PilhaObj<T> aux = new PilhaObj<>(n);
            for (int i = 0; i < n; i++) {
                aux.push(peek());
                pop();
            }
            return aux;
        }
    }

    void multiPush (PilhaObj<T> aux){
        while (aux.topo != -1){
            push(aux.pop());
        }
    }

    public T[] getPilha() {
        return pilha;
    }

    public void setPilha(T[] pilha) {
        this.pilha = pilha;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }


}