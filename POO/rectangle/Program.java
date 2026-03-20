package exerciciosCursoUdemy.POO.rectangle;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rectangle width and height:");
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        Rectangle rg = new Rectangle(w, h);

        System.out.printf("AREA = %.2f\n",rg.area());
        System.out.printf("PERIMETER = %.2f\n", rg.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rg.diagonal());

        sc.close();
    }
}
