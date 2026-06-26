package ch4_objects_and_classes;

public class AccountTest {
    void main() {
        Account account0 = new Account();
        Account account1 = new Account("12345", 1_000.0);
        Account account2 = new Account("67890", 5_000_000.0, true);
        Account account3 = new Account(null, true);

        IO.println(account0.getAccountNumber() + " has balance: " + account0.getBalance() + " and premium status: " + account0.isPremium());
        IO.println(account1.getAccountNumber() + " has balance: " + account1.getBalance() + " and premium status: " + account1.isPremium());
        IO.println(account2.getAccountNumber() + " has balance: " + account2.getBalance() + " and premium status: " + account2.isPremium());
        IO.println(account3.getAccountNumber() + " has balance: " + account3.getBalance() + " and premium status: " + account2.isPremium());
    }
}
