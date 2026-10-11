package com.conditional;


import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		
		char grade=0;
		
		char gra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the grade of student : A, B, C, and D ");
		
		gra=sc.next().charAt(0);
		
		
		switch (grade) {
		
		case 'A' :
			System.out.println("The result of " + gra + " is : " + " Above 90%");
			break;
			
		case 'B' :
			System.out.println("The result of " + gra + " is : " + "80-90%");
			break;
			
		case 'c' :
			System.out.println("The result of " + gra + " is : " + "70-80%");
			break;
			
		case 'D' :
			System.out.println("The result of " + gra + " is : " + "60-70%");
			break;
			
		case 'E' :
			System.out.println("The result of " + gra + " is : " + "Above 50%");
			break;
		
		default :
			System.out.println("The result of is : Fail");
			
		}
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
