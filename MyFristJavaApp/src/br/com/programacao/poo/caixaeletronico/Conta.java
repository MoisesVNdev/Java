package br.com.programacao.poo.caixaeletronico;

public class Conta {
    private final String numConta;
    private final String titular;
    private double saldo;
    private final int senha;

    private static int geradorNumConta = 1;

    public Conta(String titular, int senha) {
        this.numConta = "00" + geradorNumConta++;
        this.titular = titular;
        this.saldo = saldo + 1000.00;
        this.senha = senha;

    }

    public String getNumConta() {
        return numConta;
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
        System.out.println("Conta: " + titular + " | Nº: " + numConta + " | Saldo: R$ " + saldo + " | Senha: " + senha);
    }
    public void mostrarDados2() {
        System.out.printf("%-5s  %-20s | %-3s  %-3s | %-6s  %-6.2f | %-6s  %-3d\n",
                "Conta", titular,
                "Nº: ", numConta,
                "Saldo:", saldo,
                "Senha:", senha);
    }



}
