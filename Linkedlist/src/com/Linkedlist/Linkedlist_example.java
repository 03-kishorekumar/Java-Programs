package com.Linkedlist;



import java.util.Scanner;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.List;




public class Linkedlist_example {

	public static void main(String[] args) {
		
		
		List<Character> li= new LinkedList<Character>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter how many characters want to enter : ");
		
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
//			char c=sc.next().charAt(0);
			
			li.add(sc.next().charAt(0));
		}
		
		System.out.println(li);
		
		System.out.println();
		
		Iterator itr= li.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
