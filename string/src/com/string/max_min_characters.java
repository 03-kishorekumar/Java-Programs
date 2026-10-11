package com.string;

import java.util.*;

public class max_min_characters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String input = sc.nextLine().toLowerCase();
		
		String temp=input.replace(" ","");
		
		int[] fre = new int[256];
		
		for(char c : temp.toCharArray())
		{
			fre[c]++;
		}
		
		char minchar=0,maxchar=0;
		
		int max = -1;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<256;i++)
		{
			if(fre[i]>0)
			{
				if(fre[i]>max)
				{
					max = fre[i];
					
					maxchar = (char) i;
				}
				
				if(fre[i]<min)
				{
					min = fre[i];
					
					minchar = (char) i;
				}
			}
		}
		
		System.out.println("Maximum Occuring character in " + input + " is : " + maxchar + " with count " + max);
		
		System.out.println("Minimum Occuring character in " + input + " is : " + minchar + " with count " + min);
		
		sc.close();
		

	}

}
