package com.operator;


import java.util.Scanner;

public class Relational_oper {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Number :");
		
		a=sc.nextInt();
		
		System.out.println("Enter the 2nd Number :");
		
		b=sc.nextInt();
		
//		boolean c=a>b;
		
		System.out.println( a + " is greater than " + b +" : "+(a>b));
		
		System.out.println( a + " is lesser than " + b +" : "+(a<b));

		System.out.println( a + " is greater than or equal to " + b +" : "+(a>=b));

		System.out.println( a + " is lesser than or equal to  " + b +" : "+(a<=b));

		System.out.println( a + " is equal to " + b +" : "+(a==b));
		
		System.out.println( a + " is Not equal to " + b +" : "+(a!=b));


		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
