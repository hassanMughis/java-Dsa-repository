class Bank {
    int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    int getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 2000;
    }
}

public class da_bank {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        // Call the getBalance method by the object of each of the three banks
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
