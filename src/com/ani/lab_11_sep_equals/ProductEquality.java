package com.ani.lab_11_sep_equals;

public class ProductEquality 
{
	public static void main(String[] args)
	{
		Product p1 = new Product(111, "Mobile");
		Product p2 = new Product(111, "Mobile");
		
//		System.out.print("hashCode of product : ");
		System.out.println(p1.hashCode()+" : "+p2.hashCode());
//		System.out.print("content compare of two Product objects : ");
		System.out.println(p1.equals(p2));
		
		System.out.println("------------------------------------");
		
		Employee e1 = new Employee(222, "Ani");
		Employee e2 = new Employee(222, "Ani");
		
//		System.out.print("hashCode of Employee : ");
		System.out.println(e1.hashCode() +" : "+e2.hashCode());
//		System.out.print("content compare of two Employee objects : ");
		System.out.println(e1.equals(e2));
		
		
		
		
	}

}
