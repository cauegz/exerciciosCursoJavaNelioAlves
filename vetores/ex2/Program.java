package exerciciosCursoUdemy.vetores.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double sum = 0;
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.println();
        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f  ", vect[i]);
            sum += vect[i];
        }
        System.out.printf("\nSOMA = %.1f", sum);
        System.out.printf("\nMEDIA = %.1f", sum / n);

        sc.close();
    }
}
