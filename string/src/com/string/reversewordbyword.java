package com.string;

import java.util.*;

public class reversewordbyword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		
		String input = sc.nextLine();
		
		String[] temp = input.trim().split("\\s+");
		
		
		for(int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]);
			
			if(i !=0)
			{
				System.out.print(" ");
			}
		}
		
		sc.close();
		

	}

}
