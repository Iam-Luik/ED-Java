import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCSV {

    public static void gravaArquivoCSV(ListaObj<Produto> lista, String nomeArq){
        FileWriter arq = null;
        Formatter saida = null;
        Boolean falhou = false;
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
                Produto product = lista.getElemento(i);
                saida.format("%06d;%s;%.2f;%s;%.2f\n", product.getCodProduto(), product.getNome(), product.getPreco(), product.getAvaliacao(), product.calcularFaturamento());
            }
        } catch (FormatterClosedException error){
            System.out.println(error.getMessage());
            falhou = true;
        } finally {
            saida.close();
            System.out.println("\nstatus: 200");
            try {
                arq.close();
            } catch (IOException error){
                System.out.println(error.getMessage());
                falhou = true;
            }

            if(falhou){
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCSV (String nomeArq){
        FileReader arq = null;
        Scanner entrada = null;
        Boolean falhou = false;

        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException error){
            System.out.println(error.getMessage());
            System.exit(1);
        }

        try {
            System.out.printf("\n%4s %-15s %-9s %4s %14s\n", "CODIGO", "NOME", "PRECO", "NOTA", "FATURAMENTO");
            while(entrada.hasNext()){
                Integer codigo = entrada.nextInt();
                String nome = entrada.next();
                Double preco = entrada.nextDouble();
                String avaliacao = entrada.next();
                Double faturamento = entrada.nextDouble();
                System.out.printf("%06d %-15s %-9.2f %4s %14.3f\n", codigo, nome, preco, avaliacao, faturamento);
            }
        } catch(NoSuchElementException error){
            System.out.println(error.getMessage());
            falhou = true;
        } catch(IllegalStateException error){
            System.out.println(error.getMessage());
            falhou = true;
        } finally {
            System.out.println("\nstatus: 200");
            entrada.close();
            try {
                arq.close();
            } catch (IOException error){
                System.out.println(error.getMessage());
                falhou = true;
            }

            if (falhou){
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        ListaObj<Produto> listaProduct = new ListaObj(4);

        Produto produto1 = new Produto(123, "Notebook", 10.500, "***");
        Produto produto2 = new Produto(456, "Mouse", 2.500, "*");
        Produto produto3 = new Produto(789, "Teclado", 10.40, "***");
        Produto produto4 = new Produto(444, "TV", 150.56, "****");

        listaProduct.adiciona(produto1);
        listaProduct.adiciona(produto2);
        listaProduct.adiciona(produto3);
        listaProduct.adiciona(produto4);

        listaProduct.exibe();

        gravaArquivoCSV(listaProduct, "meusProdutos");
        leExibeArquivoCSV("meusProdutos");
    }
}
