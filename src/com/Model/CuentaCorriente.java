package com.Model;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);

    }

    @Override
    public void saca(double valor) {
        double retiro = valor + 0.2;
        super.saca(retiro);
    }
}
