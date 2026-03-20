package exerciciosCursoUdemy.listas.ex1;

import exerciciosCursoUdemy.listas.ex1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmp = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int emp = sc.nextInt();
        System.out.println();
        for (int i = 0; i < emp; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            for(Employee key : listEmp){
                while(id == key.getId()){
                    System.out.print("Id already exists, type again: ");
                    id = sc.nextInt();
                }
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            listEmp.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idInc = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();
        Employee increase = listEmp.stream().filter(x -> x.getId() == idInc).findAny().orElse(null);
        if(increase != null){
            increase.increase(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee key : listEmp){
            System.out.println(key);
        }
        sc.close();
    }
}
