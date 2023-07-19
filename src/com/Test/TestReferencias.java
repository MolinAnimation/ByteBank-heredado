package com.Test;

import com.Model.*;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setName("diego");

        Gerente gerente = new Gerente();
        gerente.setName("Jimena");

        funcionario.setSalary(2000);
        gerente.setSalary(10000);

        System.out.println();

    }
}
