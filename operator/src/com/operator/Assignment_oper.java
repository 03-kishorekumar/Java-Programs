package com.operator;

import java.util.Scanner;

public class Assignment_oper {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		
		a=sc.nextInt();
		
		System.out.println("Enter the value of b :");
		
		b=sc.nextInt();
		
		
		System.out.println("The Result is : " + (a+=b));
		
		System.out.println("The value of a is : " + a);
		
//		System.out.println("The Result is : " + (a-=b));
//		
//		System.out.println("The Result is : " + (a*=b));
//		
//		System.out.println("The Result is : " + (a/=b));
//		
//		System.out.println("The Result is : " + (a%=b));
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
