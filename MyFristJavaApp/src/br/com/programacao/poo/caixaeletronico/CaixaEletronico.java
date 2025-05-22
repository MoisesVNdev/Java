package br.com.programacao.poo.caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {
    private final Scanner scanner = new Scanner(System.in);
    private final Banco banco;

    public CaixaEletronico(Banco banco) {
        this.banco = banco;
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n=== Caixa Eletrônico Cop. Tabajara ===");
            System.out.println("1 - Acessar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Criar conta");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> acessarConta();
                case 2 -> banco.listarContas();
                case 3 -> realizarDeposito();
                case 4 -> criarConta();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
    private void criarConta(){
        System.out.print("\nNome do titular: ");
        String titular = scanner.nextLine();
        System.out.print("Digite uma senha de três digitos: ");
        int senha = Integer.parseInt(scanner.nextLine());

        Conta novaConta = new Conta(titular,senha);
        banco.adicionarConta(novaConta);
        System.out.println("✅ Conta criada com sucesso!");
        System.out.println("Número da nova conta: "+ novaConta.getNumConta()) ;
    }
    private void acessarConta() {
        System.out.print("Número da conta: ");
        String numConta = scanner.nextLine();
        System.out.print("Senha: ");
        int senha = Integer.parseInt(scanner.nextLine());

        Conta conta = banco.autenticar(numConta, senha);
        if (conta != null) {
            menuContaLogada(conta);
        } else {
            System.out.println("Número ou senha incorretos.");
        }
    }

    private void menuContaLogada(Conta conta) {
        int opcao;
        do {
            System.out.println("\n Menu da Conta - " + conta.getTitular());
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> System.out.println("Saldo: R$ " + conta.getSaldo());
                case 2 -> realizarTransferencia(conta);
                case 0 -> System.out.println("Saindo da conta...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void realizarDeposito() {
        System.out.print("Número da conta: ");
        String numConta = scanner.nextLine();
        Conta conta = banco.buscarPorNumero(numConta);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }
        System.out.print("Valor a depositar: ");
        double valor = Double.parseDouble(scanner.nextLine());
        try {
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void realizarTransferencia(Conta origem) {
        System.out.print("Número da conta de destino: ");
        String numContaDestino = scanner.nextLine();
        Conta destino = banco.buscarPorNumero(numContaDestino);
        if (destino == null || destino == origem) {
            System.out.println("Conta de destino inválida.");
            return;
        }

        System.out.print("Valor a transferir: ");
        double valor = Double.parseDouble(scanner.nextLine());

        if (origem.transferirPara(destino, valor)) {
            System.out.println("Transferência concluída com sucesso.");
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente.");
        }
    }
}
