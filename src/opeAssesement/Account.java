package opeAssesement;

public class Account {
    private double balance;


    public void deposit(double amount) {
        if (amount > 0){
          balance += amount;
        }else {
            System.out.println("Cannot deposit invalid amount oga");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(amount < balance){
            balance -= amount;
        }else{
            System.out.println("insufficient balance");
        }
    }
}
