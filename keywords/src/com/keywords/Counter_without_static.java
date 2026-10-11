package com.keywords;

public class Counter_without_static {
	
	
	int count=0; 				//Instance variable
	
	Counter_without_static()
	{
		count++;
		
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		
		Counter_without_static obj =new 	Counter_without_static();	
		
		Counter_without_static obj1 =new 	Counter_without_static();
		
		Counter_without_static obj2 =new 	Counter_without_static();
		
		// TODO Auto-generated method stub

	}

}
