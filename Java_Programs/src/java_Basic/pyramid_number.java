package java_Basic;

import java.util.*;

public class pyramid_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows :");
		
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			int num=1;
			
			for(int j=0;j<row-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.printf("%4d",num);
				
				num = num * (i-k) / (k+1);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
