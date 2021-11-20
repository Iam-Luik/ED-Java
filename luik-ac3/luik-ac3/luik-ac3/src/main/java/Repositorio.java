import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repositorio {
    private List<Livro> livros;
    private PilhaObj<Integer> pilha;
    private FilaObj<Integer> fila;
    private Integer auxDesfeitas;

    public Repositorio() {
        livros = new ArrayList<>();
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
        auxDesfeitas = 0;
    }

    public void save(Livro livro) {
        this.livros.add(livro);
        this.pilha.push(livro.getId());
        auxDesfeitas++;
    }

    public void deleteById(int id) {
        boolean livroExiste = false;
        Livro livroAux = null;
        for (Livro livro : livros) {
            if (livro.getId().equals(id)) {
                livroAux = livro;
                livroExiste = true;
            }
        }
        if (!livroExiste) {
            System.out.println("Id inválido!");
        } else {
            livros.remove(livroAux);
            auxDesfeitas--;
        }
    }

    public void showAll() {
        if (livros.isEmpty()) {
            System.out.println("Não existe nenhum livro até o momento!");
        } else {
            System.out.printf("%5s %-30s %10s %-15s %-20s %-7s\n", "ID", "NOME", "VALOR", "GENERO", "AUTOR", "PÁGINAS");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void undo(int qtdOperacoes) {
        if (qtdOperacoes > auxDesfeitas || qtdOperacoes < 1) {
            System.out.println("Quantidade de operações inválidas");
        } else {
            for (int i = qtdOperacoes; i > 0; i--) {
                this.deleteById(pilha.pop());
            }
        }
    }

    public void delayDeleteById(int id) {
        fila.insert(id);
    }

    public void flush() {
        if (fila.isEmpty()){
            System.out.println("Não tem itens para serem removidos");
        }
        while (!fila.isEmpty()) {
            this.deleteById(fila.poll());
        }
    }

    public void exportTXT() {
        gravaArquivoTxt(livros, "livros.txt");
    }


    public static void gravaRegistro(String nomeArq, String registro) {
        BufferedWriter saida = null;
        // Abre o arquivo
        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo: " +
                    erro.getMessage());
        }

        // Grava o registro e finaliza
        try {
            saida.append(registro + "\n");
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro na gravação do arquivo: " +
                    erro.getMessage());
        }

    }

    public static void gravaArquivoTxt(List<Livro> lista, String nomeArq) {

        int contaRegistro = 0;

        // Monta o registro de header
        String header = "00LIVRO";
        Date dataDeHoje = new Date();
        SimpleDateFormat formataData =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        header += formataData.format(dataDeHoje);
        header += "01";

        // Grava o registro do header
        gravaRegistro(nomeArq, header);

        // Monta e grava o corpo
        String corpo;
        for (Livro livro : lista) {
            System.out.println("Entrou no for");
            corpo = "02";
            System.out.println(livro.getId());
            corpo += String.format("%05d", livro.getId());
            System.out.println(livro.getId());
            corpo += String.format("%-30.30s", livro.getNome());
            System.out.println(livro.getNome());
            corpo += String.format("%010.2f", livro.getValor());
            corpo += String.format("%-15.15s", livro.getGenero());
            corpo += String.format("%-20.20s", livro.getAutor());
            corpo += String.format("%07d", livro.getQuantidadesPagina());
            gravaRegistro(nomeArq, corpo);
            contaRegistro++;
        }

        // Monta e grava o trailer
        String trailer = "01";
        trailer += String.format("%010d", contaRegistro);
        gravaRegistro(nomeArq, trailer);

    }
}
