package com.operator;


import java.util.Scanner;

public class Arith_oper {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		int c=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("The addition of  "+ a +" and " + b + "  is :  "+ c);
		System.out.println("The subtraction of  "+ a +" and " + b + "  is :  "+ sub);
		System.out.println("The multiplication of  "+ a +" and " + b + "  is :  "+ mul);
		System.out.println("The division of  "+ a +" and " + b + "  is :  "+ div);
		System.out.println("The modulo of  "+ a +" and " + b + "  is :  "+ mod);
		
		sc.close();
//		System.out.println(a+" + " +b+" = "+c);
		// TODO Auto-generated method stub

	}

}
