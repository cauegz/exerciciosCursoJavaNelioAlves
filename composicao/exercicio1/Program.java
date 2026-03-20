package exerciciosCursoUdemy.composicao.exercicio1;

import exerciciosCursoUdemy.composicao.exercicio1.entities.Departament;
import exerciciosCursoUdemy.composicao.exercicio1.entities.HourContract;
import exerciciosCursoUdemy.composicao.exercicio1.entities.Worker;
import exerciciosCursoUdemy.composicao.exercicio1.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter departament´s name: ");
        Departament dep = new Departament(sc.nextLine());

        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();

        System.out.print("Level: ");
        String stringLevelWorker = sc.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(stringLevelWorker);

        System.out.print("Base salary: ");
        double baseSal = sc.nextDouble();

        System.out.print("How many contracts to this worker? ");
        int numCont = sc.nextInt();
        sc.nextLine();

        List<HourContract> contracts = new ArrayList<>();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < numCont; i++) {
            System.out.println("Enter contract #"+(i+1)+" data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String stringDate = sc.nextLine();
            LocalDate dateContract = LocalDate.parse(stringDate, formatter1);

            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract c = new HourContract(dateContract, valueHour, hours);
            contracts.add(c);
        }

        Worker worker = new Worker(nameWorker, workerLevel, baseSal, dep, contracts);
        System.out.println();

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String stringDate = sc.nextLine();
        LocalDate dateIncome = LocalDate.parse("01/" + stringDate, formatter1);
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for "+ dateIncome.format(formatter2) + ": " + worker.income(dateIncome.getYear(), dateIncome.getMonthValue()));
        sc.close();
    }
}
