package tobiAssesement;

public class TobiAccount {
    private double balance;
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
    if (amount <= balance) {
        balance = balance - amount;
    }else if (amount > balance) {
        System.out.println("Insufficient balance");
    }
    }

    public void transferTo(TobiAccount zenithAccount,double amount ) {
            if(amount <= balance) {
                withdraw(amount);
                zenithAccount.deposit(amount);
                balance += amount;
                System.out.printf("Transaction successful transfer amount is %f",zenithAccount.getBalance());
            }else if(amount > balance) {
                System.out.println("Transaction unsuccessful invalid balance");
            }
    }
}

