package com.Model;

public class Gerente extends Funcionario implements Autenticable {

    private String passWord;

    @Override
    public double getBonus() {
        return this.getSalary();
    }

    @Override
    public void setPass(String pass) {
        this.passWord = pass;
    }

    @Override
    public boolean login(String pass) {
        boolean verified = false;
        if (this.passWord == pass) {
            verified = true;
        }
        return verified;
    }
}
