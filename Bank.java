import java.io.IOException;

public class Bank {
    private double balance;
    private String accountNumber;
    public Bank(double balance,String accountNumber)
    {
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public void getBalance()
    {
        System.out.println("Balance "+balance);
    }
    public void getAccountNumber()
    {
        System.out.println("Account Number"+accountNumber);
    }
    public void depoist(double amount)
    {
        if(amount<0)
        {
            System.out.println("Amount depoist cannot be negative");
        }
        else
        {
            balance+=amount;
        }
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance-=amount;
        }
    }
    public static void main(String [] args)throws IOException
    {
        Bank bank=new Bank(1000,"12345");
        bank.getBalance();
        bank.getAccountNumber();
        bank.depoist(2000);
        bank.getBalance();
        bank.withdraw(5000);
        bank.withdraw(1500);
        bank.getBalance();
    }
}
