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

    T poll(){
        if (isEmpty()){
            return null;
        }
        T primeiro = this.fila[0];
        for (int i = 1; i < tamanho; i++){
            this.fila[i - 1] = this.fila[i];
        }
        tamanho--;
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
