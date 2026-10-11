package com.array;

public class Clone_array {

	public static void main(String[] args) {
		
		
		int arr[]= {33,4,3,5};
		
		System.out.println(" printing original array : ");
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println(" printing the clone of the array : ");
		
		int carr[]=arr.clone();
		
		for(int i:carr)
		{
			System.out.print(i + " ");
			
			System.out.println();
		}
		
		System.out.println(" Are both equal ? ");
		
		System.out.println(arr==carr);
		
		// TODO Auto-generated method stub

	}

}
