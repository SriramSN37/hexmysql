package JAVA.Abs;
// Task 1: Abstract Bank Class
abstract class BankAccount {
    protected double balance;

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double calculateInterest();

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Task 2: Saving Account Class
class SavingAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // 5% interest rate for saving account

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

// Task 3: Current Account Class
class CurrentAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    @Override
    public double calculateInterest() {
        return 0; // Current account typically does not earn interest
    }
}

// Task 4: Testing
public class mam {
    public static void main(String[] args) {
        // Testing SavingAccount
        System.out.println("Testing SavingAccount:");
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(1000);
        savingAccount.displayBalance();
        savingAccount.withdraw(500);
        savingAccount.displayBalance();
        System.out.println("Interest Earned: $" + savingAccount.calculateInterest());

        // Testing CurrentAccount
        System.out.println("\nTesting CurrentAccount:");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.displayBalance();
        currentAccount.withdraw(1000);
        currentAccount.displayBalance();
        System.out.println("Interest Earned: $" + currentAccount.calculateInterest());
    }
}

