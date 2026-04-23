package exerciciosCursoUdemy.classesAbstratas.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualRent;

    public TaxPayer(String name, Double anualRent) {
        this.name = name;
        this.anualRent = anualRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualRent() {
        return anualRent;
    }

    public void setAnualRent(Double anualRent) {
        this.anualRent = anualRent;
    }

    public abstract Double calculateTax();
}
