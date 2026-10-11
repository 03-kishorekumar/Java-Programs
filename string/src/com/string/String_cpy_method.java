package com.string;

import java.util.Scanner;

public class String_cpy_method {

	public static void main(String[] args) {
		
		String str1,str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string value : ");
		
		str1=sc.nextLine();
		
		str2=String.valueOf(str1);     			// method of copying the string value
		
		System.out.println(str2);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
