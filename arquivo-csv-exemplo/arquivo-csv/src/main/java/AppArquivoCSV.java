import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCSV {

    public static void gravaArquivoCSV(ListaObj<Cachorro> lista, String nomeArq){
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;
        nomeArq += ".csv";

        try {
            arq = new FileWriter(nomeArq, true);
            saida = new Formatter(arq);
        } catch (IOException error){
            System.out.println(error.getMessage());
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++){
                Cachorro dog = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        } catch (FormatterClosedException error){
            System.out.println(error.getMessage());
            deuRuim = true;
        } finally {
            saida.close();
            System.out.println("\nstatus: 200");
            try {
                arq.close();
            } catch (IOException error){
                System.out.println(error.getMessage());
                deuRuim = true;
            }

            if(deuRuim){
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCSV (String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException error){
            System.out.println(error.getMessage());
            System.exit(1);
        }

        try {
            System.out.printf("\n%4s %-15s %-9s %4s\n", "ID", "NOME", "PORTE", "PESO");
            while(entrada.hasNext()){
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();
                System.out.printf("%4d %-15s %-9s %4.1f\n", id, nome, porte, peso);
            }
        } catch(NoSuchElementException error){
            System.out.println(error.getMessage());
            deuRuim = true;
        } catch(IllegalStateException error){
            System.out.println(error.getMessage());
            deuRuim = true;
        } finally {
            System.out.println("\nstatus: 200");
            entrada.close();
            try {
                arq.close();
            } catch (IOException error){
                System.out.println(error.getMessage());
                deuRuim = true;
            }

            if (deuRuim){
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        ListaObj<Cachorro> listaDog = new ListaObj(7);

        listaDog.adiciona(new Cachorro(1, "Odin", "Pequeno", 4.0));
        listaDog.adiciona(new Cachorro(2, "Thor", "Pequeno", 5.0));
        listaDog.adiciona(new Cachorro(1, "Medusa", "Pequeno", 8.0));
        listaDog.adiciona(new Cachorro(1, "Murphy", "Pequeno", 6.0));

        listaDog.exibe();

        gravaArquivoCSV(listaDog, "meuscachorros");
        leExibeArquivoCSV("meuscachorros");
    }
}
