public class FilaObj<T> {
    private int tamanho;
    private T[] fila;

    public FilaObj(int num) {
        this.tamanho = 0;
        this.fila = (T[]) new Object[num];
    }

    boolean isEmpty(){
        if (this.tamanho == 0){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if (this.tamanho == this.fila.length){
            return true;
        }
        return false;
    }

    void insert(T info){
        if (isFull()){
            System.out.println("Fila cheia");
        } else {
            this.fila[tamanho++] = info;
        }
    }

    T peek(){
        return this.fila[0];
    }

    public T poll() {
        T primeiro = peek(); // salva o primeiro elemento da fila

        if (!isEmpty()) { // se a fila não está vazia
            // faz a fila andar
            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i + 1];
            }
            fila[tamanho - 1] = null;    // limpa o último cara da fila
            tamanho--;                 // decrementa tamanho
        }
        return primeiro;
    }

    void exibe(){
        if (isEmpty()){
            System.out.println("Fila vazia!");
        } else {
            for (int i = 0; i < this.tamanho; i++){
                System.out.println(this.fila[i]);
            }
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
