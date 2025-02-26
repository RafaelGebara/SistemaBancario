package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);

    }
    @Override
    void sacar(double valor) {
        double taxa = valor * 0.05;
        if (saldo - (valor + taxa) >= 10000) {
            saldo -= (valor + taxa);
        } else {
            System.out.println("Saldo insuficiente ou abaixo do mínimo permitido para saque.");
        }
    }
}
