package com.ani.lab_10_sep_abstract;

public class PhysicalProduct extends Product {
	
	private double shippingWeight;
	
	public PhysicalProduct(String name, double price, String category, double shippingWeight) 
	{
		super(name, price, category);
		this.shippingWeight = shippingWeight;
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
		
		return getPrice()*0.08;
	}
	
	public double calculateShippingCost()
	{
		return this.shippingWeight * 5;
	}

	@Override
	public String toString() {
		return super.toString()+"shipping Weight=" + shippingWeight+" kg";
	}

	
	
	
	
	

}
