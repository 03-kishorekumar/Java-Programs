package com.Polymorphism;

public class Meth_overloading {
	
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	
	void sum(String a,String b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a,long b,float c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		Meth_overloading obj = new Meth_overloading();
		
		obj.sum(10, 20);
		
		obj.sum("ram", "sam");
		
		obj.sum(10, 20,30);
		
		
		
		// TODO Auto-generated method stub

	}

}
