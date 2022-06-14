package intermediate.Kthreads.domain;

public class Account {
    private int balance = 50;


    public void withdrawal(int amount){
        this.balance = balance-amount;
    }

    public int getBalance() {
        return balance;
    }
}
