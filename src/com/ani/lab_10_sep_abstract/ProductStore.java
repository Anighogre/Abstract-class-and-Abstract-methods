package com.ani.lab_10_sep_abstract;

import java.util.Scanner;

public class ProductStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select Product Type:");
		System.out.println("1. Digital Product");
		System.out.println("2. Physical Product");
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		
		switch(n) {
		case 1 -> {
			System.out.print("Enter Digital Product Name :");
			String pName = sc.nextLine();
			
			System.out.print("Enter Product Price :");
			double pPrice = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Product Category :");
			String pCategory = sc.nextLine();

			System.out.print("Enter Product License Key :");
			String key = sc.nextLine();
			
			System.out.print("Enter the discount % on final bill :");
			int disc = Integer.parseInt(sc.nextLine());
			
			Product p1 = new DigitalProduct(pName, pPrice, pCategory, key);
			System.out.println("Digital Product :");
			System.out.println(p1);
			p1.applyDiscount(disc);
			System.out.println("Tax RS : "+p1.calculateTax());
			
		}
		
		case 2 -> {
			System.out.print("Enter Physical Product Name :");
			String pName = sc.nextLine();
			
			System.out.print("Enter Product Price :");
			double pPrice = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Product Category :");
			String pCategory = sc.nextLine();

			System.out.print("Enter Product weight :");
			int weight = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter the discount % on final bill :");
			int disc = Integer.parseInt(sc.nextLine());
			
			Product p1 = new PhysicalProduct(pName, pPrice, pCategory, weight);
			PhysicalProduct p2 = (PhysicalProduct) p1;
			
			System.out.println("Physical Product:");
			System.out.println(p2);
			p2.applyDiscount(disc);
			System.out.println("Tax RS : "+p2.calculateTax());
			System.out.println("Shipping Cost RS :"+p2.calculateShippingCost());
		}
		}
	}

}
