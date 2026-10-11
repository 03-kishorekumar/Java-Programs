package com.string;


import java.util.Scanner;

public class String_buff {

	public static void main(String[] args) {
		
		System.out.println(" Enter the String :");
		
		Scanner sc=new Scanner(System.in);
		
		StringBuffer buff=new StringBuffer(sc.nextLine());
		
		System.out.println(" Entered string : " + buff);
		
		buff.append(" java");
		
		System.out.println(buff);
		
		buff.insert(7,"to world");
		
		System.out.println(buff);
		
		buff.replace(9,11,"is");
		
		System.out.println(buff);
		
		buff.delete(9, 11);
		
		System.out.println(buff);
		
		buff.reverse();
		
		System.out.println(buff);
		
		System.out.println(buff.charAt(2));
		
		System.out.println(buff.length());
		
		System.out.println(buff.substring(4));
		
		System.out.println(buff.substring(0, 8));
		
		
		
		buff.setCharAt(0,'@');
		
		System.out.println(buff);
		
		
		
		
		
		StringBuffer s=new StringBuffer();
		
		System.out.println(s.capacity());
		
		s.append("goodluck");
		
		System.out.println(s.capacity());
		
		s.append("this is my favorite language");
		
		System.out.println(s.capacity());
		
		sc.close();

		// TODO Auto-generated method stub

	}

}
