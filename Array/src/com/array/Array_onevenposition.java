package com.array;


import java.util.Scanner;

public class Array_onevenposition {

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
		
		System.out.println(" Elements in an array : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		System.out.println(" Printing the elements in an array in even position : ");
		
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
