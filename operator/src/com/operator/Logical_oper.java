package com.operator;

import java.util.Scanner;


public class Logical_oper {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Number :");
		
		a=sc.nextInt();
		
		System.out.println("Enter the 2nd Number :");
		
		b=sc.nextInt();
		
		System.out.println("The Result is : " + (a>b && a<b));
		
		System.out.println("The Result is : " + (a>b || a<b));
		
		System.out.println("The Result is : " + !(a>b));
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
