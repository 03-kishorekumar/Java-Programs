package java_Basic;

import java.util.*;

public class reverse_left_triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row :");
		
		int row = sc.nextInt();
		
		for(int i=row-1;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
