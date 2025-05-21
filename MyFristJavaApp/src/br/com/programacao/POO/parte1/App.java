package br.com.programacao.POO.parte1;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Contas de teste
        banco.adicionarConta(new Conta(123, "João", 1000.00, 321));
        banco.adicionarConta(new Conta(456, "Maria", 1500.00, 654));
        banco.adicionarConta(new Conta(789, "Carlos", 2000.00, 987));

        CaixaEletronico caixa = new CaixaEletronico(banco);
        caixa.exibirMenuPrincipal();
    }
}
