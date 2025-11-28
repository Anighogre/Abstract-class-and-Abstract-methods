package com.ani.lab_16_interface_with_factory;

public interface Payment 
{
	public void processPayment();
	public void applyDiscount();
	
	
}


class CreditCardPayment implements Payment
{

	@Override
	public void processPayment() 
	{
		System.out.println("Processing credit card payment...");
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying 10% discount for credit card users.");
	}
}

class UPIPayment  implements Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying ₹100 cashback for UPI users.");
	}
}