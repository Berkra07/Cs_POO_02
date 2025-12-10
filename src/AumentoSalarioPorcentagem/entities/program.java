package AumentoSalarioPorcentagem.entities;

import AumentoSalarioPorcentagem.application.Employee;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Digite o nome do funcionario");
        employee.name =sc.nextLine();

        System.out.print("Digite o Salario bruto:");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Digite  o valor dos impostos");
        employee.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + employee.name + ", $ " + employee.NetSalary());

        System.out.println();

        System.out.print("Which percentagge to increase salary?");
        double percent = sc.nextDouble();

        employee.IncreaseSalary(percent);

        System.out.println();
        System.out.print("Update data : " + employee.name + ", $ " + employee.NetSalary());
    }
}
