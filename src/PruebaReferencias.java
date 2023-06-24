public class PruebaReferencias {
    public static void main(String[] args) {
        Funcionario andres = new Gerente("pass");
        EditorVideo juan = new EditorVideo();
        Designer diseniador = new Designer();

        andres.setSalary(1000);
        juan.setSalary(2000);
        diseniador.setSalary(500);

        andres.setBonus();
        juan.setBonus();
        diseniador.setBonus();

        System.out.println(andres.getSalary());
        System.out.println(juan.getSalary());
        System.out.println(diseniador.getSalary());

    }
}
