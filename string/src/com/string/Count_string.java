package com.string;


import java.util.Scanner;

public class Count_string {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string : ");
		
		str=sc.nextLine();
		
		String temp=str.replace(" ", "");
		
		int count=temp.length();
		
		System.out.println(" No of words in string is : " + count);
		
		sc.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
