package org.example;

 class ContaCorrente extends ContaBancaria{
     private double limiteChequeEspecial;

     public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
         super(numeroConta, titular, saldo);
         this.limiteChequeEspecial = limiteChequeEspecial;
     }

     @Override
     void sacar(double valor) {
        if(valor < saldo + limiteChequeEspecial){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente, incluindo o limite do cheque especial.");
        }
     }

 }
