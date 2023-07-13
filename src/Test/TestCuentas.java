public class TestCuentas {
    public static void main(String[] args) {
        CuentaAhorros ahorroSergio = new CuentaAhorros(2, 7);
        CuentaCorriente corrienteClara = new CuentaCorriente(332, 34);

        ahorroSergio.deposita(50000);
        corrienteClara.deposita(6000);
        corrienteClara.transfiere(1000, ahorroSergio);
        System.out.println("Sergio :" + ahorroSergio.getSaldo() + " clara: " + corrienteClara.getSaldo());
    }
}
