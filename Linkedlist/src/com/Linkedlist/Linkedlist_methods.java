package com.Linkedlist;


import java.util.LinkedList;


public class Linkedlist_methods {

	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("ram");
		
		li.add("sam");
		
		li.add("jam");
		
		li.add("ram");
		
		System.out.println(li);
		
//		li.removeFirstOccurrence("ram");
//		
//		System.out.println(li);
		
//		li.removeLastOccurrence("ram");
//		
//		System.out.println(li);
		
//		li.clear();
//		
//		System.out.println(li);
		
		
		LinkedList<String> li1 = new LinkedList<String>();
		
		li1.add("ramesh");
		
		li1.add("suresh");
		
		System.out.println(li1);
		
		li.addAll(li1);
		
		System.out.println(li);
		
//		li.removeAll(li1);
//		
//		System.out.println(li);
		
		String str=li.element();
		
		System.out.println(str);
		
		String st=li.get(2);
		
		System.out.println(st);
		
		li.set(0, "sri");
		System.out.println(li);
		
	
		
		
		// TODO Auto-generated method stub

	}

}
