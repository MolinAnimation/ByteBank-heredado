package com.Test;

import com.Model.CuentaCorriente;
import com.Model.GuardaCuentas;

public class TestGuardaCuentas {

    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();
        CuentaCorriente cc = new CuentaCorriente(10, 2);
        guardaCuentas.adicionar(cc);
        CuentaCorriente c2 = new CuentaCorriente(10, 2);
        guardaCuentas.adicionar(c2);
        System.out.println(guardaCuentas.obtener(1));

    }
}
