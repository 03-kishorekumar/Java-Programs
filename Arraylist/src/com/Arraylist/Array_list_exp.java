package com.Arraylist;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Iterator;

public class Array_list_exp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the how many values to enter : ");
		
		int n=sc.nextInt();
		
		ArrayList<String> li=new ArrayList<String>();
		
		System.out.println(" Enter the " + n + " String values ");
		
		for(int i=0;i<n;i++)
		{
			li.add(sc.next());
		}
		
		System.out.println(li);
		
		Iterator it=li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// TODO Auto-generated method stub

	}

}
