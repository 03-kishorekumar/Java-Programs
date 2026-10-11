package com.conditional;


import java.util.Scanner;



public class Age_exp {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		
		age=sc.nextInt();
		
		if(age>=18) {
			
			System.out.println(" ELIGIBLE TO VOTE ");
		}
		
		else
		{
			System.out.println("NOT ELIGIBLE TO VOTE");
		}
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
