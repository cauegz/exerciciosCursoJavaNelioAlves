package exerciciosCursoUdemy.vetores.example;

import exerciciosCursoUdemy.vetores.example.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new Product(price, name);
            sum += vect[i].getPrice();
        }

        System.out.printf("AVERAGE PRICE = %.2f\n", sum / (double)vect.length);

        sc.close();
    }
}
