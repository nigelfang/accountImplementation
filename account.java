public class Account
{
    private accountHolder holder;
    private double balance = 0.0;

    public account(double amt, accountHolder holder)
    {
        this.balance = amt;
        this.holder = holder;
    }
    public void deposit(double amt)
    {

    }
    public void withdraw(double amt)
    {
        
    }
    public double getBalance()
    {
        return balance;
    }
    public accountHolder getHolder()
    {
        return holder;
    }
    public void setBalance(double amt)
    {
        balance = amt;
    }
    public void setHolder(accountHolder holder)
    {
        this.holder = holder;
    }
}