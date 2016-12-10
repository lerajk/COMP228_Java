/**
 * Created by da Vinci on 12/8/16.
 */

class Account {
    private Double balance;
    public Account(double initialDeposit) {
        balance = initialDeposit;
    }
    public double getBalance() {
       /* synchronized (balance)
        {

        } */
        return balance;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("After deposit balance is: "+balance);
    }
    public  synchronized void withdraw(double amount) {
        if ( balance >= amount ) { balance -= amount; }
    }
}
