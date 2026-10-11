package com.string;

public class String_method {

	public static void main(String[] args) {
		
		String a="hello";
		
		String b="hELLO";
		
		
		System.out.println("1. " + a);
		
		System.out.println("2. " + b);
		
		
		System.out.println("1.Hashcode : " + a.hashCode());
		
		System.out.println("2.Hashcode : " + b.hashCode());
		
		System.out.println("EQUALS: " + a.equals(b));
		
		System.out.println("EQUALSIGNORECASE : " + a.equalsIgnoreCase(b));
		
		
		System.out.println("LENGTH :" + a.length());
		
		System.out.println("CHARAT :" + a.charAt(4));
		
		System.out.println("UPPERCASE :" + a.toUpperCase() );
		
		System.out.println("LOWERCASE :" + b.toLowerCase());
		
		System.out.println("REPLACE :" + a.replace("hello","hai"));
		
		System.out.println(a);
		
		System.out.println("CONTAINS :" + a.contains("hai"));
		
		System.out.println("ISEMPTY : " + b.isEmpty());
		
		System.out.println("ENDSWITH : " + a.endsWith("a"));
		
		System.out.println("STARTSWITH : " + a.startsWith("v"));
		
		System.out.println("SUBSTRING : " + a.substring(1));
		
		System.out.println("SUBSTRING : " + b.substring(1,3));
		
		
		char[] ch=a.toCharArray();
		
		for(char c : ch) {
			System.out.print(c+"    ");
		}
		
		
		
		String str="  welcome  ";
		
		int str1=str.length();
		
		System.out.println( str1);
		
		System.out.println( str.length());
		
		System.out.println("str :" + str);
		
		
		System.out.println(str.trim());
		
		System.out.println("str trim length :" + str.trim().length());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
