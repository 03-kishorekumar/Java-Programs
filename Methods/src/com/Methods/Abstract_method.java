package com.Methods;

abstract class Demo
{
	
	abstract void display();
}

class Dem extends Demo
{
	void display()
	{
		System.out.println(" ABSTRACT METHOD ");
	}
}

public class Abstract_method {

	public static void main(String[] args) {
		
		Demo obj = new Dem();
		
		obj.display();
		// TODO Auto-generated method stub

	}

}
