package org.example;

abstract class ContaBancaria {
    private int numeroConta;
    private String titular;
    double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
}

void depositar(double valor){
    saldo += valor;
    }

abstract void sacar(double valor);

void exibirInformacoes(){
    System.out.println(" Conta: " + this.numeroConta +  " Titular: " + this.titular + "  Saldo: " + this.saldo);
}

}
