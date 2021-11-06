public class Pilha {
    private int topo;
    private int[] pilha;

    Pilha(int tamanho) {
        this.topo = -1;
        this.pilha = new int[tamanho];
    }

    boolean isEmpty() {
        return this.topo == -1;
    }

    boolean isFull() {
        return this.topo == pilha.length - 1;
    }

    void push(int valor) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            this.pilha[++topo] = valor;
        }


    }

    int pop() {
        if (isEmpty()) {
            return this.topo;
        }
        return this.pilha[this.topo--];
    }

    int peek() {
        if (isEmpty())
            return this.topo;
        return this.pilha[this.topo];
    }

    void exibe() {
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("");
            for (int i = this.topo; i >= 0; i--) {
                System.out.print(this.pilha[i]);
            }
        }
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }
}
