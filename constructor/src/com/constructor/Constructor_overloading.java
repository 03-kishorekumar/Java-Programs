package com.constructor;

public class Constructor_overloading {
	
	int id,age;
	
	String name;
	
	Constructor_overloading(int i,String n)
	{
		id=i;
		
		name=n;
	}
	
	Constructor_overloading(int i,String n,int a)
	{
		id = i;
		
		name = n;
		
		age = a;
				
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" AGE : " + age);
	}

	public static void main(String[] args) {
		
		Constructor_overloading obj= new Constructor_overloading(10,"ram");
		
		Constructor_overloading obj1= new Constructor_overloading(10,"ram",50);
		
		obj.display();
		
		obj1.display();
		// TODO Auto-generated method stub

	}

}
