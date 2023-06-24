
public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();

        diego.setName("Diego");
        diego.setDocumentId("37450340");
        diego.setSalary(2000);
        diego.setBonus(10);

        System.out.println(diego.getSalary());

        Gerente andres = new Gerente("dieguitoMaradona");

        andres.setSalary(5000);
        andres.setBonus(andres.getSalary());

        System.out.println(andres.getSalary());

        andres.setName("andy rivera");

        if (andres.login("dieguitoMaradona")) {
            System.out.println("Bienvenido " + andres.getName());
        } else {
            System.out.println("Verifique los datos de ingreso");
        }
    }
}