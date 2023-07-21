package com.Test;

import com.Model.*;

public class TestGuardaObjetos {

    public static void main(String[] args) {

        Cuenta cc = new CuentaAhorros(1, 2);
        Funcionario ger = new Gerente();
        GuardaObjetos so = new GuardaObjetos();
        so.saveObject(cc);
        so.saveObject(ger);

        System.out.println(so.getObject(0));
        System.out.println(so.getObject(1));

        System.out.println(so.getObjectQuantity());
    }
}
