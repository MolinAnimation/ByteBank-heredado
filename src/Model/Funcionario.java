public abstract class Funcionario {
    private String name;
    private String documentId;
    private double salary;
    public String password;

    public Funcionario() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus() {
        setSalary(this.getSalary() + this.getBonus());
    }

    public abstract double getBonus();
}