package com.string;

import java.util.Scanner;

public class Replacespace {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string : ");
		
		str=sc.nextLine();
		
		String temp=str.replace(" ", "-");
		
		System.out.println(" After replacing space in " + str + " is : " + temp);
		
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
