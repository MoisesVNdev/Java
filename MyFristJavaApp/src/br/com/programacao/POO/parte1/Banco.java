package br.com.programacao.POO.parte1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) return conta;
        }
        return null;
    }

    public Conta autenticar(int numero, int senha) {
        Conta conta = buscarPorNumero(numero);
        if (conta != null && conta.getSenha() == senha) return conta;
        return null;
    }

    public void listarContas() {
        System.out.println("\n📋 Contas cadastradas:");
        for (Conta conta : contas) {
            conta.mostrarDados2();
        }
    }
}
