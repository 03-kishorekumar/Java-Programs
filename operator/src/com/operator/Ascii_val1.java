package com.operator;

import java.util.Scanner;

public class Ascii_val1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter the character : ");
		
		ch=sc.next().charAt(0);
		
		System.out.println("The ASCII value for the given character is : "+ (int)ch);
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
