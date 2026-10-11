package com.Abstraction;

abstract class Bike
{
	Bike()													// In Abstract class can have a Constructor method															
	{
		System.out.println(" Bike constructor ");
	}
	
	
	
	
	abstract void run();									// In Abstract class can have a Abstract method	
	
	
	
	void changegear()										// In Abstract class can have a non-abstract method	
	{
		System.out.println(" gear changed ");
	}
	
}


class Honda extends Bike
{
	void run()
	{
		System.out.println(" running safely ");
	}
}


    
public class Abstract_class {

	public static void main(String[] args) {
		
		Honda obj = new Honda();
		
		obj.run();
		
		obj.changegear();
		
		// TODO Auto-generated method stub

	}

}
