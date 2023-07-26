package com.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.Model.Cliente;
import com.Model.Cuenta;
import com.Model.CuentaAhorros;

public class SortTest {

    public static void main(String[] args) {

        Cuenta cc = new CuentaAhorros(22, 5);
        Cliente clientecc = new Cliente();
        clientecc.setNombre("Diego");
        cc.setTitular(clientecc);
        cc.deposita(111);

        Cuenta cc2 = new CuentaAhorros(22, 22);
        Cliente clientecc2 = new Cliente();
        clientecc2.setNombre("renato");
        cc2.setTitular(clientecc2);
        cc2.deposita(111);

        Cuenta cc3 = new CuentaAhorros(22, 7);
        Cliente clientecc3 = new Cliente();
        clientecc3.setNombre("alfredo");
        cc3.setTitular(clientecc3);
        cc3.deposita(111);

        Cuenta cc4 = new CuentaAhorros(22, 4);
        Cliente clientecc4 = new Cliente();
        clientecc4.setNombre("joge");
        cc4.setTitular(clientecc4);
        cc4.deposita(111);

        List<Cuenta> lista = new ArrayList<Cuenta>();
        // se agregan objetos a la lista
        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Lista normal");
        // imprime la lista original
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta.getNumero());
        }
        // implementa el sort
        Comparator<Cuenta> orden = new OrdenNumeroCuenta();
        lista.sort(orden);

        // implementacion de verificacion
        System.out.println("/////// \n Lista ordenada");

        ArrayList<Integer> verificador = new ArrayList<Integer>();

        for (Cuenta cuenta : lista) {
            verificador.add(cuenta.getNumero());
        }

        boolean verificado = false;
        for (int i = 0; i < verificador.size() - 1; i++) {
            if (verificador.get(i) <= verificador.get(i + 1)) {
                verificado = true;
            } else {
                verificado = false;
            }
        }
        if (verificado) {
            System.out.println("lista ordenada correctamente");
            for (Cuenta cuenta : lista) {
                System.out.println(cuenta.getNumero());
            }
        }

        Comparator<Cuenta> titularName = new OrdenTitular();
        lista.sort(titularName);

        System.out.println("Lista comparada por nombres");

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta.getTitular().getNombre());
        }

    }

    public static class OrdenNumeroCuenta implements Comparator<Cuenta> {

        @Override
        public int compare(Cuenta o1, Cuenta o2) {

            // forma basica algortimo
            // if (o1.getNumero() == o2.getNumero()) {
            // return 0;
            // } else if (o1.getNumero() > o2.getNumero()) {
            // return 1;
            // } else {
            // return -1;
            // }'

            // forma intermedia resta
            // return o1.getNumero() - o2.getNumero();

            // forma wrapper metodo Integer.compare()
            return Integer.compare(o1.getNumero(), o2.getNumero());
        }

    }

    public static class OrdenTitular implements Comparator<Cuenta> {

        @Override
        public int compare(Cuenta o1, Cuenta o2) {
            return o1.getTitular().getNombre().compareToIgnoreCase(o2.getTitular().getNombre());
        }

    }
}
