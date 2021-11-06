import java.util.Locale;

public class Teste {
    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 3, 1};
        int[] vetor2 = {10, 20, 30, 40};
        int[] vetor3 = {1, 2, 3, 2, 1};
        /* 1 3 3 1*/



        System.out.println(ehPalindromo(vetor1));
        System.out.println(ehPalindromo(vetor2));
        System.out.println(ehPalindromo(vetor3));


        converterDecimalParaBinario(9);
        converterDecimalParaBinario(12);
        converterDecimalParaBinario(32);
        converterDecimalParaBinario(320);

        PilhaObj obj = new PilhaObj(3);
        obj.push("Luik");
        obj.push("Castro");
        obj.push("Silva");
        obj.exibe();
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

        String frase = "A pilha do gato";
        exbibeInvertido(frase);

        String teste = "subi no onibus";
        char[] testeChar = stringToChar(teste);
        System.out.println("char palindromo");
        System.out.println(ehPalindromoChars(testeChar));

    }

//    public static boolean ehPalindromo(int[] vetor) {
//        Pilha aux = new Pilha(vetor.length);
//
//        for (int i = 0; i < vetor.length; i++) {
//            aux.push(vetor[i]);
//        }
//
//        for (int i = 0; i < vetor.length; i++) {
//            if (vetor[i] != aux.peek()) {
//                return false;
//            }
//            aux.pop();
//        }
//        return true;
//    }

    public static boolean ehPalindromo(int[] vetor){
        Pilha aux = new Pilha(vetor.length / 2);
        int i = 0;

        for (i = 0; i < vetor.length / 2; i++){
            aux.push(vetor[i]);
        }

        if (vetor.length % 2 != 0){
            i++;
        }

        for (;i < vetor.length; i++){
            if (vetor[i] != aux.pop()) {
                return false;
            }
        }
        return true;
    }

    public static char[] stringToChar(String frase){
        frase = frase.toLowerCase();
        frase = frase.replaceAll(" ", "");
        return frase.toCharArray();
    }

    public static void exbibeInvertido(String frase) {
        char[] fraseChar = stringToChar(frase);
        PilhaObj<Character> obj = new PilhaObj<Character>(fraseChar.length);
        for (int i = 0; i < fraseChar.length; i++) {
            obj.push(fraseChar[i]);
        }
        obj.exibe();
    }

    public static boolean ehPalindromoChars(char[] frase){
        PilhaObj<Character> obj = new PilhaObj<Character>(frase.length);

        for (int i = 0; i < frase.length; i++) {
            obj.push(frase[i]);
        }

        for (int i = 0; i < frase.length; i++) {
            if (frase[i] != obj.peek()){
                return false;
            }
            obj.pop();
        }
        return true;
    }

    public static void converterDecimalParaBinario(int decimal) {

        Pilha aux = new Pilha((int)(Math.log(decimal) / Math.log(2)) + 1);
        int num = decimal;
        /* cria um for que decrementa o valor pela metade */
        while (num != 0){
            aux.push(num % 2);

            num /= 2;
        }

        while (!aux.isEmpty()){
            System.out.print(aux.pop());
        }
        System.out.println("");
    }
}
