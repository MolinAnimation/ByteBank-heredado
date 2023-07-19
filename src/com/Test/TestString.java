package com.Test;

public class TestString {
    public static void main(String[] args) {

        String nombre = "juan";

        System.out.println(nombre);
        String nombre2 = nombre.replace("j", "J");
        System.out.println(nombre2);

        nombre = nombre.replace("j", "J");
        System.out.println(nombre);

        StringBuilder builder = new StringBuilder("Ayuda");
        String texto = builder.toString();
        System.out.println(texto);

        System.out.println(print("hola"));
    }

    public static Object print(Object value) {
        return value;
    }

}
