package com.constructor;

public class Copy_const {
	
	int id;
	
	String name;
	
	Copy_const(int i,String n)
	{
		id=i;
		
		name=n;
	}
	
	Copy_const(Copy_const c)
	{
		id=c.id;
		
		name=c.name;
	}
	
	void Display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
	}

	public static void main(String[] args) {
		
		Copy_const obj=new Copy_const(111,"ram");
		
		Copy_const obj1=new Copy_const(obj);
		
		obj.Display();
		
		obj1.Display();
		
		
		// TODO Auto-generated method stub

	}

}
