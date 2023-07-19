package com.Test;

import com.Model.Cuenta;
import com.Model.CuentaAhorros;

public class TestCuentaException {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 446);
        cuenta.deposita(200);
        cuenta.saca(210);
    }

}
