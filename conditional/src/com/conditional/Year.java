package com.conditional;
import java.util.*;



public class Year {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%4==0 && x%100!=0 || x%400==0) {
			System.out.println("PUndA");
		}
		else {
			System.out.println("Sorry Bhaaa");
		}
		
		
		// TODO Auto-generated method stub

	}

}
