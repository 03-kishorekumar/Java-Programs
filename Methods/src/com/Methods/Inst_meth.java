package com.Methods;

import java.util.Scanner;

class Instance
{
	int num;
	
	public void display()
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number : ");
		
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println( num + " is an even number ");
		}
		else
		{
			System.out.println( num + " is an odd number ");
		}
		
		sc.close();
	}
	
}



public class Inst_meth {

	public static void main(String[] args) {
		
		Instance obj = new Instance();
		
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
