package exerciciosCursoUdemy.classesAbstratas.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double anualRent, Double healthExpenditures) {
        super(name, anualRent);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double calculateTax() {
        double abat = 0;
        if(healthExpenditures > 0){
            abat = healthExpenditures * 0.5;
        }
        if(super.getAnualRent() < 20000.00){
            return (getAnualRent() * 0.15) - abat;
        } else {
            return (getAnualRent() * 0.25) - abat;
        }
    }
}
