package com.Oueue;


import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;



public class Oueue_exp {

	public static void main(String[] args) {
		
		
		Queue<Integer> li = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("\n QUEUE OPERATIONS ");
			
			System.out.println(" 1. Enqueue (Add elements to the queue) ");
			
			System.out.println(" 2. Dequeue (Removing elements to the queue) ");
			
			System.out.println(" 3. Peek() (View front elements to the queue) ");
			
			System.out.println(" 4. Display (displaying entire elements to the queue) ");
			
			System.out.println(" 5. Exit ");
			
			System.out.println(" Enter the choice : ");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println(" Enter the element to add : ");
				
				int a=sc.nextInt();
				
				li.add(a);
				
				System.out.println(a + " element is added to the queue ");
				
				break;
			
			case 2:
				if(!li.isEmpty())
				{
					int remove=li.poll();
					
					System.out.println(remove + " element is removed from the queue ");
				}
				else
				{
					System.out.println(" Oueue is empty ");
				}
				break;
				
			case 3:
				if(!li.isEmpty())
				{
					int frontelement=li.peek();
					
					System.out.println(frontelement + " is the front element in the queue ");
				}
				else
				{
					System.out.println(" Queue is empty ");
				}
				break;
				
			case 4:
				if(!li.isEmpty())
				{
					System.out.println(" Queue Elements : " + li);
				}
				else
				{
					System.out.println(" Queue is empty ");
				}
				break;
				
			case 5:
				System.out.println(" EXIT... ");
				
				break;
				
			default:
				System.out.println(" INVALID CHOICE ");
				
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}
