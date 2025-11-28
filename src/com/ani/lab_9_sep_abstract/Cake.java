package com.ani.lab_9_sep_abstract;

public class Cake 
{
	private String shape;
	private String flavor;
	private int quantity;
	public static double PRICE = 400;
	
	public Cake(String shape, String flavor, int quantity)
	{
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "A "+this.shape+" "+this.flavor+" Cake of "+this.quantity+" KG is ready @ RS."+(this.quantity*PRICE);
	}
	
	
	
}
