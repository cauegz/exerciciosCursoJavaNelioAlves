package exerciciosCursoUdemy.composicao.exercicio1.entities;

import exerciciosCursoUdemy.composicao.exercicio1.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    //atributos básicos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //associações
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament, List<HourContract> contracts) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;

        for(HourContract c : contracts){
            if(c.getDate().getMonthValue() == month && c.getDate().getYear() == year){
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
