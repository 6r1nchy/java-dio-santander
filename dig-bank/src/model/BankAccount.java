package model;

public abstract class BankAccount {
    protected int number;
    protected String holder;
    protected double balance;

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    public void transfer(double amount, BankAccount destination) {
        this.withdraw(amount);
        destination.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}
