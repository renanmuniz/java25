package ch4_objects_and_classes;

import java.util.UUID;

public class Account {
    private String accountNumber;
    private double balance;
    private boolean premium;

    public Account() {
        this.accountNumber = null;
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber, double balance, boolean premium) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.premium = premium;
    }

    public Account(String accountNumber, boolean premium) {
        this(null == accountNumber ? UUID.randomUUID().toString() : accountNumber, 0.0, premium);
    }


    //Bad Practice for parameter names:
//    public Account(String an, double b, boolean p) {
//        accountNumber = an;
//        balance = b;
//        premium = p;
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
