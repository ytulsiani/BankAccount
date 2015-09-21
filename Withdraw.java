
public class Withdraw
{
    public double num1;
    public double num2;

   
    public Withdraw()
    {
        num1 = 0.00;
    }

    public void sendNumbers(double balance, double withdrawAmount)
    {
        num1 = balance - withdrawAmount;
    }
    
    public double getNewBalance()
    {
        return num1;
    }
        public void resetWithdrawal()
    {
        num1=0.00;
    }
}
