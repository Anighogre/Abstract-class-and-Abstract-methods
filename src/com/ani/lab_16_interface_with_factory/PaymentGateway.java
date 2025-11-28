package com.ani.lab_16_interface_with_factory;

public class PaymentGateway 
{
	public Payment initiatePayment(Payment payment)
	{
		if(payment instanceof CreditCardPayment creditCard)
		{
			System.out.println("Initiating Credit Card payment.");
			return new CreditCardPayment();
		} else 
		{
			System.out.println("Initiating UPI payment.");
			return new UPIPayment();
		}
	}
}
