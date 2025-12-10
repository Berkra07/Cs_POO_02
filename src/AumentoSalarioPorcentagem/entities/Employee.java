package AumentoSalarioPorcentagem.entities;

public class Employee {

    //Atributos da classe

    public String name;
    public double grossSalary;
    public double tax;

    //Métodos da classe

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        this.grossSalary += this.grossSalary * percentage / 100;
    }
}
