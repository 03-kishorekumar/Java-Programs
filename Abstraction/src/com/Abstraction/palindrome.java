package com.Abstraction;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		String original = sc.nextLine();
		
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			System.out.println(original+"is a palindrome");
		}
		else {
			System.out.println(original+"is not a palindrome");
		}

	}

}
