package org.example;

public class ContaInvestimento extends ContaBancaria{
    private double taxa;
    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxa = taxa;
    }

    @Override
    void sacar(double valor) {
        double taxa = valor * 0.02;
        if(valor + taxa < saldo) {
            System.out.println("O valor do saque com a taxa nao pode ser completado.");

        }
    }
}
