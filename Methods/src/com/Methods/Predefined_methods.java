package com.Methods;

import java.util.Scanner;


public class Predefined_methods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st num : ");
		
		int num1= sc.nextInt();
		
		System.out.println(" Enter the 2nd num : ");
		
		int num2= sc.nextInt();
		
		System.out.println(" Display the maximum of the number : " + Math.max(num1,num2));
		
		System.out.println(" Display the minimum of the number : " + Math.min(num1,num2));
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
