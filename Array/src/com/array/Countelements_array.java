package com.array;


import java.util.Scanner;


public class Countelements_array {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of an array : ");
		
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println(" Enter the elements in an array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" Elements in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("");
		
		int count=0;
		
		System.out.println(" Total no of elements in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
