package tdd;

public class Account {

    private int balance;

    public void deposit(int amount) {
       this.balance = balance + amount;
    }

    public int checkBalance() {
        return balance;
    }
}
