public class Deposit
{
    public double num1;
    public double num2;

   
    public Deposit()
    {
        num1 = 0.00;
    }

    public void sendNumbers(double balance, double depositAmount)
    {
        num1 = balance + depositAmount;
    }
    
    public double getNewBalance()
    {
        return num1;
    }
}
