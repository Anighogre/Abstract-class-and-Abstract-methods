package com.ani.lab_12_sep_abstract;

public class Dog extends Animal {

	@Override
	void roam() 
	{
		System.out.println("Dog is roaming");
	}

	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
