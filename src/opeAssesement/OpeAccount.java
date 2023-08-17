package opeAssesement;

public class OpeAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
        } else if (amount > balance) {
            System.out.println("insufficient amount");
        }
    }

    public void transfer(double transferAmount) {
        balance -= transferAmount;

    }
}
