package java_Basic;

import java.util.*;

public class left_triangle_pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row :");
		
		int row = sc.nextInt();
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		

	}

}
