package com.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.Model.*;

public class TestOrdenarLista {
    public static void main(String[] args) {
        // instancias de cuenta para pruebas
        Cuenta cc = new CuentaAhorros(22, 5);
        cc.deposita(111);
        Cuenta cc2 = new CuentaAhorros(22, 22);
        cc2.deposita(222);
        Cuenta cc3 = new CuentaAhorros(22, 7);
        cc3.deposita(333);
        Cuenta cc4 = new CuentaAhorros(22, 4);
        cc4.deposita(444);

        List<Cuenta> lista = new ArrayList<Cuenta>();
        // se agregan objetos a la lista
        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // ordenar las cuentas
        // sort espera cualquier cosa que extienda de Cuenta
        // lista.sort(c);

        // Comparator <? extend Cuenta> c

        // prueba de lista sin ordenar
        System.out.println("Lista sin ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta.getNumero());
        }
        // instancia el comparador
        Comparator<Cuenta> comparador = new Ordenador();
        // llama al metodo sort
        lista.sort(comparador);
        System.out.println("//////////");

        ArrayList<Integer> prueba = new ArrayList<Integer>();

        // prueba de la lista ordenada
        for (Cuenta cuenta : lista) {
            prueba.add(cuenta.getNumero());
        }

        // verificacion de ordenamiento
        boolean ordenCorrecto = false;
        for (var i = 0; i < prueba.size() - 1; i++) {

            if (prueba.get(i) < prueba.get(i + 1)) {
                ordenCorrecto = true;
            }
        }
        // si la lista se ordeno de manera correcta la imprime y muestra el mensaje de
        // exito
        if (ordenCorrecto) {
            for (Cuenta cuenta : lista) {
                System.out.println(cuenta.getNumero());
            }
            System.out.println("Orden exitoso");
        } else {
            System.out.println("algo fallo");
        }

    }

    // clase que odena
    public static class Ordenador implements Comparator<Cuenta> {

        @Override
        public int compare(Cuenta o1, Cuenta o2) {
            if (o1.getNumero() == o2.getNumero()) {
                return 0;
            } else if (o1.getNumero() > o2.getNumero()) {
                return 1;
            } else {
                return -1;
            }

        }

    }
}
