public class Fila {
    private int tamanho;
    private String[] fila;

    public Fila(int num) {
        this.tamanho = 0;
        this.fila = new String[num];
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

    void insert(String info){
        if (isFull()){
            System.out.println("Fila cheia");
        } else {
            System.out.println(tamanho);
            this.fila[tamanho++] = info;
        }
    }

    String peek(){
        if (isEmpty()){
            return "fila vazia!";
        }
        return this.fila[0];
    }

    String poll(){
        if (isEmpty()){
            return "fila vazia!";
        }
        String primeiro = this.fila[0];
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
}
