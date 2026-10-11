package com.keywords;

class Animals
{
	void eat()
	{
		System.out.println(" EATING.... ");
	}
}

class Dogs extends Animals
{
	void eat()
	{
		System.out.println(" DOG IS EATING... ");
	}
	
	void bark()
	{
		System.out.println(" BARKING... ");
	}
	
	void work()
	{
		super.eat();
		
		eat();
		
		bark();
	}
}



public class Super_meth {

	public static void main(String[] args) {
		
		
		Dogs obj = new Dogs();
		
		obj.work();
		
		
		
		// TODO Auto-generated method stub

	}

}
