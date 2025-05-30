package chapter_3;

import java.util.Scanner;

// Account class
class Account {
    private double balance;

    // Constructor
    public Account(double initialBalance) {
        balance = (initialBalance > 0.0) ? initialBalance : 0.0;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }
}

// Test class
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create two accounts
        Account account1 = new Account(100.00);
        Account account2 = new Account(0.00);

        // Show initial balances
        printBalance("account1", account1);
        printBalance("account2", account2);

        // Deposit to account1
        System.out.print("Enter deposit for account1: ");
        account1.deposit(input.nextDouble());

        // Deposit to account2
        System.out.print("Enter deposit for account2: ");
        account2.deposit(input.nextDouble());

        // Show final balances
        printBalance("account1", account1);
        printBalance("account2", account2);
    }

    // Helper method to print balance
    private static void printBalance(String name, Account account) {
        System.out.printf("%s balance: Tk%.2f%n", name, account.getBalance());
    }
}
