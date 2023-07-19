package com.Model;

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;
    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setPass(String password) {
        this.password = password;
    }

    @Override
    public boolean login(String password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}