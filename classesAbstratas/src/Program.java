package exerciciosCursoUdemy.classesAbstratas.src;

import exerciciosCursoUdemy.classesAbstratas.entities.Company;
import exerciciosCursoUdemy.classesAbstratas.entities.Individual;
import exerciciosCursoUdemy.classesAbstratas.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();

        for (int i = 0; i < taxPayers; i++) {
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c): ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(resp == 'c'){
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            } else {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name, anualIncome, health));
            }
        }
        System.out.println("\nTAXES PAID:");
        double totalTax = 0.0;
        for (TaxPayer tax : list){
            double yearTax = tax.calculateTax();
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", yearTax));
            totalTax += yearTax;
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", totalTax);

        sc.close();
    }
}
