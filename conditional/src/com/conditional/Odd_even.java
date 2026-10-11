package com.conditional;


import java.util.Scanner;


public class Odd_even {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		num=sc.nextInt();
		
		if(num%2!=0)
		{
			System.out.println(num + " is an odd number ");
		}
		
		else {
			System.out.println(num + " is an even number ");
		}
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
