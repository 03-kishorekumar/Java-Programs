package com.operator;

import java.util.Scanner;


public class Increment_oper {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		
		a=sc.nextInt();
		
		a++;
		
//		++a;
		
		System.out.println("The post Increment value is : " + a);
		
		System.out.println("The pre Increment value is : " + a);
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
