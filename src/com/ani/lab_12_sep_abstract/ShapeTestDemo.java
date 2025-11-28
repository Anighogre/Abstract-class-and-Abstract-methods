package com.ani.lab_12_sep_abstract;

public class ShapeTestDemo 
{
	public static void main(String[] args) 
	{
		Shape s1 = null;
		
		s1 = new Rectangle(30.3, 45.4);
		s1.printDetails();
		System.out.println("Area = "+s1.getArea());
		
		System.out.println("-----------------------------------");
		
		s1 = new Circle(23.2);
		s1.printDetails();
		System.out.printf("Area = %.4f",s1.getArea());
		
		System.out.println("\n-----------------------------------");
		
		s1 = new Triangle(146.2, 40.0);
		s1.printDetails();
		System.out.println("Area = "+s1.getArea());
	}

}
