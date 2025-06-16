import model.BankAccount;
import model.CheckingAccount;
import model.SavingsAccount;
import service.BankService;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new CheckingAccount(1, "Alice");
        BankAccount account2 = new SavingsAccount(2, "Bob");

        account1.deposit(1000);
        account2.deposit(2000);

        account1.transfer(250, account2);

        BankService.printAccountSummary(account1);
        BankService.printAccountSummary(account2);
    }
}
