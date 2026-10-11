package com.Inheritance;


import java.util.Scanner;


class Student_marks
{
	int rollno,tamil,english,maths,science,social;
	
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		System.out.println(" Enter the rollno : ");
		
		rollno=sc.nextInt();
		
		System.out.println(" Enter the Tamil marks : ");
		
		tamil=sc.nextInt();
		
		System.out.println(" Enter the english marks : ");
		
		english=sc.nextInt();
		
		System.out.println(" Enter the maths marks : ");
		
		maths=sc.nextInt();
		
		System.out.println(" Enter the science marks : ");
		
		science=sc.nextInt();
		
		System.out.println(" Enter the social marks : ");
		
		social=sc.nextInt();
	}
}

class Practical_mark extends Student_marks
{
	int mark;
	
	void getmark()
	{
		System.out.println(" Enter the practical mark : ");
		
		mark = sc.nextInt();
	}
	
}

class Result extends Practical_mark
{
	int totalmark , avgmark;
	
	void display()
	{
		totalmark = tamil+english+maths+science+social;
		
		avgmark = totalmark/5;
		
		System.out.println(" ROLLNO : " + rollno);
		
		System.out.println(" TOTALMARK : " + totalmark + " / 500 ");
		
		System.out.println(" AVGMARK : " + avgmark);
	}
}

public class Multillevel {

	public static void main(String[] args) {
		
		Result obj = new Result();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of students u want : ");
		
		int count=sc.nextInt();
		
		for(int i=0;i<count;i++)
		{
			obj.get();
			
			obj.getmark();
			
			obj.display();
		}
		
		sc.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
