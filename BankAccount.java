public class BankAccount
{
    public int accountID;
    public String owner;
    public double balance;
    Deposit dep = new Deposit();
    Withdraw wit = new Withdraw();
    public BankAccount()
    {
       accountID = 0;
       owner = null;
       balance = 0.00;
    }
    public void depositNumbers(double deposit)
    {
    {
            dep.sendNumbers(balance, deposit);
            balance = dep.getNewBalance();
    }
    
    }
    public void withdrawNumbers(double withdrawal)
    {
        if(withdrawal<=balance)
        {
        wit.sendNumbers(balance, withdrawal);
        balance = wit.getNewBalance();
    }
    else
    {
        System.out.println("You don't have enought money!");
    }   
    }
    public double getBalance()
    {
        return balance;
    }
        public void transfer(double transferAmount, BankAccount account)
    {
          this.withdrawNumbers(transferAmount);
          account.depositNumbers(transferAmount);
    }
}
