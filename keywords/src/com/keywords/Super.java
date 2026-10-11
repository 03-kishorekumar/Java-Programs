package com.keywords;

class Animal
{
	String color = " red ";
}

class Dog extends Animal
{
	String color = " blue ";
	
	void printcolor()
	{
		System.out.println(super.color);
		
		System.out.println(color);
	}
}



public class Super {

	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		obj.printcolor();
		
		// TODO Auto-generated method stub

	}

}
