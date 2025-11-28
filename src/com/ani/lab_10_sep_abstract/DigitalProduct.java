package com.ani.lab_10_sep_abstract;

public class DigitalProduct extends Product {
	private String licenseKey ;
	
	

	public DigitalProduct(String name, double price, String category, String licenseKey) 
	{
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	@Override
	public void applyDiscount(double percentage) {
		double calcPercentage = (getPrice()/100)*percentage;
		super.setPrice(getPrice()-calcPercentage);
		System.out.println("Discount applied :"+calcPercentage);
		System.out.println("New Price :"+getPrice());
	}

	@Override
	public double calculateTax() {
		return getPrice()*0.05;
	}

	@Override
	public String toString() {
		return  super.toString()+ "licenseKey=" + licenseKey;
	}
	
	

}
