package com.Model;

public interface IAutenticable {
    public void setPass(String password);

    public boolean login(String password);
}
