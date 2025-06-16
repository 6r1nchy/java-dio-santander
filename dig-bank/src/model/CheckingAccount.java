package model;

public class CheckingAccount extends BankAccount {
    private static final double OPERATION_FEE = 1.0;

    public CheckingAccount(int number, String holder) {
        super(number, holder);
    }

    @Override
    public void withdraw(double amount) {
        balance -= (amount + OPERATION_FEE);
    }

    @Override
    public void deposit(double amount) {
        balance += (amount - OPERATION_FEE);
    }
}
