package exerciciosCursoUdemy.POO.employee;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSal = sc.nextDouble();

        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee emp = new Employee(name, grossSal, tax);
        System.out.println("\nEmployee: " + emp);

        System.out.println("Which percentage to increase salary? ");
        double increase = sc.nextDouble();
        emp.increaseSalary(increase);

        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
