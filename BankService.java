class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Show balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankService {
    public static void main(String[] args) {
        // Create account with initial balance
        BankAccount account = new BankAccount(20000);

        // Perform simple operations
        account.showBalance();
        account.deposit(12000);
        account.withdraw(6000);
        account.showBalance();
    }
}
