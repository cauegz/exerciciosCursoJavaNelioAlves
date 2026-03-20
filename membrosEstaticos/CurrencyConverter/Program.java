package exerciciosCursoUdemy.membrosEstaticos.CurrencyConverter;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convert(dPrice, dollars));
        sc.close();
    }
}
