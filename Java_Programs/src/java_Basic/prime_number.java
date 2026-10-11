package java_Basic;

import java.util.*;

public class prime_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any number : ");
		
		int num=sc.nextInt();
		
		Boolean flag = true;
		
		int count=num/2;
		
		if(num == 0 || num == 1)
		{
			System.out.println(num +" is not a Prime number");
		}
		
		else
		{
			for(int i=2;i<=count;i++)
			{
				if(num % i == 0)
				{
					System.out.println(num +" is not a Prime number");
					
					flag = false;
					
					break;
				}
			}
		}
		
		if(flag == true)
		{
			System.out.println(num + " is a Prime number");
		}
		
		sc.close();

	}

}
