public class SaidaFormatada {
    public static void main(String[] args) {
        System.out.printf("%-5s %-14s %7s %7s %14s \n", "CODIGO", "NOME", "PRECO", "NOTA", "FATURAMENTO");
        Produto produto1 = new Produto(123, "Notebook", 10.500, "***");
        produto1.comprar(5);

        Produto produto2 = new Produto(456, "Mouse", 2.500, "*");
        produto1.comprar(2);

        Produto produto3 = new Produto(789, "Teclado", 10.40, "***");
        produto1.comprar(4);

        Produto produto4 = new Produto(444, "TV", 150.56, "****");
        produto1.comprar(4);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}
