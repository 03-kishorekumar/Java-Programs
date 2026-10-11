package com.constructor;

public class Default_const {
	
	int id;
	
	String name;
	
	void display()
	{
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		
		Default_const obj = new Default_const();
		
		Default_const obj1 = new Default_const();
		
		
		obj.display();
		
		obj1.display();
		// TODO Auto-generated method stub

	}

}
