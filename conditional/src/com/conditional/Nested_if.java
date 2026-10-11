package com.conditional;

import java.util.Scanner;


public class Nested_if {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st number : ");
		
		a=sc.nextInt();
		
		System.out.println(" Enter the 2nd number : ");
		
		b=sc.nextInt();
		
		if((a & b) > 0)
		{
			if(a!=b)
			{
				System.out.println(" NOT EQUAL ");
			}
		}
		else
		{
			System.out.println(" INVALID ");
		}
		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
