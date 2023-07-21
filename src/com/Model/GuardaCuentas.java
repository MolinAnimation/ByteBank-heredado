package com.Model;

public class GuardaCuentas {
    public static int count = 0;

    // crear un objeto para guardar cuentas
    // permite agregar cuentas con un metodo
    // guardacuentas.adiciona(cuenta)
    // obtener, remover, etc.
    Cuenta cuenta[] = new Cuenta[10];

    public void adicionar(Cuenta cc) {
        cuenta[count] = cc;
        count++;
    }

    public Cuenta obtener(int index) {
        return cuenta[index];
    }

}
