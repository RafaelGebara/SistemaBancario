package org.example;

public class ContaSalario extends ContaCorrente{
    private int saquesGratis = 1;
    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratis = saquesGratis;
    }
    @Override
    void sacar(double valor) {
        if (saquesGratis > 0) {
            saquesGratis--;
            super.sacar(valor);
        } else {
            super.sacar(valor + 5.00);
        }
    }
}
