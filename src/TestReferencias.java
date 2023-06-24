public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("pass");
        funcionario.setName("diego");

        Gerente gerente = new Gerente("pass");
        gerente.setName("Jimena");

        funcionario.setSalary(2000);
        gerente.setSalary(10000);

    }
}
