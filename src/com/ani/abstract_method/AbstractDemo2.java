package com.ani.abstract_method;

abstract class ATM
{
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
	public abstract void pinChange();
}

class SBIATM extends ATM
{

	@Override
	public void withdraw(double amount) 
	{
		System.out.println("Making a withdraw of "+amount+" through SBI ATM");
	}

	@Override
	public void deposit(double amount) 
	{
		System.out.println("Making a deposit of "+amount+" throung SBI ATM");
	}

	@Override
	public void pinChange() 
	{
		System.out.println("PIN change successfully!!!");
	}
	
}
public class AbstractDemo2
{
	public static void main(String[] args) 
	{
		ATM atm = new SBIATM();
		atm.deposit(20000);
		atm.withdraw(12000);
		atm.pinChange();
	}

}
