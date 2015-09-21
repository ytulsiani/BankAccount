public class SavingsAccount extends BankAccount
{
    public int counter;
    public void withdrawNumbers(double withdrawal)
    {
        counter++;
        if (counter > 3)
        {
            wit.sendNumbers(balance, 15);
            balance = wit.getNewBalance();
            System.out.println("Sorry, you can only make 3 withdrawals with a savings account! You have been charged 15 dollars. \nYour new balance is " + balance);
            counter = 0;
        }
        if (withdrawal > balance)
        {
            System.out.println("Your withdrawal has to be less than " + balance);
        }
        else
        {
            wit.sendNumbers(balance, withdrawal);
            balance = wit.getNewBalance();
        }

    }
}
