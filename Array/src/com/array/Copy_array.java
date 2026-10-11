package com.array;


import java.util.Scanner;


public class Copy_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of an array : ");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println(" Enter the elements in an array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" The elements in array 1 : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println("");
		
		int arr1[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr1[i]=arr[i];
		}
		
		System.out.println(" The elements in array 2 : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1 + " ");
		}
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
