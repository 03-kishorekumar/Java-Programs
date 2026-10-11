package com.conditional;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number to stop : ");
		
		int stop = sc.nextInt();
		
		do {
			System.out.println(i);
			
			i++;		
		}
		while(i<=stop);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
