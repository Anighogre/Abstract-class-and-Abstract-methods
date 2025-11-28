package com.ani.lab_11_sep_equals;

public class Product 
{
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	@Override
	public int hashCode()
	{
		return this.productId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
//		int pid1 = this.productId;
//		String pname1 = this.productName;
		
		Product product = (Product) obj;
		
//		int pid2 = this.productId;
//		String pname2 = this.productName;
		
		if(this.productId == product.productId && this.productName.equals(product.productName))
		{
			return true;
		} 
		else 
		{
		return false;
		}
	}
	
	
}



