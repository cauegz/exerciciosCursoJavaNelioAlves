package exerciciosCursoUdemy.vetores.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contN = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        while(n<0 || n>10){
            System.out.print("Numero inválido, digite novamente: ");
            n = sc.nextInt();
        }

        int[] vect = new int[n];
        int[] negVect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if(vect[i]<0){
                negVect[contN] = vect[i];
                contN++;
            }
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < negVect.length; i++) {
            if (negVect[i] != 0){
                System.out.println(negVect[i]);
            }
        }

        sc.close();
    }
}
