package com.operator;



import java.util.Scanner;



public class Bitwise_oper {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the value of a : ");
		
		a=sc.nextInt();
		
		System.out.println(" Enter the value of b : ");
		
		b=sc.nextInt();
		
		int AND=(a&b);
		
		System.out.println("The bitwise AND operation for " + a + " & " + b + " is : " + AND);
		
		int OR=(a|b);
		
		System.out.println("The bitwise OR operation for " + a + " | " + b + " is : " + OR);
		
		int XOR=(a^b);
		
		System.out.println("The bitwise XOR operation for " + a + " ^ " + b + " is : " + XOR);
		
		int COMP=(~ b);
		
		System.out.println("The bitwise COMPLEMENT operation for " + b + " is : " + COMP);
		
		int RSHIFT=(a>>b);
		
		System.out.println("The bitwise RIGHT SHIFT operation for " + a + " >> " + b + " is : " + RSHIFT);
		
		int LSHIFT=(a<<b);
		
		System.out.println("The bitwise LEFT SHIFT operation for " + a + " << " + b + " is : " + LSHIFT);
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
