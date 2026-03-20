package exerciciosCursoUdemy.POO.student;

import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        int g3 = sc.nextInt();

        Student std = new Student(name, g1, g2, g3);
        System.out.println("FINAL GRADE = " + std.finalGrade());

        if(std.isAproved()){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING "+std.missingPoints()+" POINTS");
        }

        sc.close();
    }
}
