package exerciciosCursoUdemy.vetores.ex3;

import exerciciosCursoUdemy.vetores.ex3.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double heightSum = 0.0;
        int minor16 = 0;

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
            heightSum += vect[i].getHeight();
            if(vect[i].getAge() < 16){
                minor16++;
            }
        }
        System.out.println();
        System.out.println("Altura média: " + String.format("%.2f" ,heightSum/n));
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + ((100.0 * (double)minor16)/(double)n) + "%");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
