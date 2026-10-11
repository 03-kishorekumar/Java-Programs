package com.Arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class Arraylist_exp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the how many values to enter : ");
		
		int n=sc.nextInt();
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		
		System.out.println(" Enter the " + n + " numbers ");
		
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			
			li.add(x);
		}
		
		System.out.println(li);
		
		System.out.println("------------------------------");
		
		for(int temp : li)
		{
			System.out.println(temp);
		}
		
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println(li);
//		}
		
		
		// TODO Auto-generated method stub

	}

}
