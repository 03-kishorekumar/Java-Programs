package com.string;


import java.util.Scanner;

public class Count_characters_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the String value : ");
		
		String str= sc.nextLine();
		
		String strr=str.replace(" ", "");
		
		int count =0;
		
		for(int i=0;i<strr.length();i++)
		{
			count++;
		}
		
		System.out.println(count);
		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
