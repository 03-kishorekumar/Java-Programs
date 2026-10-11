package com.conditional;


import java.util.Scanner;

public class While_exp {

	public static void main(String[] args) {
		
		int stop,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number to Start : ");
		
		i=sc.nextInt();
		
		System.out.println(" Enter the number to stop : ");
		
		stop=sc.nextInt();
		
		while(i<=stop)
		{
			System.out.println(i);
			
			i++;
		}
		
		sc.close();
		// TODO Auto-generated method stub
	}

}
