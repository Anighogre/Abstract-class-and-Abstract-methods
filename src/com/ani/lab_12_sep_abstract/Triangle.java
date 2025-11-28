package com.ani.lab_12_sep_abstract;

public class Triangle extends Shape
{
	double base;
	double height;
	
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	double getArea() 
	{
		
		return 0.5*(this.base*this.height);
	}

	@Override
	void printDetails() 
	{
		System.out.println("Type = Triangle");
		System.out.println("Base = "+this.base);
		System.out.println("Height = "+this.height);
	}

}
