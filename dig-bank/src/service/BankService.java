package service;

import model.BankAccount;

public class BankService {
    public static void printAccountSummary(BankAccount account) {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", account.getHolder(), account.getBalance());
    }
}
