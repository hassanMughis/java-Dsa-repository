import java.util.Scanner;

public class bank {

    static class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        // Constructor to initialize account details
        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            balance = initialBalance;
        }

        // Method to credit the account
        public void credit(double amount) {
            balance += amount;
        }

        // Method to display account information
        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input account details for Account 1
            System.out.print("Enter account number for Account 1: ");
            String accNumber1 = scanner.nextLine();

            System.out.print("Enter account holder's name for Account 1: ");
            String accHolderName1 = scanner.nextLine();

            System.out.print("Enter initial balance for Account 1: ");
            double initialBalance1 = scanner.nextDouble();
             // Consume newline character
            scanner.nextLine();
            // Create Account 1
            BankAccount account1 = new BankAccount(accNumber1, accHolderName1, initialBalance1);

            // Input account details for Account 2
            System.out.print("Enter account number for Account 2: ");
            String accNumber2 = scanner.nextLine();

            System.out.print("Enter account holder's name for Account 2: ");
            String accHolderName2 = scanner.nextLine();

            System.out.print("Enter initial balance for Account 2: ");
            double initialBalance2 = scanner.nextDouble();
            // Consume newline character
            scanner.nextLine();
            // Create Account 2
            BankAccount account2 = new BankAccount(accNumber2, accHolderName2, initialBalance2);

            // Input account details for Account 3
            System.out.print("Enter account number for Account 3: ");
            String accNumber3 = scanner.nextLine();
            System.out.print("Enter account holder's name for Account 3: ");
            String accHolderName3 = scanner.nextLine();
            System.out.print("Enter initial balance for Account 3: ");
            double initialBalance3 = scanner.nextDouble();
            // Create Account 3
            BankAccount account3 = new BankAccount(accNumber3, accHolderName3, initialBalance3);

            // Credit amounts to accounts
            System.out.print("\nEnter an amount to credit Account 1: ");
            double creditAmount1 = scanner.nextDouble();
            account1.credit(creditAmount1);
            System.out.print("\nEnter an amount to credit Account 2: ");
            double creditAmount2 = scanner.nextDouble();
            account2.credit(creditAmount2);
            System.out.print("\nEnter an amount to credit Account 3: ");
            double creditAmount3 = scanner.nextDouble();
            account3.credit(creditAmount3);



            // Display account information
            System.out.println("\nAccount Details:");
            account1.displayAccountInfo();
            account2.displayAccountInfo();
            account3.displayAccountInfo();

            scanner.close();
        }
    }


}
