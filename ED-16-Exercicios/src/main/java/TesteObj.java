public class TesteObj {
    public static void main(String[] args) {
        int[] vetor = {2, 7, -3, -50, 45, -4, 30, -21, 38};

        separaPositivoNegativoEmOrdem(vetor);
        separaPositivoNegativoEmOrdemDiferente(vetor);
    }

    public static void separaPositivoNegativoEmOrdem(int[] inteiros) {
        FilaObj<Integer> positivo = new FilaObj<Integer>(inteiros.length);
        FilaObj<Integer> negativo = new FilaObj<Integer>(inteiros.length);

        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] >= 0) {
                positivo.insert(inteiros[i]);
            } else {
                negativo.insert(inteiros[i]);
            }
        }

        while (!positivo.isEmpty()) {
            System.out.print(positivo.poll() + " ");
        }
        while (!negativo.isEmpty()) {
            System.out.print(negativo.poll() + " ");
        }
    }

    public static void separaPositivoNegativoEmOrdemDiferente(int[] inteiros) {
        FilaObj<Integer> positivo = new FilaObj<Integer>(inteiros.length);
        PilhaObj<Integer> negativo = new PilhaObj<Integer>(inteiros.length);

        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] >= 0) {
                positivo.insert(inteiros[i]);
            } else {
                negativo.push(inteiros[i]);
            }
        }

        while (!positivo.isEmpty()) {
            System.out.print(positivo.poll() + " ");
        }
        while (!negativo.isEmpty()) {
            System.out.print(negativo.pop() + " ");
        }
    }
}
