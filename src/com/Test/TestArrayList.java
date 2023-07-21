package com.Test;

import java.util.ArrayList;

import com.Model.*;

public class TestArrayList {

    public static void main(String[] args) {
        // <> fuerza a que acepte un solo tipo de objeto, ayuda a la manipulacion y
        // manejo de los metodos
        ArrayList<Cuenta> list = new ArrayList<>();

        Cuenta cc = new CuentaCorriente(1, 2);
        Cuenta cc2 = new CuentaCorriente(1, 5);

        list.add(cc);
        list.add(cc2);

        cc2.deposita(500);

        // imprime el saldo de cada cuenta guardada en la lista
        for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSaldo());
        }

        // ejemplo en foreach
        int count = 1;
        for (Cuenta cuenta : list) {

            System.out.println("cuenta de " + count);
            System.out.println(cuenta.getSaldo());
            count++;
        }
    }
}
