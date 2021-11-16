import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PilhaObj<Operacao> pilha = new PilhaObj<>(10);
        FilaObj<Operacao> fila = new FilaObj<>(10);
        Integer contador = 0;

        ContaBancaria conta1 = new ContaBancaria(5582200);
        ContaBancaria conta2 = new ContaBancaria(758214);

        conta1.depositar(1000.00);
        conta2.depositar(1300.00);

        int aux = 0;
        int auxDesfazer = 0;
        int nmrConta;
        double valor;
        double valorPilha = 0.0;
        String operacao;
        Scanner leitor = new Scanner(System.in);

        while (aux != 6) {
            System.out.print("\nEscolha uma opção a seguir:" +
                    "\n1 - Debitar valor" +
                    "\n2 - Depositar valor " +
                    "\n3 - Desfazer operação" +
                    "\n4 - Agendar operação " +
                    "\n5 - Executar operações agendadas" +
                    "\n6 - Sair \n");
            aux = leitor.nextInt();
            switch (aux) {
                case 1:
                    System.out.print("Digite o número da conta: ");
                    nmrConta = leitor.nextInt();
                    System.out.print("Digite o valor a ser debitado da conta: ");
                    valor = leitor.nextDouble();
                    if (nmrConta == conta1.getNumero()) {
                        if (conta1.debitar(valor)) {
                            Operacao operacaoPilha = new Operacao("debito", nmrConta, valor);
                            pilha.push(operacaoPilha);
                            contador++;
                        }
                    } else if (nmrConta == conta2.getNumero()) {
                        if (conta2.debitar(valor)) {
                            Operacao operacaoPilha = new Operacao("debito", nmrConta, valor);
                            pilha.push(operacaoPilha);
                            contador++;
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    nmrConta = leitor.nextInt();
                    System.out.print("Digite o valor a ser creditado na conta: ");
                    valor = leitor.nextDouble();
                    if (nmrConta == conta1.getNumero()) {
                        conta1.depositar(valor);
                        Operacao operacaoPilha2 = new Operacao("deposito", nmrConta, valor);
                        pilha.push(operacaoPilha2);
                        contador++;
                    } else if (nmrConta == conta2.getNumero()) {
                        conta2.depositar(valor);
                        Operacao operacaoPilha2 = new Operacao("deposito", nmrConta, valor);
                        pilha.push(operacaoPilha2);
                        contador++;
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;
                case 3:
                    System.out.print("Digite quantas operações devem ser desfeitas: ");
                    auxDesfazer = leitor.nextInt();
                    if (auxDesfazer > contador || auxDesfazer < 1) {
                        System.out.println("Quantidade inválida");
                    } else {
                        for (int i = 0; i < auxDesfazer; i++) {
                            Operacao pilhaObj = pilha.pop();
                            contador--;
                            valorPilha = pilhaObj.getValor();

                            nmrConta = pilhaObj.getObjConta().getNumero();
                            if (pilhaObj.getTipoOperacao() == "deposito") {
                                if (nmrConta == conta1.getNumero()) {
                                    conta1.debitar(valorPilha);
                                } else if (nmrConta == conta2.getNumero()) {
                                    conta2.debitar(valorPilha);
                                } else {
                                    System.out.println("Ocorreu um erro ao obter tipo de operação");
                                }
                            } else if (pilhaObj.getTipoOperacao() == "debito") {
                                if (nmrConta == conta1.getNumero()) {
                                    conta1.depositar(valorPilha);
                                } else if (nmrConta == conta2.getNumero()) {
                                    conta2.depositar(valorPilha);
                                } else {
                                    System.out.println("Ocorreu um erro ao obter tipo de operação");
                                }
                            } else {
                                System.out.println("Ocorreu um erro ao ler tipo de operação");
                            }
                        }
                    }
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;
                case 4:
                    System.out.print("Digite a operação desejada (debito ou deposito): ");
                    operacao = leitor.next();
                    System.out.print("Digite o número da conta: ");
                    nmrConta = leitor.nextInt();
                    System.out.print("Digite o valor: ");
                    valor = leitor.nextDouble();
                    Operacao operacaoFila = new Operacao(operacao, nmrConta, valor);
                    fila.insert(operacaoFila);
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;
                case 5:
                    System.out.println(fila.isEmpty());
                    if (fila.isEmpty()) {
                        System.out.println("Não há operações agendadas");
                    } else {
                        while (!fila.isEmpty()) {
                            Operacao operacaoAgendada = fila.poll();
                            nmrConta = operacaoAgendada.getObjConta().getNumero();
                            operacao = operacaoAgendada.getTipoOperacao();
                            valor = operacaoAgendada.getValor();
                            System.out.println(nmrConta + operacao + valor);
                            if (nmrConta == conta1.getNumero()) {
                                if (operacao.equals("debito")) {
                                    System.out.println("entrou no debito");
                                    conta1.debitar(valor);
                                } else if (operacao.equals("deposito")) {
                                    conta1.depositar(valor);
                                }
                            } else if (nmrConta == conta2.getNumero()) {
                                if (operacao.equals("debito")) {
                                    conta2.debitar(valor);
                                } else if (operacao.equals("deposito")) {
                                    conta2.depositar(valor);
                                }
                            }
                        }
                    }
                    System.out.println(conta1);
                    System.out.println(conta2);
                    break;
                case 6:
                    aux = 6;
                    System.out.println("Você encerrou o programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}