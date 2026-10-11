package com.Collection;

import java.util.*;

public class Link_clone {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		
		li.add(20);
		
		li.add(30);
		
		li.add(40);
		
		li.add(50);
		
		System.out.println(li);
		
		LinkedList<Integer> li1 = new LinkedList<Integer>();
		
		li1=(LinkedList<Integer>)li.clone();
		
		System.out.println(li1);
		
		// TODO Auto-generated method stub

	}

}
