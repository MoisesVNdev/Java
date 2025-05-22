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
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> acessarConta();
                case 2 -> banco.listarContas();
                case 3 -> realizarDeposito();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    private void acessarConta() {
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Senha: ");
        int senha = scanner.nextInt();

        Conta conta = banco.autenticar(numero, senha);
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
            opcao = scanner.nextInt();

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
        int numero = scanner.nextInt();
        Conta conta = banco.buscarPorNumero(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }
        System.out.print("Valor a depositar: ");
        double valor = scanner.nextDouble();
        try {
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void realizarTransferencia(Conta origem) {
        System.out.print("Número da conta de destino: ");
        int numeroDestino = scanner.nextInt();
        Conta destino = banco.buscarPorNumero(numeroDestino);
        if (destino == null || destino == origem) {
            System.out.println("Conta de destino inválida.");
            return;
        }

        System.out.print("Valor a transferir: ");
        double valor = scanner.nextDouble();

        if (origem.transferirPara(destino, valor)) {
            System.out.println("Transferência concluída com sucesso.");
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente.");
        }
    }
}
