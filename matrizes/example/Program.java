package exerciciosCursoUdemy.matrizes.example;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == i){
                    System.out.print(mat[i][j]);
                } else {
                    System.out.print("\t");
                }
                if(mat[i][j] < 0){
                    cont++;
                }
            }
            System.out.print("\n");
        }
        System.out.println("Quantity of negative numbers: " + cont);
        sc.close();
    }
}
