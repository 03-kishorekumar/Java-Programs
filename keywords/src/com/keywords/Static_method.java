package com.keywords;

public class Static_method {
	
	int id;
	
	String name;
	
	static String college=" SSN ";
	
	static void change()
	{
		college=" SSD ";
	}
	
	Static_method(int i,String n)
	{
		id = i;
		
		name = n;
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" COLLEGE : " + college);
	}

	public static void main(String[] args) {
		
		Static_method.change();
		
		Static_method obj = new Static_method(12," ram ");
		
		Static_method obj1 = new Static_method(12," ram ");
		
		obj.display();
		
		obj1.display();
		
		
		// TODO Auto-generated method stub

	}

}
