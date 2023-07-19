package com.Model;

public class ControlBonus {
    private double suma;

    public void registrar(Funcionario funcionario) {
        this.suma += funcionario.getBonus();
    }

    public double getSuma() {
        return this.suma;
    }
}
