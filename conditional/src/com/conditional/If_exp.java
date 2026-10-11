package com.conditional;

import java.util.Scanner;

public class If_exp {

	public static void main(String[] args) {
		
		
		int num1,num2,num3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print(" Enter the 1st number : ");
		
		num1=sc.nextInt();
		
		System.out.print(" Enter the 2nd number : ");
		
		num2=sc.nextInt();
		
		System.out.print(" Enter the 3rd number : ");
		
		num3=sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is greatest among 3 numbers ");
		}
		
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 + " is greatest among 3 numbers ");
		}
		
		else
		{
			System.out.println(num3 + " is greatest among 3 numbers ");
		}
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
