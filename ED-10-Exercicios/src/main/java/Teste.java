public class Teste {

    public static void main(String[] args) {
        ListaObj<String> lista = new ListaObj(2);
        lista.adiciona("Java");
        lista.adiciona("avaJ");
        lista.exibe();

        System.out.println(lista.busca("Java"));
        System.out.println(lista.busca("Setup"));

        System.out.println(lista.removePeloIndice(0));
        System.out.println(lista.removePeloIndice(-1));
        System.out.println(lista.removePeloIndice(3));

        System.out.println(lista.getTamanho());

        System.out.println(lista.getElemento(1));

        lista.limpa();
        lista.exibe();

        lista.adiciona("c# é melhor que java");

        lista.removeElemento("c# é melhor que java");

        lista.exibe();
    }
}
