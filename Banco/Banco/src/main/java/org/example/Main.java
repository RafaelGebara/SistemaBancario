package org.example;
public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(12345, "Rafael", 1000, 500);
        ContaBancaria cp = new ContaPoupanca(67890, "Maria", 1500);
        ContaBancaria ci = new ContaInvestimento(54321, "João", 2000);
        ContaBancaria cs = new ContaSalario(11111, "Carlos", 1200, 300);
        ContaBancaria ciar = new ContaInvestimentoAltoRisco(22222, "Ana", 15000);

        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        ciar.exibirInformacoes();

        System.out.println("\nTentando saques:");
        cc.sacar(1300);
        cp.sacar(1600);
        ci.sacar(1000);
        cs.sacar(500);
        cs.sacar(500);
        ciar.sacar(4000);

        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        ciar.exibirInformacoes();
    }
}
