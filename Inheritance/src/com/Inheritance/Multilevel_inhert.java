package com.Inheritance;

import java.util.Scanner;

class Sem1
{
	int total,avg;
	
	int Sub1,Sub2,Sub3,Sub4,Sub5;
	
	Scanner sc = new Scanner(System.in);
	
	void get()
	{	
		
		System.out.println(" ENTER THE MARKS FOR SEM1 ");
		
		System.out.println();
		
		System.out.println(" Enter the Tamil marks : ");
		
		Sub1=sc.nextInt();
		
		System.out.println(" Enter the english marks : ");
		
		Sub2=sc.nextInt();
		
		System.out.println(" Enter the maths marks : ");
		
		Sub3=sc.nextInt();
		
		System.out.println(" Enter the science marks : ");
		
		Sub4=sc.nextInt();
		
		System.out.println(" Enter the social marks : ");
		
		Sub5=sc.nextInt();
		
		total = Sub1+Sub2+Sub3+Sub4+Sub5;
		
		avg = total / 5;
		
		System.out.println(" TOTALMARK FOR SEM1 : " + total + " / 500 ");
		
		System.out.println(" AVGMARK FOR SEM1 : " + avg);
	}
}

class Sem2 extends Sem1
{
	int TOTAL,AVG;
	
	int Subj1,Subj2,Subj3,Subj4,Subj5,Subj6;
	
	Scanner sc = new Scanner(System.in);
	
	void getmarks()
	{
		
		System.out.println(" ENTER THE MARKS FOR SEMESTER 2 ");
		
		System.out.println();
		
		System.out.println(" Enter the 1st sub marks : ");
		
		Subj1=sc.nextInt();
		
		System.out.println(" Enter the 2nd sub marks : ");
		
		Subj2=sc.nextInt();
		
		System.out.println(" Enter the 3rd sub marks : ");
		
		Subj3=sc.nextInt();
		
		System.out.println(" Enter the 4th sub marks : ");
		
		Subj4=sc.nextInt();
		
		System.out.println(" Enter the 5th sub marks : ");
		
		Subj5=sc.nextInt();
		
		System.out.println(" Enter the 6th sub marks : ");
		
		Subj6=sc.nextInt();
		
		TOTAL = Subj1+Subj2+Subj3+Subj4+Subj5+Subj6;
		
		AVG = TOTAL / 6	;
		
		System.out.println(" TOTALMARK FOR SEM2 : " + TOTAL + " / 500 ");
		
		System.out.println(" AVGMARK FOR SEM2 : " + AVG);
		
	}
}

class Final extends Sem2
{
	int rollno;
	
	String name;
	
	int result,average,percent;
	
	void display()
	{	
		
		result = total +TOTAL;
		
		average=result/2;
		
//		percent=
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" ROLLNO : " + rollno);
		
		System.out.println(" RESULT : " + result);
		
		System.out.println(" AVERAGE: " + average);
		
//		if()
//		{
//			
//		}
		
		
		
		

	}
}

public class Multilevel_inhert {

	public static void main(String[] args) {
		
		Final obj = new Final();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of students u want : ");
		
		int count=sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			obj.get();
			
			obj.getmarks();
			
			obj.display();
		}
		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
