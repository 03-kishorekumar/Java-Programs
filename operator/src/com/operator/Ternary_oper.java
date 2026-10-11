package com.operator;

import java.util.Scanner;


public class Ternary_oper {

	public static void main(String[] args) {
		
		
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number : ");
		
		num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		
		num2=sc.nextInt();
		
		int n=(num1 > num2) ? num1  : num2 ;
		
		System.out.println(" The Greatest Number is : " + n);
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
