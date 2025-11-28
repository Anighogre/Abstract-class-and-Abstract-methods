package com.ani.lab_12_sep_abstract;

public class AnimalDemo 
{
	public static void main(String[] args) 
	{
		
		Animal a1 = new Lion();
		a1.roam();
		AnimalDemo.getAnimal(a1);
		
		System.out.println("--------------------------");
		
		Animal a2 = new Dog();
		a2.roam();		
		AnimalDemo.getAnimal(a2);
		
		
	}
	
	public static void getAnimal(Animal animal)
	{
		if(animal instanceof Lion lion)
		{
			lion.roar();
		}
		
		if(animal instanceof Dog dog)
		{
			dog.bark();
		}
	}

}
