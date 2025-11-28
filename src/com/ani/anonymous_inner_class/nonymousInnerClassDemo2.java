package com.ani.anonymous_inner_class;

abstract class Loan
{
	public abstract void applyLoan();
}

public class nonymousInnerClassDemo2 
{
	public static void main(String[] args) 
	{
		Loan carLoan = new Loan()
		{
			@Override
			public void applyLoan()
			{
				System.out.println("Apply car loan");
			}
		};
		
		Loan bikeLoan = new Loan()
		{
			@Override
			public void applyLoan()
			{
				System.out.println("Apply bike loan");
			}
		};
		
		carLoan.applyLoan();
		bikeLoan.applyLoan();
	}

}
