README.txt
# Basic Banking System in Java

## Introduction
A simple Java application simulating a basic banking system. It allows the user to deposit money, withdraw money, and check the account balance.

## Features
- Create a new bank account with an initial balance.
- Deposit money into the account.
- Withdraw money from the account.
- Check the current balance.
- Simple console-based user interface.

## How to Compile and Run
1. Compile the Java files:
2. Run the banking system application:
3. Follow the on-screen instructions to interact with the banking system.

## Example Usage
- Choose an option: `1` (for deposit)
- Enter the amount to deposit: `1000`
- Choose an option: `3` (to check balance)
- Current balance: `1000.0`



BankAccount.java

  public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}


BankSystem.java
  import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("Welcome to the Bank!");

        while (true) {
            System.out.println("Choose an option: (1) Deposit (2) Withdraw (3) Balance (4) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
