package br.com.programacao.poo.caixaeletronico;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Contas de teste
        banco.adicionarConta(new Conta( "Seu Creysson",321));
        banco.adicionarConta(new Conta( "Chicória Maria",654));
        banco.adicionarConta(new Conta( "Alencastro Ramalhete",987));

        CaixaEletronico caixa = new CaixaEletronico(banco);
        caixa.exibirMenuPrincipal();
    }
}
