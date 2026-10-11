package com.array;


import java.util.Scanner;

public class Odd_even_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of an array : ");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println(" Enter the elements of an array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" The Elements in an array are : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println(" Even numbers in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print( arr[i] + " ");
			}
		}
		
		System.out.println("");
		
		System.out.println(" Odd numbers in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print( arr[i] + " ");
			}
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
