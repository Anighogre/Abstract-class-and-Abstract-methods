package com.ani.lab_10_sep_abstract;

public abstract class Product 
{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) 
	{
		super();
		if(name == null || name.trim().isEmpty() || name.equals("null"))
		{
			System.err.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		
		if(price <0)
		{
			System.err.println("Price can not be negative.");
			System.exit(0);
		}
		
		if(category==null || category.trim().isEmpty() || category.equals("null"))
		{
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
		}
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	
	public abstract double calculateTax();

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product Name: " + name + "\nCategory: " + category + "\nPrice RS:" + price+"\n";
	}
	
	
	
	
}
