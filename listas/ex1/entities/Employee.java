package exerciciosCursoUdemy.listas.ex1.entities;

public class Employee {
    private final int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increase(double percentage){
        this.salary += (salary/100) * percentage;
    }

    @Override
    public String toString(){
        return id + ", " + name + ", " + salary;
    }
}
