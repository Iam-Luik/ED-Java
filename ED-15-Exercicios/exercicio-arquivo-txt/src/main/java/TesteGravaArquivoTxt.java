import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteGravaArquivoTxt {
    public static void main(String[] args) {
        // Criando objetos Aluno
        Filme a1 = new Filme("Harry Potter 1", "Fantasia", "J.K Rowling", 9.0, "2002-01-01");
        Filme a2 = new Filme("Harry Potter 2", "Fantasia", "J.K Rowling", 9.2, "2002-01-01");


        // Criando um List para adicionar os alunos
        List<Filme> lista = new ArrayList<Filme>();
        lista.add(a1);
        lista.add(a2);

        gravaArquivoTxt(lista, "filme.txt");
        leArquivoTxt("filme.txt");

    }

    public static void gravaRegistro(String nomeArq, String registro) {
        BufferedWriter saida = null;
        // Abre o arquivo
        try {
            saida = new BufferedWriter (new FileWriter(nomeArq, true));
        }
        catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo: " +
                    erro.getMessage());
        }

        // Grava o registro e finaliza
        try {
            saida.append(registro + "\n");
            saida.close();
        }
        catch (IOException erro) {
            System.out.println("Erro na gravação do arquivo: " +
                    erro.getMessage());
        }

    }

    public static void gravaArquivoTxt(List<Filme> lista, String nomeArq) {

        int contaRegistro = 0;

        // Monta o registro de header
        String header = "00FILME";
        Date dataDeHoje = new Date();
        SimpleDateFormat formataData =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        header += formataData.format(dataDeHoje);
        header += "01";

        // Grava o registro do header
        gravaRegistro(nomeArq, header);

        // Monta e grava o corpo
        String corpo;
        for (Filme filme : lista) {
            corpo = "02";
            corpo += String.format("%-20.20s",filme.getNome());
            corpo += String.format("%-10.10s",filme.getGenero());
            corpo += String.format("%-20.20s",filme.getDiretor());
            corpo += String.format("%04.1f",filme.getNota());
            corpo += String.format("%-10.10s", filme.getLancamento());
            gravaRegistro(nomeArq,corpo);
            contaRegistro++;
        }

        // Monta e grava o trailer
        String trailer = "01";
        trailer += String.format("%010d", contaRegistro);
        gravaRegistro(nomeArq,trailer);

    }

    public static void leArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String nome;
        String genero;
        String diretor;
        Double nota;
        String lancamento;
        String registro, tipoRegistro;

        int contaRegDados = 0;
        int qtdRegGravados;

        List<Filme> listaLida = new ArrayList();

        // Abre o arquivo para leitura
        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo: " +
                    erro.getMessage());
        }

        // Leitura do arquivo
        try {
            registro = entrada.readLine();  // Lê o primeiro registro do arquivo

            while (registro != null) {      // Enquanto não chegou ao final do arquivo
                // obtém o tipo do registro - primeiros 2 caracteres do registro
                // substring devolve um "pedaço da String",
                // que começa na posição 0 e termina na posição 1 (como num vetor)
                //    0123456
                //    00NOTA
                tipoRegistro = registro.substring(0,2);

                // Verifica se o tipoRegistro é "00" (header), ou "01" (trailer) ou "02" (corpo)
                if (tipoRegistro.equals("00")) {
                    System.out.println("Eh um header");
                    System.out.println("Tipo do arquivo: "+ registro.substring(2,7));
                    System.out.println("Data e hora de gravação: "+ registro.substring(7,26));
                    System.out.println("Versão do documento: "+registro.substring(26,28));
                }
                else if (tipoRegistro.equals("01")) {
                    System.out.println("Eh um trailer");
                    // Lê a quantidade de registros gravados que está no trailer
                    qtdRegGravados = Integer.valueOf(registro.substring(2,12));
                    // Valida se a quantidade lida é igual a quantidade gravada
                    if (qtdRegGravados == contaRegDados) {
                        System.out.println("Quantidade de registros lidos compatível com quantidade de registros gravados");
                    }
                    else {
                        System.out.println("Quantidade de registros lidos incompatível com quantidade de registros gravados");
                    }

                }
                else if (tipoRegistro.equals("02")) {
                    System.out.println("Eh um registro de corpo");
                    // Lê os dados do registro de corpo
                    nome = registro.substring(2, 22).trim();
                    System.out.println(nome);
                    genero = registro.substring(22, 33).trim();
                    System.out.println(genero);
                    diretor = registro.substring(33, 52).trim();
                    System.out.println(diretor);
                    nota = Double.valueOf(registro.substring(52,55).replace(',','.'));
                    System.out.println(nota);
                    lancamento =  registro.substring(55, 65).trim();
                    System.out.println(lancamento);


                    // Cria um objeto Aluno com os dados lidos do registro
                    Filme filme = new Filme(nome, genero, diretor, nota, lancamento);
                    // Adiciona esse objeto à listaLida
                    listaLida.add(filme);
                    // Incrementa o contador de registros de dados lidos
                    contaRegDados++;
                }
                else {
                    System.out.println("Tipo de registro inválido");
                }

                // lê o próximo registro
                registro = entrada.readLine();
            }

            // Fecha o arquivo
            entrada.close();
        }
        catch (IOException erro) {
            System.out.println("Erro ao ler arquivo: " + erro.getMessage());
        }

        // Exibe a listaLida
        System.out.println("\nConteúdo lido do arquivo:");
        for (Filme filme : listaLida) {
            System.out.println(filme);
        }
    }


//    public static void leArquivoTxt(String nomeArq) {
//        BufferedReader entrada = null;
//        String registro, tipoRegistro;
//
//        try {
//            entrada = new BufferedReader(new FileReader(nomeArq));
//        }
//        catch (IOException erro) {
//            System.out.println("Erro na abertura do arquivo: " +
//                    erro.getMessage());
//        }
//
//        try {
//            registro = entrada.readLine();  // Lê o primeiro registro do arquivo
//
//            while (registro != null) {      // Enquanto não chegou ao final do arquivo
//                // obtém o tipo do registro - primeiros 2 caracteres do registro
//                // substring devolve um "pedaço da String",
//                // que começa na posição 0 e termina na posição 1 (como num vetor)
//                //    0123456
//                //    00NOTA
//                tipoRegistro = registro.substring(0,2);
//
//                // Verifica se o tipoRegistro é "00" (header), ou "01" (trailer) ou "02" (corpo)
//                if (tipoRegistro.equals("00")) {
//                    System.out.println("Eh um header");
//                }
//                else if (tipoRegistro.equals("01")) {
//                    System.out.println("Eh um trailer");
//                }
//                else if (tipoRegistro.equals("02")) {
//                    System.out.println("Eh um registro de corpo");
//                }
//
//                // lê o próximo registro
//                registro = entrada.readLine();
//            }
//
//            entrada.close();
//        }
//        catch (IOException erro) {
//            System.out.println("Erro ao ler arquivo: " + erro.getMessage());
//        }
//    }
}
