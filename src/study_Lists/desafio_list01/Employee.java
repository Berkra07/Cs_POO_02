package study_Lists.desafio_list01;

public class Employee {
    private Integer id;
    private Double salario;
    private String nome;

    public Employee(int id, double salario, String nome) {
        this.id = id;
        this.salario = salario;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
