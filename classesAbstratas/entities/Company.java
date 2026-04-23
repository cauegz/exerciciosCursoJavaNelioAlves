package exerciciosCursoUdemy.classesAbstratas.entities;

public class Company extends TaxPayer{
    private Integer employeeNumber;

    public Company(String name, Double anualRent, Integer employeeNumber) {
        super(name, anualRent);
        this.employeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public Double calculateTax() {
        double percTax = 0.16;
        if(employeeNumber > 10){
            percTax = 0.14;
        }
        return getAnualRent() * percTax;
    }
}
