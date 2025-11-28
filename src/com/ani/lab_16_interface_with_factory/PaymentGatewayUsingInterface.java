package com.ani.lab_16_interface_with_factory;

import java.util.Scanner;

public class PaymentGatewayUsingInterface
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your payment Option :");
		System.out.println("	 1) Credit Card");
		System.out.println("	 2) UPI");
		System.out.print("Please Enter your Choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		PaymentGateway p1 = new PaymentGateway();
		
		switch(choice)
		{
		case 1 -> {
			Payment payment = new CreditCardPayment();
			
			p1.initiatePayment(payment);
			
			payment.applyDiscount();
			payment.processPayment();
		}
		case 2 -> {
			Payment payment = new UPIPayment();
			
			p1.initiatePayment(payment);
			
			payment.applyDiscount();
			payment.processPayment();
		}
		default -> {
			System.err.println("Wrong Choice...");
			System.exit(0);
		}
		}
		
		
		 
		 
		

	}

}
