package java_Basic;

import java.util.*;

public class reversed_right_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
