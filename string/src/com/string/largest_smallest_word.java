package com.string;

import java.util.*;
;
public class largest_smallest_word {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence : ");
		
		String input = sc.nextLine();
		
		String temp = input.trim();
		
		String word[] = temp.split("\\s+");
		
		String smallest = word[0];
		
		String largest = word[0];
		
		for(String fi : word)
		{
			if(fi.length() < smallest.length())
			{
				smallest = fi;
			}
			
			if(fi.length() > largest.length())
			{
				largest = fi;
			}
		}
		
		System.out.println(" original String : " + input);
		
		System.out.println(" Smallest word in the given String : " + smallest);
		
		System.out.println(" Largest word in the given String : " + largest);
		
		sc.close();

	}

}
