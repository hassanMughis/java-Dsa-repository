import java.util.Scanner;

public class Newbank {
    public static class Account {
        int accountNumber;
        String titleHolder;
        String bankName;
        int amount;

        public Account(int accNumber, String title, String bank, int initialAmount) {
            accountNumber = accNumber;
            titleHolder = title;
            bankName = bank;
            amount = initialAmount;
        }

        void display() {
            System.out.println("Account Details:");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Title Holder: " + titleHolder);
            System.out.println("Initial Amount: $" + amount);
        }

        static void menu() {
            System.out.println("Enter 1, 2, or 3 to select the following options:");
            System.out.println("1. View details");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
        }

        void viewDetails() {
            display();
        }

        void deposit(int depositAmount) {
            amount += depositAmount;
            System.out.println("Deposit successful.");
        }

        void withdraw(int withdrawAmount) {
            if (withdrawAmount > amount) {
                System.out.println("Insufficient funds. Withdrawal unsuccessful.");
            } else {
                amount -= withdrawAmount;
                System.out.println("Withdrawal successful.");
            }
        }
    }

    public static class CurrentAccount extends Account {
        int overdraftLimit;

        public CurrentAccount(int accNumber, String title, String bank, int initialAmount, int overdraft) {
            super(accNumber, title, bank, initialAmount);
            overdraftLimit = overdraft;
        }

        void display() {
            super.display();
            System.out.println("Overdraft Limit: $" + overdraftLimit);
        }

        void withdraw(int withdrawAmount) {
            int availableFunds = amount + overdraftLimit;
            if (withdrawAmount > availableFunds) {
                System.out.println("Withdrawal amount exceeds available funds including overdraft limit. Withdrawal unsuccessful.");
            } else {
                amount -= withdrawAmount;
                System.out.println("Withdrawal successful.");
            }
        }
    }


    public static class SavingsAccount extends Account {
        double interestRate;

        public SavingsAccount(int accNumber, String title, String bank, int initialAmount, double rate) {
            super(accNumber, title, bank, initialAmount);
            interestRate = rate;
        }

        void display() {
            super.display();
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the account number:");
        int accNumber = scan.nextInt();
        scan.nextLine(); // Consume newline character  

        System.out.println("Enter the title holder:");
        String title1 = scan.nextLine();

        // Create a CurrentAccount object with an overdraft limit of $500
        CurrentAccount account1 = new CurrentAccount(123, "Hassan", "Current", 1000, 500);

        // Create a SavingsAccount object with an interest rate of 2.5%
        SavingsAccount account2 = new SavingsAccount(234, "billawal", "Savings", 2000, 2.5);

        // Create another SavingsAccount object with an interest rate of 3.0%
        SavingsAccount account3 = new SavingsAccount(345, "abdullah", "Savings", 3000, 3.0);

        Account.menu();

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                if (account1.accountNumber == accNumber && account1.titleHolder.equals(title1)) {
                    account1.display();
                } else if (account2.accountNumber == accNumber && account2.titleHolder.equals(title1)) {
                    account2.display();
                } else if (account3.accountNumber == accNumber && account3.titleHolder.equals(title1)) {
                    account3.display();
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 2:
                System.out.println("Enter the amount to deposit:");
                int depositAmount = scan.nextInt();
                if (account1.accountNumber == accNumber && account1.titleHolder.equals(title1)) {
                    account1.deposit(depositAmount);
                } else if (account2.accountNumber == accNumber && account2.titleHolder.equals(title1)) {
                    account2.deposit(depositAmount);
                } else if (account3.accountNumber == accNumber && account3.titleHolder.equals(title1)) {
                    account3.deposit(depositAmount);
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 3:
                System.out.println("Enter the amount to withdraw:");
                int withdrawAmount = scan.nextInt();
                if (account1.accountNumber == accNumber && account1.titleHolder.equals(title1)) {
                    account1.withdraw(withdrawAmount);
                } else if (account2.accountNumber == accNumber && account2.titleHolder.equals(title1)) {
                    account2.withdraw(withdrawAmount);
                } else if (account3.accountNumber == accNumber && account3.titleHolder.equals(title1)) {
                    account3.withdraw(withdrawAmount);
                } else {
                    System.out.println("Account not found.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scan.close();
    }

}
