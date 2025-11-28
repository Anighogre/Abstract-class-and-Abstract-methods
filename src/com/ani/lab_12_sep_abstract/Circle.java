package com.ani.lab_12_sep_abstract;

public class Circle extends Shape 
{
	double radius;
	static final double PI = 3.14;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	double getArea() 
	{
		
		return PI*(this.radius*this.radius);
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Circle");
		System.out.println("Radius = "+this.radius);
	}

}
