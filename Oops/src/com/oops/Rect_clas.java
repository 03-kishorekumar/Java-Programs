package com.oops;

import java.util.Scanner;

class Rectan
{
	
	int length,width;
	
	void getdetails(int x,int y)
	{
		 length=x;
		 
		 width=y;
	}
	
	int area()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the length of an rectangle : ");
		
		int length=sc.nextInt();
		
		System.out.println(" Enter the width of an rectangle : ");
		
		int width=sc.nextInt();
		
		int a=length*width;
		
		return a;
		
	}
	
}


public class Rect_clas {

	public static void main(String[] args) {
		
		
		Rectan obj=new Rectan();
		
		System.out.println(" Area of Rectangle : " + obj.area());
		
		Rectan obj1=new Rectan();
		
		obj1.getdetails(2,5);
		
		// TODO Auto-generated method stub

	}

}
