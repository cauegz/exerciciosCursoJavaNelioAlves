package exerciciosCursoUdemy.contaBancaria.entities;

public class Account {
    private final String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public Account(String accountNumber, String name, double initialDep) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDep);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double money){
        this.balance -= money + 5;
    }

    public void deposit(double money){
        this.balance += money;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber +
                ", Holder: " + name +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
