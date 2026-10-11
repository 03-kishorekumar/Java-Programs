package com.constructor;

public class Parameterized_const {

	int id;
	
	String name;
	
	Parameterized_const(int i,String n)
	{
		id=i;
		
		name=n;
		
	}
	
	void Display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
	}
	
	
	public static void main(String[] args) {
		
		Parameterized_const obj = new Parameterized_const(11," raj ");
		
		Parameterized_const obj1 = new Parameterized_const(12," sam ");
		
		obj.Display();
		
		obj1.Display();
		
		// TODO Auto-generated method stub

	}

}
