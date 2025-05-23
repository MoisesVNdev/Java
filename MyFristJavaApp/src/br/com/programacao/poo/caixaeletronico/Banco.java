package br.com.programacao.poo.caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarPorNumero(String numConta) {
        for (Conta conta : contas) {
            if (conta.getNumConta().equals(numConta)) return conta;
        }
        return null;
    }

    public Conta autenticar(String numConta, int senha) {
        Conta conta = buscarPorNumero(numConta);
        if (conta != null && conta.getSenha() == senha) return conta;
        return null;
    }

    public void listarContas() {
        System.out.println("\n Contas cadastradas:");
        for (Conta conta : contas) {
            conta.mostrarDados();
        }
    }
}
