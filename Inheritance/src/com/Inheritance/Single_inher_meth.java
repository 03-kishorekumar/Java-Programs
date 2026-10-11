package com.Inheritance;

import java.util.Scanner;

class A
{
	int a,b;
	
	void add()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st num : ");
		
		a=sc.nextInt();
		
		System.out.println(" Enter the 2nd nu.m : ");
		
		b=sc.nextInt();
		
		int addi = a+b;
		
		System.out.println(addi);
	}
}

public class Single_inher_meth extends A{
	
	int p,q;
	
	void sub()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st num : ");
		
		p=sc.nextInt();
		
		System.out.println(" Enter the 2nd num : ");
		
		q=sc.nextInt();
		
		int subb = p-q;
		
		System.out.println(subb);
		
		sc.close();
	}

	public static void main(String[] args) {
		
		Single_inher_meth obj = new Single_inher_meth();
		
		obj.add();
		
		obj.sub();
		// TODO Auto-generated method stub

	}

}
