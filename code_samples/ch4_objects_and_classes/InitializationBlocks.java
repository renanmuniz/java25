package ch4_objects_and_classes;

public class InitializationBlocks {
    private double balance = 1.0;
    private String accountNumber;

    {
        IO.println("Initialization block called");
        IO.println("Balance before initialization block set the value: " + balance);
        balance = 100.0;
        IO.println("Balance after initialization block set the value: " + balance);
    }

    public InitializationBlocks(String accountNumber) {
        IO.println("Constructor called");
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
