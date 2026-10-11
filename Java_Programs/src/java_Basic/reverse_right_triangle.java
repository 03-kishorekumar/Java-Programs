package java_Basic;

import java.util.*;

public class reverse_right_triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row :");
		
		int row = sc.nextInt();
		
		for(int i=row-1;i>=0 ;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
