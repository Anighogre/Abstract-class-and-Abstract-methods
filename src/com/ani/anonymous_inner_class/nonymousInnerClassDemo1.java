package com.ani.anonymous_inner_class;

class Bird
{
	public void roam()
	{
		System.out.println("Generic bird is roaming");
	}
}

public class nonymousInnerClassDemo1 
{
	public static void main(String[] args) 
	{
		// Anonymous inner class
		Bird parrot = new Bird()
		{
			@Override
			public void roam()
			{
				System.out.println("Parrot bird is roaming");
			}
		};
		
		Bird sparrow = new Bird()
		{
			@Override
			public void roam()
			{
				System.out.println("Sparrow bird is roaming");
			}
			public void m1()
			{
			}
		};
		
		parrot.roam();
		sparrow.roam();
	}

}
