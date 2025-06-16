package model;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(int number, String holder) {
        super(number, holder);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}
