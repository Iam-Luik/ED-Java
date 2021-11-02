public class Teste {
    public static void main(String[] args) {
        PilhaObj<Livro> pilha = new PilhaObj<>(3);
        PilhaObj<Livro> aux;

        /* instancia 3 livros diferentes */
        Livro livro1 = new Livro("Harry Potter 1", "J.K Rowling");
        Livro livro2 = new Livro("Harry Potter 2", "J.K Rowling");
        Livro livro3 = new Livro("Harry Potter 3", "J.K Rowling");

        /* insere livros na pilha*/
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);

        /* Exibe pilha */
        System.out.println("Exibindo livros...");
        pilha.exibe();

        /* Remove 2 da pilha e joga na auxiliar */
        System.out.println(" ");
        System.out.println("Removendo itens da pilha...");
        aux = pilha.multiPop(2);

        /* Exibe auxiliar */
        System.out.println(" ");
        System.out.println("Exibindo auxiliar...");
        aux.exibe();

        /* Exibe pilha */
        System.out.println(" ");
        System.out.println("Exibindo pilha...");
        pilha.exibe();

        /* Remove 1 da pilha */
        System.out.println(" ");
        System.out.println("removendo item da pilha...");
        pilha.pop();

        /* Coloca de volta os valores guardados na auxiliar para a pilha */
        System.out.println(" ");
        System.out.println("retornando valores para a pilha");
        pilha.multiPush(aux);

        /* Exibe pilha novamente */
        System.out.println(" ");
        System.out.println("Exibindo pilha...");
        pilha.exibe();

    }
}
