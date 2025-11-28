/*
 * Program that describes overriding of all abstract method is compulsory in the sub classes otherwise 
 * sub class will also become as abstract class
 */

package com.ani.abstract_method;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}

abstract class Beta extends Alpha
{
	@Override
	public void show()
	{
		System.out.println("Show method is overridden in beta class");
	}
}

class Gamma extends Beta
{
	@Override
	public void demo()
	{
		System.out.println("demo method is overridden in beta class");
	}
}

public class AbstractDemo6 {

	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.demo();
		g.show();
	}

}
