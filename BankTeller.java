import javax.swing.JOptionPane;
import java.util.ArrayList;
public class BankTeller
{
public static void main(String args[])
{
      BankAccount savAcct = new SavingsAccount();
      BankAccount checkAcct = new CheckingAccount();
      String inputName = JOptionPane.showInputDialog("What is your name?");
      boolean q = true;
      while(q == true)
      {
      String new1 = JOptionPane.showInputDialog("Enter one of the following choices: \n 1. deposit \n 2.withdrawal \n 3.balance \n 4.transfer \n 5.exit");
      int n = Integer.parseInt(new1);
      switch (n)
      {
          case 1: 
                  String depWhere = JOptionPane.showInputDialog("Deposit money to where: \n 1.Savings \n 2.Checking");
                  int depLocation = Integer.parseInt(depWhere);
                  String depAmountString = JOptionPane.showInputDialog("Enter amount of money you want to deposit?");
                  int depositAmount = Integer.parseInt(depAmountString);
                  if(depLocation == 1)
                  {
                  savAcct.depositNumbers(depositAmount);
                      
                  }
                  else if(depLocation == 2)
                  {
                  checkAcct.depositNumbers(depositAmount);
                  
                  }
                  break;
           case 2:
                  String witWhere = JOptionPane.showInputDialog("Withdraw money from where: \n 1.Savings \n 2.Checking");
                  int witLocation = Integer.parseInt(witWhere);
                  String witAmountString = JOptionPane.showInputDialog("Enter amount of money you want to withdraw?");
                  int withdrawalAmount = Integer.parseInt(witAmountString);
                  if(witLocation == 1)
                  {
                  savAcct.withdrawNumbers(withdrawalAmount);
                  
                  }
                  else if(witLocation == 2)
                  {
                   checkAcct.withdrawNumbers(withdrawalAmount);
                   
                  }
                  break;
           case 3:
                  System.out.println("Your  savings balance is " + savAcct.getBalance() );
                  System.out.println("Your checking balance is " + checkAcct.getBalance()  );
                  break;
           case 4: 
                  String transferWhere = JOptionPane.showInputDialog("From which account will you transfer money? \n 1.Savings \n 2.Checking");
                  int transferLocation = Integer.parseInt(transferWhere);
                  String transferAmountString = JOptionPane.showInputDialog("How much money will you transfer?");
                  int transferAmount = Integer.parseInt(transferAmountString);
                  if(transferLocation == 1)
                  {
                  savAcct.transfer(transferAmount, checkAcct);
                  
                  }
                  else if(transferLocation == 2)
                  {
                   checkAcct.transfer(transferAmount, savAcct);
                   
                  }
                  break;
           case 5: System.out.println("Goodbye! Thanks for your business!");
                   q= false;
                   break;
           default: System.out.println("Invalid input, please choose an option from the menu");
           
           
        }
    }
  }
}
