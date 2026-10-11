package com.keywords;

public class Counter_static {

	static  int count=0; 				//STATIC variable
	
	Counter_static()
	{
		count++;
		
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		
		Counter_static obj=new Counter_static();
		
		Counter_static obj1=new Counter_static();
		
		Counter_static obj2=new Counter_static();
		
		
		
		// TODO Auto-generated method stub

	}

}
