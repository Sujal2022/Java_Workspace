package Module_2_1;

abstract class bank
{
	abstract int getbalance();
}

class BankA extends bank
{
	private int balance = 100;
	@Override
	int getbalance() 
	{
		return balance;
	}
}

class BankB extends bank
{
	private int balance = 150;

	@Override
	int getbalance() 
	{
		return balance;
	}
}	
class BankC extends bank
{
	private int balance = 200;

	@Override
	int getbalance() 
	{
		return balance;
	}		
}

public class Bank_Program 
{ 
	public static void main(String[] args) 
	{
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		
		System.out.println("Your Balance in Bank A: $" +bankA.getbalance());
		System.out.println("Your Balance in Bank B: $" +bankB.getbalance());
		System.out.println("Your Balance in Bank C: $" +bankC.getbalance());
		
	}	
}

