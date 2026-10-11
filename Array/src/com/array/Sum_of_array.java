package com.array;


import java.util.Scanner;

public class Sum_of_array {

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
		
		int sum=0;
		
		System.out.println(" Sum of elements in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
