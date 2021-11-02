import java.util.Locale;

public class Teste {
    public static void main(String[] args) {
        /* 1 3 3 1*/
        Pilha exemplo1 = new Pilha(4);
        exemplo1.push(1);
        exemplo1.push(3);
        exemplo1.push(3);
        exemplo1.push(1);

        System.out.println(ehPalindromo(exemplo1.getPilha()));

        /* 10 20 30 40*/
        Pilha exemplo2 = new Pilha(4);
        exemplo2.push(10);
        exemplo2.push(20);
        exemplo2.push(30);
        exemplo2.push(40);

        System.out.println(ehPalindromo(exemplo2.getPilha()));

        /* 10 20 30 30 20 10 */
        Pilha exemplo3 = new Pilha(6);
        exemplo3.push(10);
        exemplo3.push(20);
        exemplo3.push(30);
        exemplo3.push(30);
        exemplo3.push(20);
        exemplo3.push(10);

        System.out.println(ehPalindromo(exemplo3.getPilha()));

        /* 1 2 3 2 1 */
        Pilha exemplo4 = new Pilha(5);
        exemplo4.push(1);
        exemplo4.push(2);
        exemplo4.push(3);
        exemplo4.push(2);
        exemplo4.push(1);

        System.out.println(ehPalindromo(exemplo4.getPilha()));

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

    public static boolean ehPalindromo(int[] vetor) {
        Pilha aux = new Pilha(vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            aux.push(vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != aux.peek()) {
                return false;
            }
            aux.pop();
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
        Pilha aux = new Pilha(decimal);

        /* cria um for que decrementa o valor pela metade */
        for (int i = decimal; i > 0; i = i / 2) {
            /* pega o resto da divisão e coloca dentro da pilha auxiliar */
            aux.push(i % 2);
        }

        /* exibe os valores da pilha */
        aux.exibe();
    }
}
