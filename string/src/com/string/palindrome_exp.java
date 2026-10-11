package com.string;


import java.util.Scanner;


public class palindrome_exp {

	public static void main(String[] args) {
		
		String original,reverse="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		
		original=sc.nextLine();
		
		int length=original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			System.out.println(" STRING IS PALINDROME ");
		}
		else
		{
			System.out.println(" STRING IS NOT PALINDROME ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
