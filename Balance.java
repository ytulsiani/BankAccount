public class Balance
{
    private double num1;
    private double deposit;
    private double withdraw;
   
    public Balance()
    {
        num1 = 0.00;
        deposit = 0.00;
        withdraw = 0.00;
    }

    public void sendNumbers(double balance1)
    {
        num1 = balance1;
    }
    
    public void deposit(double bal1, double dep1)
    {
        num1 = num1 + deposit;
    }
    
    public double getBalance()
    {
        return num1;
    }
}
