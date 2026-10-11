package com.Linkedlist;


import java.util.LinkedList;



public class Linkedlist_queue {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.offer(10);
		
		li.offer(20);
		
		li.offer(30);
		
		li.offer(40);
		
		li.addFirst(50);
		
		li.addLast(90);
		
		li.offerLast(60);
		
		li.offerFirst(70);
		
		System.out.println(li);
		
		li.poll();
		
		System.out.println(li);
		
		li.pollLast();
		
		System.out.println(li);
		
		li.element();
		System.out.println(li);
		
		
		// TODO Auto-generated method stub

	}

}
