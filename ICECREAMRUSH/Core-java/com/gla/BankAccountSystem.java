package com.gla;
public class BankAccountSystem {
    static class BankAccount {
        static String bankName = "GLA Bank";
        static int totalAccounts = 0;
        final String accountNumber;
        String accountHolderName;
        public BankAccount(String accountHolderName, String accountNumber) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            totalAccounts++;
        }
        public void displayDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Account Holder: " + accountHolderName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Bank Name: " + bankName);
            }
        }
        public static void getTotalAccounts() {
            System.out.println("Total Accounts: " + totalAccounts);
        }
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Amit", "12345");
        if (acc instanceof BankAccount) {
            acc.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }
} 