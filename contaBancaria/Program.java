package exerciciosCursoUdemy.contaBancaria.application;

import exerciciosCursoUdemy.contaBancaria.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String acNumber = sc.nextLine();

        System.out.print("Enter account holder: ");
        String acHolder = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char res = sc.next().charAt(0);

        Account ac;

        if(res == 'y' || res == 'Y'){
            System.out.print("Enter the initial deposit value: ");
            double iniDep = sc.nextDouble();
            ac = new Account(acNumber, acHolder, iniDep);
        } else {
            ac = new Account(acNumber, acHolder);
        }
        System.out.println("\nAccount data: \n" + ac);

        System.out.print("\nEnter a deposit value: ");
        double dep = sc.nextDouble();
        ac.deposit(dep);
        System.out.println("Updated account data: \n" + ac);

        System.out.print("\nEnter a withdraw value: ");
        double with = sc.nextDouble();
        ac.withdraw(with);
        System.out.println("Updated account data: \n" + ac);
    }
}
