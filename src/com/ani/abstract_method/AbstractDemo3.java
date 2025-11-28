package com.ani.abstract_method;

abstract class Car
{
	protected int speed = 120;
	public Car()
	{
		System.out.println("Car class constructor");
	}
	
	public void getCarDetails()
	{
		System.out.println("It has 4 wheels and one Engine");
	}
	
	public abstract void run();
}

class Honda extends Car
{
	@Override
	public void run()
	{
		System.out.println("Honda car is running!!!");
	}
}

public class AbstractDemo3 
{
	public static void main(String[] args) 
	{
		Car car = new Honda();
		System.out.println("Speed of the car is :"+car.speed);
		car.getCarDetails();
		car.run();
	}

}
