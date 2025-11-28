package com.ani.abstract_method;

abstract class Animal
{
	public abstract void checkup();
}

class Lion extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Lion checkup");
	}	
}

class Elephent extends Animal
{

	@Override
	public void checkup() {
		System.out.println("Elephent checkup");
	}
}

public class AbstractDemo5 {

	public static void main(String[] args)
	{
		Animal lions[] = {new Lion(), new Lion(), new Lion()};
		regularAnimalCheckup(lions);
		
		System.out.println(".................................");
		
		Animal elephents[]  = new Animal[2];
		elephents[0] = new Elephent();
		elephents[1] = new Elephent();
		
		regularAnimalCheckup(elephents);
	}
	
	public static void regularAnimalCheckup(Animal animals[])
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

}
