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
            balance = balance - amount;
        }
    }

    public void transferTo(OpeAccount account, double amount) {
        if (amount <= balance) {
            withdraw(amount);
            account.deposit(amount);
            balance = balance + amount;
            System.out.printf("Transfer is succesful transfer amount is %f", account.getBalance());
        } else {
            System.out.println("Transfer unsuccesful invalid balance");
        }

    }
}


