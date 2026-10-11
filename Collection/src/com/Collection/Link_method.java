package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Link_method {

	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("ram");
		
		li.add("sam");
		
		li.add("jam");
		
		li.add("ram");
		
		li.add("ramesh");
		
		li.add("suresh");
		
		li.add("ratha");
		
		li.add("ram");
		
		System.out.println(li);
		
		
		li.remove("jam");			// REMOVE METHOD
		
		System.out.println(li);
		
		LinkedList<String> li1 = new LinkedList<String>();
		
		li1.add("rahul");
		
		li1.add("sai");
		
		System.out.println(li1);
		
		li.addAll(li1);
		
		System.out.println(li);
		
		li.removeAll(li1);
		
		System.out.println(li);
		
//		li.removeFirst();
//		
//		System.out.println(li);
//		
//		li.removeLast();
//		
//		System.out.println(li);
		
		
		
		li.removeFirstOccurrence("ram");
		
		System.out.println(li);
		
		li.removeLastOccurrence("ram");
		
		System.out.println(li);
		
		
//		li.clear();
//		
//		System.out.println(li);
		
		System.out.println("--------------------------------------------");
		
		Iterator it=li.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println(li.peek());
		
		System.out.println(li.peekFirst());
		
		System.out.println(li.peekLast());
		
		System.out.println(li);
		
		System.out.println("----------------------------------------------");
		
		System.out.println(li.poll());
		
		System.out.println(li.pollFirst());
		
		System.out.println(li.pollLast());
		
		System.out.println(li);
		
		System.out.println("------------------------------------------------");
		
		li.push("welcome");
		
		System.out.println(li);
		
		li.push("TO");
		
		System.out.println(li);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(li.pollLast());
		
		System.out.println(li);
		
		
		
		// TODO Auto-generated method stub

	}

}
