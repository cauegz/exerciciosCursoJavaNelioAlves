package exerciciosCursoUdemy.vetores.exPenionato;

import exerciciosCursoUdemy.vetores.exPenionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        System.out.println();

        for (int i = 0; i < rooms; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            System.out.println();

            rents[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rents.length; i++) {
            if(rents[i] != null){
                System.out.println(rents[i]);
            }
        }

        sc.close();
    }
}
