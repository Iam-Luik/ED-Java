public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila(4);
        fila.insert("teste1");
        fila.insert("teste2");
        fila.insert("teste3");
        fila.insert("teste4");
        fila.insert("teste5");

        System.out.println("Primeiro da fila: " + fila.peek());

        System.out.println("Item removido:" + fila.poll());

        fila.exibe();

        System.out.println("Item removido:" + fila.poll());

        fila.exibe();

        System.out.println("Item removido:" + fila.poll());

        fila.exibe();

        System.out.println("Item removido:" + fila.poll());

        fila.exibe();
    }
}
