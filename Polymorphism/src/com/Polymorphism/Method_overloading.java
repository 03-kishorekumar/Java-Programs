package com.Polymorphism;



public class Method_overloading {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	

	public static void main(String[] args) {
		
		Method_overloading.add(10, 20);
		 
		Method_overloading.add(20, 30, 10);
		 
		System.out.println(Method_overloading.add(10, 20));
		
		System.out.println(Method_overloading.add(20, 30, 10));
		
		
		// TODO Auto-generated method stub

	}

}
