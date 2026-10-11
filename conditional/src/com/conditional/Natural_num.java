package com.conditional;


import java.util.Scanner;

public class Natural_num {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number for sum up to : ");
		
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println(" The sum of " + num + " natural number is : " + sum);
		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
