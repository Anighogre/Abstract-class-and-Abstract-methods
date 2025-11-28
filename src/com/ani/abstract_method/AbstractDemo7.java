package com.ani.abstract_method;

abstract class Vehicle
{
	protected String name;
	protected int model;
	
	public Vehicle(String name, int model)
	{
		super();
		this.name = name;
		this.model = model;
	}
	
	public abstract void run();
	
	public String printDetails()
	{
		return null;
	}
}

class Bus extends Vehicle
{
	public Bus(String name, int model)
	{
		super(name, model);
	}

	@Override
	public void run() 
	{
		System.out.println(name+" bus is running");
	}
	
	@Override
	public String printDetails()
	{
		return "[ Bus name is "+name+" It's model is "+model+"]";
	}
}

class Bike extends Vehicle
{
	public Bike(String name, int model)
	{
		super(name, model);
	}

	@Override
	public void run() 
	{
		System.out.println("Bike is running");
	}
	
	@Override
	public String printDetails()
	{
		return "[ Bike name is "+name+" It's model is "+model+"]";
	}
}

public class AbstractDemo7 
{
	public static void main(String[] args) 
	{
		Vehicle v = null;
		v = new Bus("volvo", 2025);
		v.run();
		System.out.println(v.printDetails());
		
		v = new Bike("Honda", 2024);
		v.run();
		System.out.println(v.printDetails());
	}

}
