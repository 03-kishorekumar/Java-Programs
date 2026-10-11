package com.operator;


import java.util.Scanner;


public class Decrement_oper {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		
		a=sc.nextInt();
		
//		a--;
		
		--a;
		
		System.out.println("The post Decrement value is : " + a);
		
		System.out.println("The pre Decrement value is : " + a);
		
		sc.close();
		

		// TODO Auto-generated method stub

	}

}
