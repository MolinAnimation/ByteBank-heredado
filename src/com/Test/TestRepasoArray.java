package com.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
    public static void main(String[] args) {

        int numero = 40;
        Integer numeroObjeto = Integer.valueOf(40);
        // array
        int numeros[] = new int[10];

        // lArrayist
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(numero);
        lista.add(Integer.valueOf(numero));
        lista.add(numeroObjeto);

        // unboxing
        int valorPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        // linkedList
    }

}
