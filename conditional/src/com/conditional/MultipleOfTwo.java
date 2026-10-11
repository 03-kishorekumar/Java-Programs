package com.conditional;


import java.util.Scanner;


public class MultipleOfTwo {

	public static void main(String[] args) {
		
		int num,temp=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number to multiply : ");
		
		num=sc.nextInt();
		
		int stop;
		
		System.out.println(" Enter the stop value : ");
		
		stop = sc.nextInt();
		
		for(int i=1 ; i<=stop ;i++)
		{
			temp = num * i;
			System.out.println(num + " * " + i + " = " + temp);
		}
		
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
