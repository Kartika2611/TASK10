package taskq10;
import java.util.Scanner;

public class Account {
	
	private int AC;
	private double balance;

    // No-argument constructor
    public Account() {
    }

    // Two-argument constructor
    public Account(double initialBalance,int Ac) {
        this.balance = initialBalance;
        this.AC=AC;
    }

    // Method to deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Main method
    public static void main(String[] args) {
        // Create an account object using the no-argument constructor
        Account account1 = new Account();
        Account account2 = new Account(1000.0, 9825617);
        // Deposit 1200
        account1.deposit(1200.0);

        // Withdraw 200
        account2.withdraw(200.0);

        // Printing balance
        System.out.println("Account 1 balance: " + account1.balance);
        
        System.out.println("Account 2 balance: " + account2.balance);
    }
}