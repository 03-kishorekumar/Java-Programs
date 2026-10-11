package com.conditional;

import java.util.Scanner;


public class Grade_exp {

	public static void main(String[] args) {
		
		int mark;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the mark of the student : ");
		
		mark=sc.nextInt();
		
		if(mark > 90) 
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " A+ GRADE ");
		}
		
		else if(mark > 80 && mark <= 90)
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " A GRADE ");
		}
		
		else if(mark > 70 && mark <= 80)
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " B+ GRADE ");
		}
		
		else if(mark > 60 && mark <= 70)
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " B GRADE ");
		}
		
		else if(mark > 50 && mark <= 60)
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " C GRADE ");
		}
		
		else
		{
			System.out.println(" The grade for the mark " + mark + " is : " + " FAIL ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
