package Module_2_2;

import java.util.Scanner;

public class Withdraw_Program 
{
	double balance;
    
    public Withdraw_Program(double balance) 
    {
        this.balance = balance;
    }
    
    public void withdraw(double amount) throws  InsufficientBalanceException
    {
    	if (amount > balance) 
    	{
            throw new InsufficientBalanceException("Insufficient balance. Please try again with a smaller amount.");
        }
    	
    	  balance -= amount;
          System.out.println("Amount " + amount + " has been withdrawn successfully. Current balance is " + balance);
    }
    public static void main(String[] args)  
    {
    	Scanner sc = new Scanner(System.in);
    	Withdraw_Program account = new Withdraw_Program(20000);
    	
    	System.out.println("Account Balance is:" +account.balance);
    	System.out.println("Enter Withdrawn Amount:");
    	double amt = sc.nextDouble();
    	try 
    	{
            account.withdraw(amt);
        } catch (InsufficientBalanceException e) 
    	{
            System.out.println(e.getMessage());
        }
	}
}
class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}
