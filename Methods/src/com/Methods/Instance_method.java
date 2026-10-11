package com.Methods;


import java.util.Scanner;



public class Instance_method {
	
	int num1,num2;
	
	public int add()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st num : ");
		
		num1= sc.nextInt();
		
		System.out.println(" Enter the 2nd num : ");
		
		num2= sc.nextInt();
		
		int result=num1+num2;
		
		return result;

	}


	public static void main(String[] args) {
		
		
		Instance_method obj = new Instance_method();
		
		System.out.println(" Addition of numbers is : " + obj.add());
		
		
		// TODO Auto-generated method stub

	}

}
