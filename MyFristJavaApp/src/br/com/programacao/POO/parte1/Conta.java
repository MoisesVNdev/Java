package br.com.programacao.POO.parte1;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private int senha;

    public Conta(int numero, String titular, double saldo, int senha) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirPara(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void mostrarDados() {
        System.out.println("Conta: " + titular + " | Nº: " + numero + " | Saldo: R$ " + saldo + " | Senha: " + senha);
    }
    public void mostrarDados2() {
        System.out.printf("%-5s  %-10s | %-3s  %-3s | %-6s  %-6.2f | %-6s  %-3d\n",
                "Conta", titular,
                "Nº: ", numero,
                "Saldo:", saldo,
                "Senha:", senha);
    }



}
