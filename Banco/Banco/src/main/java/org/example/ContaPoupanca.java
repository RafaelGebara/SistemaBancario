package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    void sacar(double valor) {
        if(valor > saldo){
        System.out.println("O saque não pode ser completado");
        }
    }
}
