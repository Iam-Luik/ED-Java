import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        Integer opcao;
        Boolean fim = false;
        Integer codigo;
        String descricao;
        Double precoCusto;
        String nome;
        String autor;
        String isbn;
        String gravadora;
        Integer qtdHoras;
        Double valorHora;

        Carrinho carrinho = new Carrinho();

        carrinho.exibeItensCarrinho();

        while (!fim) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar dvd");
            System.out.println("3 - Adicionar serviço");
            System.out.println("4 - Exibir todos os itens tributáveis");
            System.out.println("5 - Exibir o total de venda");
            System.out.println("6 - Fim");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do livro");
                    codigo = leitor.nextInt();
                    System.out.printf("Digite o preço de custo");
                    precoCusto = leitor.nextDouble();
                    System.out.println("Digite o nome do livro");
                    nome = leitorNL.nextLine();
                    System.out.println("Digite o nome do autor do livro");
                    autor = leitorNL.nextLine();
                    System.out.println("Digite o isbn do livro");
                    isbn = leitorNL.nextLine();
                    Livro livro = new Livro(codigo,precoCusto,nome, autor, isbn);
                    carrinho.adicionarVendavel(livro);


                    break;

                case 2:
                    System.out.println("Digite o código do DVD");
                    codigo = leitor.nextInt();
                    System.out.printf("Digite o preço de custo do DVD");
                    precoCusto = leitor.nextDouble();
                    System.out.println("Digite o nome do DVD");
                    nome = leitorNL.nextLine();
                    System.out.println("Digite gravadora");
                    gravadora = leitorNL.nextLine();
                    DVD dvd = new DVD(codigo, precoCusto, nome, gravadora);
                    carrinho.adicionarVendavel(dvd);
                    break;

                case 3:
                    System.out.printf("Digite a descrição do serviço");
                    descricao = leitorNL.nextLine();
                    System.out.println("Digite o código do serviço");
                    codigo = leitor.nextInt();
                    System.out.println("Digite o quantidade de horas");
                    qtdHoras = leitor.nextInt();
                    System.out.println("Digite o valor da hora");
                    valorHora = leitor.nextDouble();
                    Servico servico = new Servico(descricao, codigo, qtdHoras, valorHora);
                    carrinho.adicionarVendavel(servico);
                    break;

                case 4:
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    System.out.println(String.format("\nTotal de venda: %.2f", carrinho.calculaTotalVenda()));
                    break;
                case 6:
                    fim = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
