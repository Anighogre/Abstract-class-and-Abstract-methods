package com.ani.lab_12_sep_abstract;

public class Rectangle extends Shape 
{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double getArea() 
	{
		return (this.length * this.breadth);
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Rectangle");
		System.out.println("Length = "+this.length);
		System.out.println("Breadth = "+this.breadth);
	}

}
